package utility;

import entity.Flower;
import entity.FlowerToXml;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.FileOutputStream;

/**
 * Created by 1 on 05.12.2014.
 */
public class JaxbMarshal {

    public static void toXml() throws Exception{
        JAXBContext context = JAXBContext.newInstance(FlowerToXml.class);
        Marshaller m = context.createMarshaller();
        long id=500;
        System.out.println("JaxbMarshal begin");
        FlowerToXml flower=new FlowerToXml();
        flower.setName("Kaktys");
        flower.setId(id);
        flower.setOrigin("Mexiko");

        m.marshal(flower, new FileOutputStream("FlowerToXml.xml"));
        m.marshal(flower, System.out);// на консоль
        System.out.println("XML-файл создан");



    }
}
