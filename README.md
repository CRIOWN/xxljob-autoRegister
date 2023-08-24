基于xxl-job和trunks2008 / xxl-job-auto-register做出来的   
可实现xxljob的执行器和任务的自动注册，不用再手动操作  
自动注册的功能已经集成在AutuRegisterDemo模块中
1. 需在配置文件中加如下配置
```yaml
# auto register
# admin用户名
xxl.job.admin.username=admin
# admin 密码
xxl.job.admin.password=111111
# 执行器名称
xxl.job.executor.title=AutoDemo
# 执行器地址类型：0=自动注册、1=手动录入，默认为0
#xxl.job.executor.addressType=0
```
 PS:title字段在数据库中默认varchar(12) 超出会报错，可修改数据库   
2. 提供了一个注解 在任务上添加即可实现任务的自动注册
```java
    @XxlJob("autoDemo2")
    @XxlRegister(cron="0 0 0 ? * 7",
            author = "criown",
            jobDesc = "测试自动注册任务2")
    public void autoDemo2() throws Exception {
        XxlJobHelper.log("Hello World! ");
        System.out.println("autoDemo2");
    }
```
属性分别对应 时间 任务 任务描述
3. 接下来运行
完全不用修改xxljob后台， 通过url调用后台添加用户的接口实现，只需要配置好属性，添加注解即可。
4. 其他项目同理，只需要加上autodemo的文件就行