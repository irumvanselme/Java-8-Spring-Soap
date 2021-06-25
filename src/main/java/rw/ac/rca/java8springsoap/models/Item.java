package rw.ac.rca.java8springsoap.models;

import rw.ac.rca.java8springsoap.models.enums.EItemStatus;

import javax.persistence.*;

@Entity
@Table(name = "items")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    private String name;

    private String code;

    private float price;

    @Enumerated(EnumType.STRING)
    private EItemStatus status;

    @ManyToOne
    private Supplier supplier;

    public Item() {
    }

    public Item(long id, String name, String code, float price, EItemStatus status, Supplier supplier) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.price = price;
        this.status = status;
        this.supplier = supplier;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public EItemStatus getStatus() {
        return status;
    }

    public void setStatus(EItemStatus status) {
        this.status = status;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
}
