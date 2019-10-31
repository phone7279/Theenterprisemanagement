package com.lw.action;

import com.lw.auto_reply.AutoReplyEntity;
import com.lw.demo.AutoReplyDemo;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import javafx.application.Application;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class PL01 extends ActionSupport {

    private String wt = "你好";
    private List list;



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
        ActionContext actionContext = ActionContext.getContext();
        List list = (List) actionContext.getApplication().get("arrayList");
        if(list == null){
            list = new ArrayList();
        }
        list.add(this.wt);
        list.add(send);
        actionContext.getApplication().put("arrayList",list);
        this.list = list;
        return SUCCESS;
    }

}
