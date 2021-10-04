package com.employeeAPI.employeeskills.models;

import org.hibernate.annotations.GenericGenerator;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
    private @Id @GeneratedValue(generator="system-uuid") @GenericGenerator(name="system-uuid",
            strategy = "uuid") String id;
    private String street;
    private String suite;
    private String city;
    private String region;
    private String postal;
    private String country;

    public Address(String street, String suite, String city, String region, String postal, String country) {
        this.street = street;
        this.suite = suite;
        this.city = city;
        this.region = region;
        this.postal = postal;
        this.country = country;
    }

    public Address(){}

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getSuite() {
        return suite;
    }

    public void setSuite(String suite) {
        this.suite = suite;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPostal() {
        return postal;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
