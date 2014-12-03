package utility;


import entity.Flower;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * Created by 1 on 02.12.2014.
 */
public class SaxFlowerHandler extends DefaultHandler{
    private StringBuffer accumulator;
    private String elementName;
    private String attributeDimension;
    private Flower flower;

    @Override
    public void startDocument() throws SAXException {

        accumulator = new StringBuffer();
        flower=new Flower();

        System.out.println("Parsing started");
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("Parsing ended");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        accumulator.setLength(0);
        elementName = qName;
        if (qName.equals("middleSize")||qName.equals("temperature"))
            attributeDimension = (attributes.getLocalName(1).trim()+" = "+attributes.getValue("dimension").trim());


    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {


        if (elementName == null) return;
        String s = accumulator.toString().trim();
        switch (elementName){

            case "id":

                flower.setId(Long.parseLong(s));
                break;
            case "name":
                flower.setName(s);
                break;
            case "soil":
                flower.setSoil(s);
                break;
            case "origin":
                flower.setOrigin(s);
                break;
            case "colourStem":
                flower.setColourStem(s);
                break;
            case "colourLeaf":
                flower.setColourLeaf(s);
                break;
            case "temperature":
                flower.setTemperature(Integer.parseInt(s));
                break;
            case "multiplying":
                flower.setMultiplying(s);
                break;

        }
        elementName = null;


    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        accumulator.append(ch, start, length);
    }
}
