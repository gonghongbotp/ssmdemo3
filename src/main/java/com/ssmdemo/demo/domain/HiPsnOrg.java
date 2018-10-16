package com.ssmdemo.demo.domain;

import java.util.Date;

public class HiPsnOrg {
    private Date begindate;
    private Date creationtime;
    private String creator;
    private String dr;
    private String empforms;
    private Date enddate;
    private String endflag;
    private String indoc_source;
    private String indocflag;
    private Date joinsysdate;
    private String lastflag;
    private Date modifiedtime;
    private String modifier;
    private String orgrelaid;
    private String pk_group;
    private String pk_hrorg;
    private String pk_org;
    private String pk_psndoc;
    private String pk_psnorg;
    private String psntype;
    private Date startpaydate;
    private Date stoppaydate;
    private Date ts;
    private String workage;
    private String corpworkage;
    private String adjustcorpage;

    @Override
    public String toString() {
        return "HiPsnOrg{" +
                "adjustcorpage=" + adjustcorpage +'\'' +
                ", startpaydate='" + startpaydate + '\'' +
                ", indoc_source=" + indoc_source +
                '}';
    }

    public Date getBegindate() {
        return begindate;
    }

    public void setBegindate(Date begindate) {
        this.begindate = begindate;
    }

    public Date getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(Date creationtime) {
        this.creationtime = creationtime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getDr() {
        return dr;
    }

    public void setDr(String dr) {
        this.dr = dr;
    }

    public String getEmpforms() {
        return empforms;
    }

    public void setEmpforms(String empforms) {
        this.empforms = empforms;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public String getEndflag() {
        return endflag;
    }

    public void setEndflag(String endflag) {
        this.endflag = endflag;
    }

    public String getIndoc_source() {
        return indoc_source;
    }

    public void setIndoc_source(String indoc_source) {
        this.indoc_source = indoc_source;
    }

    public String getIndocflag() {
        return indocflag;
    }

    public void setIndocflag(String indocflag) {
        this.indocflag = indocflag;
    }

    public Date getJoinsysdate() {
        return joinsysdate;
    }

    public void setJoinsysdate(Date joinsysdate) {
        this.joinsysdate = joinsysdate;
    }

    public String getLastflag() {
        return lastflag;
    }

    public void setLastflag(String lastflag) {
        this.lastflag = lastflag;
    }

    public Date getModifiedtime() {
        return modifiedtime;
    }

    public void setModifiedtime(Date modifiedtime) {
        this.modifiedtime = modifiedtime;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public String getOrgrelaid() {
        return orgrelaid;
    }

    public void setOrgrelaid(String orgrelaid) {
        this.orgrelaid = orgrelaid;
    }

    public String getPk_group() {
        return pk_group;
    }

    public void setPk_group(String pk_group) {
        this.pk_group = pk_group;
    }

    public String getPk_hrorg() {
        return pk_hrorg;
    }

    public void setPk_hrorg(String pk_hrorg) {
        this.pk_hrorg = pk_hrorg;
    }

    public String getPk_org() {
        return pk_org;
    }

    public void setPk_org(String pk_org) {
        this.pk_org = pk_org;
    }

    public String getPk_psndoc() {
        return pk_psndoc;
    }

    public void setPk_psndoc(String pk_psndoc) {
        this.pk_psndoc = pk_psndoc;
    }

    public String getPk_psnorg() {
        return pk_psnorg;
    }

    public void setPk_psnorg(String pk_psnorg) {
        this.pk_psnorg = pk_psnorg;
    }

    public String getPsntype() {
        return psntype;
    }

    public void setPsntype(String psntype) {
        this.psntype = psntype;
    }

    public Date getStartpaydate() {
        return startpaydate;
    }

    public void setStartpaydate(Date startpaydate) {
        this.startpaydate = startpaydate;
    }

    public Date getStoppaydate() {
        return stoppaydate;
    }

    public void setStoppaydate(Date stoppaydate) {
        this.stoppaydate = stoppaydate;
    }

    public Date getTs() {
        return ts;
    }

    public void setTs(Date ts) {
        this.ts = ts;
    }

    public String getWorkage() {
        return workage;
    }

    public void setWorkage(String workage) {
        this.workage = workage;
    }

    public String getCorpworkage() {
        return corpworkage;
    }

    public void setCorpworkage(String corpworkage) {
        this.corpworkage = corpworkage;
    }

    public String getAdjustcorpage() {
        return adjustcorpage;
    }

    public void setAdjustcorpage(String adjustcorpage) {
        this.adjustcorpage = adjustcorpage;
    }
}
