package utility;

import org.xml.sax.SAXException;

import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.InputStream;

/**
 * Created by 1 on 04.12.2014.
 */
public class XmlValidate {

    public static void check(File schemaLocation,InputStream xmlInput) throws Exception{
        SchemaFactory factory =
                SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
        //File schemaLocation = new File("flower.xml");
        Schema schema = factory.newSchema(schemaLocation);
        Validator validator = schema.newValidator();
        Source source = new StreamSource(xmlInput);

        // 5. Валидация документа
        try {
            validator.validate(source);
            System.out.println(xmlInput + " is valid.");
        }
        catch (SAXException ex) {
            System.out.println(xmlInput + " is not valid because ");
            System.out.println(ex.getMessage());
        }


    }
}
