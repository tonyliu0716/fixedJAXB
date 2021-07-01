package com.example.demo.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "wells")
@XmlAccessorType(XmlAccessType.FIELD)
public class Wells {
    private Well[] well;
    private String xmlns;
    private String xmlnsXsi;
    private String xsiSchemaLocation;
    private String version;

    public Well[] getWell() { return well; }
    public void setWell(Well[] value) { this.well = value; }

    public String getXmlns() { return xmlns; }
    public void setXmlns(String value) { this.xmlns = value; }

    public String getXmlnsXsi() { return xmlnsXsi; }
    public void setXmlnsXsi(String value) { this.xmlnsXsi = value; }

    public String getXsiSchemaLocation() { return xsiSchemaLocation; }
    public void setXsiSchemaLocation(String value) { this.xsiSchemaLocation = value; }

    public String getVersion() { return version; }
    public void setVersion(String value) { this.version = value; }

}
