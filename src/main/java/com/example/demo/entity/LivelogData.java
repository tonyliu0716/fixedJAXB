package com.example.demo.entity;

import com.example.demo.entity.CompanyManEmail;
import com.example.demo.entity.CompanyName;
import com.sun.xml.txw2.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class LivelogData {

    private String jobNumber;
    private String rig;
    private String td;
    private String location;
    private String companyName;
    private String companyManEmail;
    private String companyManName;
    private String companyManPhone;
    private String mwdOperatorEmail;
    private String mwdOperatorName;
    private String mwdOperatorPhone;
    private String toolPusherName;
    private String toolPusherEmail;
    private String toolPusherPhone;
    private String xmlnsGML;
    private String xmlnsXlink;
    private String xmlnsDc;

    public String getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
    }

    public String getRig() {
        return rig;
    }

    public void setRig(String rig) {
        this.rig = rig;
    }

    public String getTd() {
        return td;
    }

    public void setTd(String td) {
        this.td = td;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyManEmail() {
        return companyManEmail;
    }

    public void setCompanyManEmail(String companyManEmail) {
        this.companyManEmail = companyManEmail;
    }

    public String getCompanyManName() {
        return companyManName;
    }

    public void setCompanyManName(String companyManName) {
        this.companyManName = companyManName;
    }

    public String getCompanyManPhone() {
        return companyManPhone;
    }

    public void setCompanyManPhone(String companyManPhone) {
        this.companyManPhone = companyManPhone;
    }

    public String getMwdOperatorEmail() {
        return mwdOperatorEmail;
    }

    public void setMwdOperatorEmail(String mwdOperatorEmail) {
        this.mwdOperatorEmail = mwdOperatorEmail;
    }

    public String getMwdOperatorName() {
        return mwdOperatorName;
    }

    public void setMwdOperatorName(String mwdOperatorName) {
        this.mwdOperatorName = mwdOperatorName;
    }

    public String getMwdOperatorPhone() {
        return mwdOperatorPhone;
    }

    public void setMwdOperatorPhone(String mwdOperatorPhone) {
        this.mwdOperatorPhone = mwdOperatorPhone;
    }

    public String getToolPusherName() {
        return toolPusherName;
    }

    public void setToolPusherName(String toolPusherName) {
        this.toolPusherName = toolPusherName;
    }

    public String getToolPusherEmail() {
        return toolPusherEmail;
    }

    public void setToolPusherEmail(String toolPusherEmail) {
        this.toolPusherEmail = toolPusherEmail;
    }

    public String getToolPusherPhone() {
        return toolPusherPhone;
    }

    public void setToolPusherPhone(String toolPusherPhone) {
        this.toolPusherPhone = toolPusherPhone;
    }

    public String getXmlnsGML() {
        return xmlnsGML;
    }

    public void setXmlnsGML(String xmlnsGML) {
        this.xmlnsGML = xmlnsGML;
    }

    public String getXmlnsXlink() {
        return xmlnsXlink;
    }

    public void setXmlnsXlink(String xmlnsXlink) {
        this.xmlnsXlink = xmlnsXlink;
    }

    public String getXmlnsDc() {
        return xmlnsDc;
    }

    public void setXmlnsDc(String xmlnsDc) {
        this.xmlnsDc = xmlnsDc;
    }
}
