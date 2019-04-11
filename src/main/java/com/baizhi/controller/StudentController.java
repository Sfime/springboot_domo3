package com.baizhi.controller;

import com.baizhi.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("student")
public class StudentController {
    @Autowired
    private StudentDao studentDao;
    @RequestMapping("query")
    public String queryAll(){
        List list = studentDao.selectAll();
        System.out.println(list);
        return "index";
    }
}
