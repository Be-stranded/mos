package com.ywj.mos.web;

import com.alibaba.fastjson.JSON;
import com.ywj.mos.support.dao.MessageTemplateDao;
import com.ywj.mos.support.domian.MessageTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private MessageTemplateDao messageTemplateDao;

    @RequestMapping("/test")
    public String test() {
        return "hello mos";
    }

    @RequestMapping("/findMessageTemplate")
    public String findMessageTemplate() {
        List<MessageTemplate> templateAll = messageTemplateDao.findAll();
        return JSON.toJSONString(templateAll);
    }
}
