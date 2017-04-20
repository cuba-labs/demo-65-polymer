package demo.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.FileDescriptor;

@NamePattern("%s %s|manufacturer,model")
@Table(name = "DEMO_CAR")
@Entity(name = "demo$Car")
public class Car extends StandardEntity {
    private static final long serialVersionUID = 250394601403328780L;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MANUFACTURER_ID")
    protected Manufacturer manufacturer;

    @Column(name = "MODEL")
    protected String model;

    @Column(name = "CAR_TYPE")
    protected String carType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PHOTO_ID")
    protected FileDescriptor photo;

    public void setCarType(CarType carType) {
        this.carType = carType == null ? null : carType.getId();
    }

    public CarType getCarType() {
        return carType == null ? null : CarType.fromId(carType);
    }

    public void setPhoto(FileDescriptor photo) {
        this.photo = photo;
    }

    public FileDescriptor getPhoto() {
        return photo;
    }


    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }


}