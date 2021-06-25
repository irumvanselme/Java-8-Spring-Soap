package rw.ac.rca.java8springsoap.models;

import javax.persistence.*;

@Entity
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    private String name;

    private String code;

    private long max;

    public Course() {
    }

    public Course(long id, String name, String code, long max) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.max = max;
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

    public long getMax() {
        return max;
    }

    public void setMax(long max) {
        this.max = max;
    }
}
