package com.example.auturegisterdemo.service;



import com.example.auturegisterdemo.model.XxlJobGroup;

import java.util.List;

public interface JobGroupService {

    List<XxlJobGroup> getJobGroup();

    boolean autoRegisterGroup();

    boolean preciselyCheck();

}
