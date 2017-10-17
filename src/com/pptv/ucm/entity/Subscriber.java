package com.pptv.ucm.entity;

import java.util.Date;

public class Subscriber {
    private Integer id;

    private String thirdUid;

    private String userAccount;

    private String currentMac;

    private String partnerCode;

    private Integer frAccountType;

    private Date activeTime;

    private Date lastLoginTime;

    private Integer appid;

    private String appver;

    private String userToken;

    private Integer appplt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getThirdUid() {
        return thirdUid;
    }

    public void setThirdUid(String thirdUid) {
        this.thirdUid = thirdUid == null ? null : thirdUid.trim();
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount == null ? null : userAccount.trim();
    }

    public String getCurrentMac() {
        return currentMac;
    }

    public void setCurrentMac(String currentMac) {
        this.currentMac = currentMac == null ? null : currentMac.trim();
    }

    public String getPartnerCode() {
        return partnerCode;
    }

    public void setPartnerCode(String partnerCode) {
        this.partnerCode = partnerCode == null ? null : partnerCode.trim();
    }

    public Integer getFrAccountType() {
        return frAccountType;
    }

    public void setFrAccountType(Integer frAccountType) {
        this.frAccountType = frAccountType;
    }

    public Date getActiveTime() {
        return activeTime;
    }

    public void setActiveTime(Date activeTime) {
        this.activeTime = activeTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Integer getAppid() {
        return appid;
    }

    public void setAppid(Integer appid) {
        this.appid = appid;
    }

    public String getAppver() {
        return appver;
    }

    public void setAppver(String appver) {
        this.appver = appver == null ? null : appver.trim();
    }

    public String getUserToken() {
        return userToken;
    }

    public void setUserToken(String userToken) {
        this.userToken = userToken == null ? null : userToken.trim();
    }

    public Integer getAppplt() {
        return appplt;
    }

    public void setAppplt(Integer appplt) {
        this.appplt = appplt;
    }
}