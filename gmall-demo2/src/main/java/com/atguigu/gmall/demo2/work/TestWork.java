package com.atguigu.gmall.demo2.work;

import com.ld.common.consts.annotation.BeeWork;
import com.ld.common.consts.response.BeeResponse;


@BeeWork(work = "testWor")
public class TestWork {

    public BeeResponse getWork(){
        BeeResponse beeResponse = new BeeResponse();
        beeResponse.code=1;
        beeResponse.msg="h";
        return beeResponse;
    }
}
