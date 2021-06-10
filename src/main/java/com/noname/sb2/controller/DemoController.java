package com.noname.sb2.controller;

import com.noname.sb2.service.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author ：liwuming
 * @date ：Created in 2021/5/31 17:55
 * @description：
 * @modified By：
 * @version:
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Resource
    private TestService testService;

    @RequestMapping("test")
    public String test() {
        return testService.test();
    }
}
