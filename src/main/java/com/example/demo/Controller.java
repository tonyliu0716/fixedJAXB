package com.example.demo;

import com.example.demo.entity.Wells;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

@RestController
public class Controller {

    @GetMapping("/fuck")
    public Wells getObject() {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
                "\n" +
                "<wells  xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://www.witsml.org/schemas/1series http://www.witsml.org/schemas/1series/obj_well.xsd\" version=\"1.4.1.1\">\n" +
                "<well uid=\"9cdf8f38-42f3-4a30-89eb-78b56ae569cb\">\n" +
                "\n" +
                "    <name>PGE DOS Z 2H-ST1</name>\n" +
                "\n" +
                "    <nameLegal>PGE DOS Z 2H-ST1</nameLegal>\n" +
                "\n" +
                "    <field>Eagleford</field>\n" +
                "\n" +
                "    <country>USA</country>\n" +
                "\n" +
                "    <state>TX</state>\n" +
                "\n" +
                "    <county>Webb</county>\n" +
                "\n" +
                "    <region/>\n" +
                "\n" +
                "    <operator>Chesapeake Energy</operator>\n" +
                "\n" +
                "    <operatorDiv/>\n" +
                "\n" +
                "    <numAPI>42-479-44302</numAPI>\n" +
                "\n" +
                "    <statusWell>unknown</statusWell>\n" +
                "\n" +
                "    <purposeWell>unknown</purposeWell>\n" +
                "\n" +
                "    <wellheadElevation uom=\"ft\">0</wellheadElevation>\n" +
                "\n" +
                "    <waterDepth uom=\"ft\">0</waterDepth>\n" +
                "\n" +
                "    <commonData>\n" +
                "\n" +
                "      <comments/>\n" +
                "\n" +
                "    </commonData>\n" +
                "\n" +
                "    <customData>\n" +
                "      <livelogData xmlns:gml=\"http://www.opengis.net/gml/3.2\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" xmlns:dc=\"http://purl.org/dc/terms/\">\n" +
                "        <jobNumber xmlns=\"\">MSCO-82719</jobNumber>\n" +
                "        <rig xmlns=\"\">Patterson 596</rig>\n" +
                "        <td xmlns=\"\">0</td>\n" +
                "        <location xmlns=\"\">Webb County</location>\n" +
                "        <companyName xmlns=\"\">MPower</companyName>\n" +
                "        <companyManEmail xmlns=\"\">\n" +
                "        </companyManEmail>\n" +
                "        <companyManName xmlns=\"\">\n" +
                "        </companyManName>\n" +
                "        <companyManPhone xmlns=\"\">\n" +
                "        </companyManPhone>\n" +
                "        <mwdOperatorEmail xmlns=\"\">\n" +
                "        </mwdOperatorEmail>\n" +
                "        <mwdOperatorName xmlns=\"\">\n" +
                "        </mwdOperatorName>\n" +
                "        <mwdOperatorPhone xmlns=\"\">\n" +
                "        </mwdOperatorPhone>\n" +
                "        <toolPusherName xmlns=\"\">\n" +
                "        </toolPusherName>\n" +
                "        <toolPusherEmail xmlns=\"\">\n" +
                "        </toolPusherEmail>\n" +
                "        <toolPusherPhone xmlns=\"\">\n" +
                "        </toolPusherPhone>\n" +
                "      </livelogData>\n" +
                "    </customData>\n" +
                "\n" +
                "  </well>\n" +
                "<well uid=\"feed77c9-6c87-470b-90a6-e44ca41decb8\">\n" +
                "\n" +
                "    <name>HALEY 38-35-29G 403H</name>\n" +
                "\n" +
                "    <nameLegal>HALEY 38-35-29G 403H</nameLegal>\n" +
                "\n" +
                "    <field>Wolfcamp</field>\n" +
                "\n" +
                "    <country>USA</country>\n" +
                "\n" +
                "    <state>TX</state>\n" +
                "\n" +
                "    <county>Loving</county>\n" +
                "\n" +
                "    <region/>\n" +
                "\n" +
                "    <operator>WPX Energy</operator>\n" +
                "\n" +
                "    <operatorDiv/>\n" +
                "\n" +
                "    <numAPI>42-301-35278</numAPI>\n" +
                "\n" +
                "    <statusWell>unknown</statusWell>\n" +
                "\n" +
                "    <purposeWell>unknown</purposeWell>\n" +
                "\n" +
                "    <wellheadElevation uom=\"ft\">0</wellheadElevation>\n" +
                "\n" +
                "    <waterDepth uom=\"ft\">0</waterDepth>\n" +
                "\n" +
                "    <wellLocation>\n" +
                "\n" +
                "      <latitude uom=\"dega\">31.75</latitude>\n" +
                "\n" +
                "      <longitude uom=\"dega\">-103.400816666667</longitude>\n" +
                "\n" +
                "    </wellLocation>\n" +
                "\n" +
                "    <commonData>\n" +
                "\n" +
                "      <comments/>\n" +
                "\n" +
                "    </commonData>\n" +
                "\n" +
                "    <customData>\n" +
                "      <livelogData xmlns:gml=\"http://www.opengis.net/gml/3.2\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" xmlns:dc=\"http://purl.org/dc/terms/\">\n" +
                "        <jobNumber xmlns=\"\">MSMO-81193</jobNumber>\n" +
                "        <rig xmlns=\"\">H&amp;P 314</rig>\n" +
                "        <td xmlns=\"\">0</td>\n" +
                "        <location xmlns=\"\">Kermit</location>\n" +
                "        <companyName xmlns=\"\">MS Directional</companyName>\n" +
                "        <companyManEmail xmlns=\"\">\n" +
                "        </companyManEmail>\n" +
                "        <companyManName xmlns=\"\">\n" +
                "        </companyManName>\n" +
                "        <companyManPhone xmlns=\"\">\n" +
                "        </companyManPhone>\n" +
                "        <mwdOperatorEmail xmlns=\"\">\n" +
                "        </mwdOperatorEmail>\n" +
                "        <mwdOperatorName xmlns=\"\">\n" +
                "        </mwdOperatorName>\n" +
                "        <mwdOperatorPhone xmlns=\"\">\n" +
                "        </mwdOperatorPhone>\n" +
                "        <toolPusherName xmlns=\"\">\n" +
                "        </toolPusherName>\n" +
                "        <toolPusherEmail xmlns=\"\">\n" +
                "        </toolPusherEmail>\n" +
                "        <toolPusherPhone xmlns=\"\">\n" +
                "        </toolPusherPhone>\n" +
                "      </livelogData>\n" +
                "    </customData>\n" +
                "\n" +
                "  </well>\n" +
                "</wells>";

        StringReader reader = new StringReader(xml);
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Wells.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Wells wrap = (Wells) jaxbUnmarshaller.unmarshal(reader);
            return wrap;
        } catch (JAXBException e) {
            e.printStackTrace();
        }


        return null;
    }

}
