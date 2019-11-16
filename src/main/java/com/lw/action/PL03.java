package com.lw.action;

import com.lw.demo.FankuiDemo;
import com.lw.fankui.FankuiEntity;
import com.opensymphony.xwork2.ActionSupport;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

public class PL03 extends ActionSupport {

    private String name = null;
    private String email = null;
    private String phone = null;
    private String message = null;
    private String jEmail = null;
    private String jMessage = null;
    private FankuiDemo fankuiDemo = null;
    private List<FankuiEntity> list;
    private int str1 = 1;
    private String str2 = null;

    public int getStr1() {
        return str1;
    }

    public void setStr1(int str1) {
        this.str1 = str1;
    }

    public String getjEmail() {
        return jEmail;
    }

    public void setjEmail(String jEmail) {
        this.jEmail = jEmail;
    }

    public String getjMessage() {
        return jMessage;
    }

    public void setjMessage(String jMessage) {
        this.jMessage = jMessage;
    }

    public String getStr2() {
        return str2;
    }

    public void setStr2(String str2) {
        this.str2 = str2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<FankuiEntity> getList() {
        return list;
    }

    public void setList(List<FankuiEntity> list) {
        this.list = list;
    }

    public String execute() {
        fankuiDemo = new FankuiDemo();
        boolean b = fankuiDemo.insert(name, email, phone, message);
        fankuiDemo = new FankuiDemo();
        List<FankuiEntity> list1 = fankuiDemo.selected();
        if (list1.size() == 0 || list1 == null) {
            list1 = new ArrayList();
        }
        this.list = list1;
        return SUCCESS;
    }

    public String selected() {
        fankuiDemo = new FankuiDemo();
        //        if (list1.size() == 0 || list1 == null) {
//            list1 = new ArrayList();
//        }
        this.list = fankuiDemo.selected();
        return "selected";
    }

    public String update() {
        fankuiDemo = new FankuiDemo();
        fankuiDemo.update(str1, jEmail, jMessage);
        return SUCCESS;
    }

    public String go() {
        return SUCCESS;
    }

}
