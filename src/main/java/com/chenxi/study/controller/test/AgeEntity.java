package com.chenxi.study.controller.test;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author chenxi
 * @mail xi1.chen@changhong.com
 * @Date 17-6-29
 */
@Entity
@Table(name = "age")
public class AgeEntity {
    @Id
    private int id;
    private int value;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
