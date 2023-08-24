package com.example.auturegisterdemo.job;

import com.example.auturegisterdemo.annotation.XxlRegister;
import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;

import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class Simplejob {

    /**
     * 1、简单任务示例（Bean模式）
     */
    @XxlJob("autoDemo1")
    @XxlRegister(cron="0 0 0 ? * 6",
    author = "criown",
    jobDesc = "测试自动注册任务")
    public void autoDemo1() throws Exception {
        XxlJobHelper.log("XXL-JOB, Hello World.");
        System.out.println("AutoRegister");
        for (int i = 0; i < 5; i++) {
            XxlJobHelper.log("beat at:" + i);
            TimeUnit.SECONDS.sleep(2);
        }
        // default success
    }

    @XxlJob("autoDemo2")
    @XxlRegister(cron="0 0 0 ? * 7",
            author = "criown",
            jobDesc = "测试自动注册任务2")
    public void autoDemo2() throws Exception {
        XxlJobHelper.log("Hello World! ");
        System.out.println("autoDemo2");
        // default success
    }

    @XxlJob("autoDemo3")
    @XxlRegister(cron="0 0 0 ? * 7",
            author = "criown",
            jobDesc = "自动注册-二次添加任务")
    public void autoDemo3() throws Exception {
        XxlJobHelper.log("Hello World! autoDemo3");
        System.out.println("autoDemo3");
        // default success
    }
}
