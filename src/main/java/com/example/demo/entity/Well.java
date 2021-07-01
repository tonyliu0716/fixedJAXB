package com.example.demo.entity;

import javax.xml.bind.annotation.XmlAttribute;
import java.util.UUID;

public class Well {

    private String name;
    private String nameLegal;
    private String field;
    private String country;
    private String state;
    private String county;
    private String region;
    private String operator;
    private String operatorDiv;
    private String numAPI;
    private String statusWell;
    private String purposeWell;
    private WaterDepth wellheadElevation;
    private WaterDepth waterDepth;
    private CommonData commonData;
    private CustomData customData;
    private String uid;
    private WellLocation wellLocation;

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public String getNameLegal() { return nameLegal; }
    public void setNameLegal(String value) { this.nameLegal = value; }

    public String getField() { return field; }
    public void setField(String value) { this.field = value; }

    public String getCountry() { return country; }
    public void setCountry(String value) { this.country = value; }

    public String getState() { return state; }
    public void setState(String value) { this.state = value; }

    public String getCounty() { return county; }
    public void setCounty(String value) { this.county = value; }

    public String getRegion() { return region; }
    public void setRegion(String value) { this.region = value; }

    public String getOperator() { return operator; }
    public void setOperator(String value) { this.operator = value; }

    public String getOperatorDiv() { return operatorDiv; }
    public void setOperatorDiv(String value) { this.operatorDiv = value; }

    public String getNumAPI() { return numAPI; }
    public void setNumAPI(String value) { this.numAPI = value; }

    public String getStatusWell() { return statusWell; }
    public void setStatusWell(String value) { this.statusWell = value; }

    public String getPurposeWell() { return purposeWell; }
    public void setPurposeWell(String value) { this.purposeWell = value; }

    public WaterDepth getWellheadElevation() { return wellheadElevation; }
    public void setWellheadElevation(WaterDepth value) { this.wellheadElevation = value; }

    public WaterDepth getWaterDepth() { return waterDepth; }
    public void setWaterDepth(WaterDepth value) { this.waterDepth = value; }

    public CommonData getCommonData() { return commonData; }
    public void setCommonData(CommonData value) { this.commonData = value; }

    public CustomData getCustomData() { return customData; }
    public void setCustomData(CustomData value) { this.customData = value; }

    public String getUid() { return uid; }

    @XmlAttribute
    public void setUid(String value) { this.uid = value; }

    public WellLocation getWellLocation() { return wellLocation; }
    public void setWellLocation(WellLocation value) { this.wellLocation = value; }

}
