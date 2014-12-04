import entity.Flower;
import utility.SaxFlowerHandler;
import utility.SaxParserRunner;

import java.io.InputStream;

/**
 * Created by 1 on 04.12.2014.
 */
public class Test {


    public static void main(String[] args) throws Exception{

        InputStream xmlInput = SaxParserRunner.class.getClassLoader().getResourceAsStream("flower.xml");

        SaxParserRunner saxParserRunner=new SaxParserRunner();
        Flower flower=saxParserRunner.parse(xmlInput);


        System.out.println(flower);

    }

    /*
    InputStream    xmlInput  =
            new FileInputStream("data\\sax-example.xml");
            */
}
