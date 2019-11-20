package com.lw.action;

import com.lw.demo.TieZiDemo;
import com.lw.entity.TieziEntity;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

public class PL03 extends ActionSupport {

    private String title, name, message, rName;
    private int id, rid , sid;
    private List<TieziEntity> list;
    private TieZiDemo tieZiDemo;
    private TieziEntity tieziEntity;

    public String selectedTop() {
        tieZiDemo = new TieZiDemo();
        list = tieZiDemo.selectedTop();
        return SUCCESS;
    }

    public String selectedLast() {
        tieziEntity = new TieziEntity();
        tieZiDemo = new TieZiDemo();
        tieziEntity = tieZiDemo.selectedTop(id);
        list = tieZiDemo.selectedLast(id);
        return SUCCESS;
    }

    public String insertTop() {
        tieZiDemo = new TieZiDemo();
        tieZiDemo.insertTop(title, name, message);
        return SUCCESS;
    }

    public String go() {
        return SUCCESS;
    }

    public String go2() {
        return SUCCESS;
    }

    public String insertLast() {
        tieZiDemo = new TieZiDemo();
        tieZiDemo.insertLast(name, message, id);
        selectedLast();
        return SUCCESS;
    }

    public String insertLast2() {
        tieZiDemo = new TieZiDemo();
        tieZiDemo.insertLast2(name, message, id, rName);
        selectedLast();
        return SUCCESS;
    }

    public String delete() {
        tieZiDemo = new TieZiDemo();
        tieZiDemo.delete(sid);
        selectedLast();
        return SUCCESS;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName;
    }

    public TieziEntity getTieziEntity() {
        return tieziEntity;
    }

    public void setTieziEntity(TieziEntity tieziEntity) {
        this.tieziEntity = tieziEntity;
    }

    public List<TieziEntity> getList() {
        return list;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setList(List<TieziEntity> list) {
        this.list = list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
