package com.chenxi.study.controller.test;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author chenxi
 * @mail xi1.chen@changhong.com
 * @Date 17-6-29
 */
@Service
public class TestService {

    @Autowired
    private AgeDao ageDao;

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED, isolation = Isolation.REPEATABLE_READ)
    public void test()
    {
        AgeEntity ageEntity=ageDao.getOne(1);
        System.out.println(JSONObject.toJSONString(ageEntity));
        System.out.println(ageEntity);
//        ageEntity=ageDao.getOne(1);
//        System.out.println(JSONObject.toJSONString(ageEntity));
//        System.out.println(ageEntity);
    }
}
