package utility;

import entity.Flower;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.InputStream;

/**
 * Created by 1 on 04.12.2014.
 */
public class SaxParserRunner {

    public Flower parse(InputStream xmlInput) throws Exception{

    SAXParserFactory factory = SAXParserFactory.newInstance();
    SAXParser      saxParser = factory.newSAXParser();
    SaxFlowerHandler handler   = new SaxFlowerHandler();
    saxParser.parse(xmlInput, handler);

    return handler.getFlower();}



}



