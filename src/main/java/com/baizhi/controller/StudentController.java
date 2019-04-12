package com.baizhi.controller;

import com.baizhi.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("student")
public class StudentController {
    @Autowired
    private StudentDao studentDao;
    @RequestMapping("query")
    public @ResponseBody
    Map queryAll(){
        Map map=new HashMap();
        List list = studentDao.selectAll();
        map.put("list",list);
        System.out.println(list);
        return map;
    }
}
