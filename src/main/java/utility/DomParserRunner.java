package utility;

import entity.Flower;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;
import java.io.InputStream;

/**
 * Created by 1 on 04.12.2014.
 */
public class DomParserRunner {

    public Flower parse(InputStream xmlInput) throws Exception{

        Document document;
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = factory.newDocumentBuilder();
        document = documentBuilder.parse(xmlInput);
        Flower flower=new Flower();
        String s=null;
        Element root = document.getDocumentElement();
        NodeList flowerList = root.getElementsByTagName("flower");
        for (int i = 0; i < flowerList.getLength(); i++) {
            Element flowerElement = (Element) flowerList.item(i);
       String t=flowerElement.getTagName();

                    flower.setId(Long.parseLong(getElementTextContent(flowerElement, "id")));
                    flower.setName(getElementTextContent(flowerElement, "name"));
                    flower.setSoil(getElementTextContent(flowerElement, "soil"));
                    flower.setOrigin(getElementTextContent(flowerElement, "origin"));
                    Element growingTipsElement = (Element) flowerElement.getElementsByTagName(
                            "growingTips").item(0);
                    flower.setTemperature(Integer.parseInt(getElementTextContent(growingTipsElement, "temperature")));
                    flower.setMultiplying(getElementTextContent(flowerElement, "multiplying"));

            }
        

        return flower;
    }


    private static String getElementTextContent(Element element, String elementName) {
        NodeList nList = element.getElementsByTagName(elementName);
        Node node = nList.item(0);
        String res = node.getTextContent();
        return res;
    }

}
