import entity.Flower;
import utility.*;

import java.io.File;
import java.io.InputStream;
import java.util.ResourceBundle;

/**
 * Created by 1 on 04.12.2014.
 */
public class Test {


    public static void main(String[] args) throws Exception{

        InputStream xmlInput1 = SaxParserRunner.class.getClassLoader().getResourceAsStream("flower.xml");

        SaxParserRunner saxParserRunner=new SaxParserRunner();
        Flower flower1=saxParserRunner.parse(xmlInput1);
        System.out.println(flower1);


        InputStream xmlInput2 = SaxParserRunner.class.getClassLoader().getResourceAsStream("flower.xml");
        StaxParserRunner staxParserRunner=new StaxParserRunner();
        Flower flower2=staxParserRunner.parse(xmlInput2);
        System.out.println(flower2);

        InputStream xmlInput3 = SaxParserRunner.class.getClassLoader().getResourceAsStream("flower.xml");
        DomParserRunner domParserRunner=new DomParserRunner();
        Flower flower3=domParserRunner.parse(xmlInput3);
        System.out.println(flower3);

        InputStream xmlInput4 = SaxParserRunner.class.getClassLoader().getResourceAsStream("flower.xml");
        JaxbParserRunner jaxbParserRunner=new JaxbParserRunner();
        Flower flower4=domParserRunner.parse(xmlInput4);
        System.out.println("Jaxb="+flower4);


        JaxbMarshal.toXml();

        //ResourceBundle resourceBundle=ResourceBundle.getBundle("flower_scheme.xsd");

        //ClassLoader classLoader = getClass().getClassLoader();
        File scheme=new File(SaxParserRunner.class.getClassLoader().getResource("flower_scheme.xsd").getFile());


        InputStream xmlInput5 = SaxParserRunner.class.getClassLoader().getResourceAsStream("flower.xml");
        XmlValidate.check(scheme,xmlInput5);

    }

    /*
    InputStream    xmlInput  =
            new FileInputStream("data\\sax-example.xml");
            */
}
