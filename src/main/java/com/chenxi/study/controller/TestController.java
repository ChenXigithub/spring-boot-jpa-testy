package com.chenxi.study.controller;

import com.alibaba.fastjson.JSONObject;
import com.chenxi.study.controller.test.AgeDao;
import com.chenxi.study.controller.test.AgeEntity;
import com.chenxi.study.controller.test.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by admin on 17-1-23.
 */
@Controller
public class TestController {

    @Autowired
    private AgeDao ageDao;

    @Autowired
    private TestService testService;

    @RequestMapping("/test")
    @ResponseBody
    public String test()
    {
        AgeEntity ageEntity=ageDao.getOne(1);
        System.out.println(JSONObject.toJSONString(ageEntity));
        System.out.println(ageEntity);
        testService.test();
        return "test";
    }

}
