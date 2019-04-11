package com.baizhi;

import com.baizhi.dao.StudentDao;
import com.baizhi.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootDomo3ApplicationTests {
    @Autowired
    private StudentDao studentDao;
    @Test
    public void selectAll() {
        List<Student> students = studentDao.selectAll();
        for (Student student : students) {
            System.out.println(student);
        }
    }

    @Test
    public void select() {
        List<Student> select = studentDao.select(new Student());
        for (Student student : select) {
            System.out.println(select);
        }
    }

    @Test
    public void selectOne() {
        Student student=new Student();
        student.setId(1);
        Student student1 = studentDao.selectOne(student);
        System.out.println(student1);
    }

    @Test
    public void updateByPrimaryKey() {
        Student student = new Student();
        student.setId(1);
        student.setName("hrhr");
        student.setStudentScore(44.0);
        studentDao.updateByPrimaryKey(student);
        System.out.println(student);
    }

    @Test
    public void updateByPrimaryKeySelective() {
        Student student = new Student();
        student.setId(1);
        student.setName("hrhr");
        studentDao.updateByPrimaryKeySelective(student);
    }
}



