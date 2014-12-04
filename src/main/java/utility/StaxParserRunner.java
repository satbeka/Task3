package utility;

import entity.Flower;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;
import java.io.InputStream;

/**
 * Created by 1 on 04.12.2014.
 */
public class StaxParserRunner {

    public Flower parse(InputStream xmlInput) throws Exception{

        XMLInputFactory inputFactory = XMLInputFactory.newInstance();
        XMLStreamReader reader=inputFactory.createXMLStreamReader(xmlInput);


        



        String  name;
        Flower flower=new Flower();
        while (reader.hasNext()) {
            int eventType  = reader.next();

            switch (eventType ) {
                case XMLStreamConstants.START_ELEMENT:
                    name = reader.getLocalName();
                    String attr=reader.getAttributeValue(0);
                    if (attr!=null){System.out.println("attr="+attr);}

                    String s=null;

                    switch (name){

                        case "id":
                            s = reader.getElementText();
                            flower.setId(Long.parseLong(s));
                            break;
                        case "name":
                            s = reader.getElementText();
                            flower.setName(s);
                            break;
                        case "soil":
                            s = reader.getElementText();
                            flower.setSoil(s);
                            break;
                        case "origin":
                            s = reader.getElementText();
                            flower.setOrigin(s);
                            break;
                        case "colourStem":
                            s = reader.getElementText();
                            flower.setColourStem(s);
                            break;
                        case "colourLeaf":
                            s = reader.getElementText();
                            flower.setColourLeaf(s);
                            break;
                        case "temperature":
                            s = reader.getElementText();
                            flower.setTemperature(Integer.parseInt(s));

                            break;
                        case "multiplying":
                            s = reader.getElementText();
                            flower.setMultiplying(s);
                            break;

                    }

                    break;
                /*
                case XMLStreamConstants.ATTRIBUTE:
                    String attr=reader.getAttributeValue(1);
                    System.out.println("attr="+attr);
                    break;
                */
                case XMLStreamConstants.END_ELEMENT:
                    break;

                case XMLStreamConstants.CHARACTERS:
                    //...
                    break;
                case XMLStreamConstants.END_DOCUMENT:
                    //...
                    break;
            }
        }
        return flower;
    }

}
