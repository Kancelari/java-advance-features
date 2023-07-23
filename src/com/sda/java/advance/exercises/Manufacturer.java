package com.sda.java.advance.exercises;

import java.io.Serializable;
import java.util.Objects;

public class Manufacturer implements Serializable {

//    fields: name, year of establishment, country

    private String name;
    private Integer yearEstablishment;
    private String country;

    public Manufacturer(String name, Integer yearEstablishment, String country) {
        this.name = name;
        this.yearEstablishment = yearEstablishment;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYearEstablishment() {
        return yearEstablishment;
    }

    public void setYearEstablishment(Integer yearEstablishment) {
        this.yearEstablishment = yearEstablishment;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manufacturer that = (Manufacturer) o;
        return Objects.equals(name, that.name) && Objects.equals(yearEstablishment, that.yearEstablishment) && Objects.equals(country, that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearEstablishment, country);
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "name='" + name + '\'' +
                ", yearEstablishment=" + yearEstablishment +
                ", country='" + country + '\'' +
                '}';
    }
}
