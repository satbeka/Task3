package entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Comparator;

/**
 * Created by 1 on 05.12.2014.
 */
@XmlRootElement
public class FlowerToXml {

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    private Long id;
        private String name;
        private String origin;


        public FlowerToXml(){}
}
