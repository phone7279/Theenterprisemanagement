package com.lw.action;

import com.lw.demo.DingDanDemo;
import com.lw.demo.FankuiDemo;
import com.lw.fankui.FankuiEntity;
import com.opensymphony.xwork2.ActionSupport;

import java.awt.*;
import java.util.ArrayList;

public class PL02 extends ActionSupport {

    public String execute() {
        DingDanDemo dingDanDemo = new DingDanDemo();
        List list = (List)dingDanDemo.selected();
        return SUCCESS;
    }
}
