package rw.ac.rca.java8springsoap.models;

import javax.persistence.*;

@Entity
@Table(name = "suppliers")
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    public String names;

    public String email;

    public String mobile;

    public Supplier() {
    }

    public Supplier(long id, String names, String email, String mobile) {
        this.id = id;
        this.names = names;
        this.email = email;
        this.mobile = mobile;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
