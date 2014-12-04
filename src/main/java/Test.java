import entity.Flower;
import utility.SaxFlowerHandler;
import utility.SaxParserRunner;
import utility.StaxParserRunner;

import java.io.InputStream;

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

    }

    /*
    InputStream    xmlInput  =
            new FileInputStream("data\\sax-example.xml");
            */
}
