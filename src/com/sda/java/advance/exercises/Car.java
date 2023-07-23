package com.sda.java.advance.exercises;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Car implements Serializable {
//    contain fields: name, model, price, year of manufacture, manufacturer list
//            (Manufacturer), and engine type (represented as the enum class, e.g. V12, V8, V6, S6, S4, S3).

    private String name;
    private String model;

    private Integer yearManufacture;

    private Double price;

    private List<Manufacturer> manufacturers;

    private  EngineType engineType ;

    public Car(String name, String model, Integer yearManufacture, Double price, List<Manufacturer> manufacturers, EngineType engineType) {
        this.name = name;
        this.model = model;
        this.yearManufacture = yearManufacture;
        this.price = price;
        this.manufacturers = manufacturers;
        this.engineType = engineType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name)
                && Objects.equals(model, car.model)
                && Objects.equals(yearManufacture, car.yearManufacture)
                && Objects.equals(price, car.price)
                && Objects.equals(manufacturers, car.manufacturers)
                && engineType == car.engineType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, yearManufacture, price, manufacturers, engineType);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", yearManufacture=" + yearManufacture +
                ", price=" + price +
                ", manufacturers=" + manufacturers +
                ", engineType=" + engineType +
                '}';
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYearManufacture() {
        return yearManufacture;
    }

    public void setYearManufacture(Integer yearManufacture) {
        this.yearManufacture = yearManufacture;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public List<Manufacturer> getManufacturers() {
        return manufacturers;
    }

    public void setManufacturers(List<Manufacturer> manufacturers) {
        this.manufacturers = manufacturers;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }
}
