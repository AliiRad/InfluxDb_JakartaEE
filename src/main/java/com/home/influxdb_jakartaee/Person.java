package com.home.influxdb_jakartaee;


import com.influxdb.annotations.Measurement;

@Measurement(name = "person")
public class Person {
    private Long id;
    private String name;
    private String family;

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

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }
}
