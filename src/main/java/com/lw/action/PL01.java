package com.lw.action;

import com.lw.demo.AutoReplyDemo;
import com.lw.demo.RecommendDemo;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class PL01 extends ActionSupport{
    private String wt;
    private List list;
    private String st;

    public String getSt() {
        return st;
    }

    public void setSt(String st) {
        this.st = st;
    }

    public String getWt() {
        return wt;
    }

    public void setWt(String wt) {
        this.wt = wt;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public String execute() {
        AutoReplyDemo autoReplyDemo = new AutoReplyDemo();
        String send = autoReplyDemo.selected(this.wt);
        List list = (List) ActionContext.getContext().getSession().get("List");
        if (list == null) {
            list = new ArrayList();
        }
        String s = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm"));
        list.add(s);
        list.add(this.wt);
        list.add(s);
        list.add(send);
        ActionContext.getContext().getSession().put("List",list);
        this.list = list;
        return SUCCESS;
    }

    public String selected() {
        List list = (List) ActionContext.getContext().getSession().get("List");
        if (list == null) {
            list = new ArrayList();
        }
        this.list = list;
        RecommendDemo recommendDemo = new RecommendDemo();
        this.st = "小E亲切地跟你打了个招呼：" + recommendDemo.RD();
        return SUCCESS;
    }

}
