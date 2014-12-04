package utility;

import entity.Flower;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import java.io.InputStream;

/**
 * Created by 1 on 04.12.2014.
 */
public class JaxbParserRunner {
    public Flower parse(InputStream xmlInput) throws Exception{

        JAXBContext jaxbContext = JAXBContext.newInstance(Flower.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        return (Flower) unmarshaller.unmarshal(xmlInput);}
}
