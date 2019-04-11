package com.baizhi.entity;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.Date;

@Data
@Table(name = "t_student")
public class Student implements Serializable{
    @KeySql(useGeneratedKeys = true)
    private Integer id;
    private String name;
    @Column(name = "score")
    private Double studentScore;
    @Transient
    private Date time;
}
