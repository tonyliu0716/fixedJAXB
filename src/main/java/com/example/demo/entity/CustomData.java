package com.example.demo.entity;

import com.sun.xml.txw2.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlElement(value = "customData")
@XmlAccessorType(XmlAccessType.FIELD)
public class CustomData {

    LivelogData livelogData;

    public LivelogData getLivelogData() { return livelogData; }
    public void setLivelogData(LivelogData value) { this.livelogData = value; }
}
