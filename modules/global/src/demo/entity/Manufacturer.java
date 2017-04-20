package demo.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|name")
@Table(name = "DEMO_MANUFACTURER")
@Entity(name = "demo$Manufacturer")
public class Manufacturer extends StandardEntity {
    private static final long serialVersionUID = 992535676981601991L;

    @Column(name = "NAME")
    protected String name;

    @Column(name = "COUNTRY")
    protected String country;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }


}