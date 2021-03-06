/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogspot.na5cent.primefaces.controller;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author anonymous
 */
@ManagedBean
@SessionScoped
public class SessionScopeCtrl implements Serializable {

    private long currentTimestamp;

    @PostConstruct
    public void postConstruct() {
        currentTimestamp = new Date().getTime();
    }

    public long getCurrentTimestamp() {
        return currentTimestamp;
    }

}
