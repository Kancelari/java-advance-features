package com.sda.java.advance.exercises.exercise26;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise26 {

    public static List<Model> getAllModels(List<Manufacturer> manufacturers){
//       return manufacturers.stream().map(m -> m.models).flatMap(Collection::stream).collect(Collectors.toList());
       return manufacturers.stream()
               .map(m -> m.models).
               flatMap( (List<Model>e) -> e.stream())
               .collect(Collectors.toList());
    }

    public static List<Car> getAllCar(List<Manufacturer> manufacturers){

        return manufacturers.stream()
                .map(m -> m.models)
                .flatMap( (List<Model>e) -> e.stream())
                .map(e->e.cars)
                .flatMap((List<Car>c)->c.stream())
                .collect(Collectors.toList());
    }

    public static List<String> getAllManufacturerNames(List<Manufacturer> manufacturers){
        return manufacturers.stream().map(m->m.name).collect(Collectors.toList());
    }

    public static List<Integer> getAllManufacturerYears(List<Manufacturer> manufacturers){
        return manufacturers.stream().map(m->m.yearOfCreation).collect(Collectors.toList());
    }


    public static  List<String> getAllModelNames(List<Manufacturer> manufacturers){
        return  getAllModels(manufacturers).stream().map(m->m.name).collect(Collectors.toList());
    }

    public static  List<Integer> getAllModelYear(List<Manufacturer> manufacturers){
        return  getAllModels(manufacturers).stream().map(m->m.productionStartYear).collect(Collectors.toList());
    }

    public static  List<String> getAllCarsName(List<Manufacturer> manufacturers){
        return  getAllCar(manufacturers).stream().map(m->m.name).collect(Collectors.toList());
    }

    public static  List<Model> getEvenModel(List<Manufacturer> manufacturers){
        return  getAllModels(manufacturers).stream().filter(m->m.productionStartYear%2==0).collect(Collectors.toList());
    }

    public static  List<Car> getEvenManufactCars(List<Manufacturer> manufacturers){
        manufacturers =  manufacturers.stream().filter(m->m.yearOfCreation%2==0).collect(Collectors.toList());
        return  getAllCar(manufacturers);
    }


    private static List<Car> lastPoint(List<Manufacturer> manufacturers){
        manufacturers =  manufacturers.stream().filter(m -> m.yearOfCreation<1919).collect(Collectors.toList());
        List<Model> models =  getAllModels(manufacturers).stream().filter(m -> m.productionStartYear>2019).collect(Collectors.toList());
        return models.stream()
                .map(m -> m.cars).
                flatMap(Collection::stream)
                .filter(c-> c.carType.equals(CarType.SEDAN))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        List<Model> modelList1 =  new ArrayList<>(List
                .of(new Model("E calss", 2021,
                        List.of(new Car("w211", "sth", CarType.SEDAN),
                                new Car("w212", "sth", CarType.SEDAN))),
                        new Model("C class", 1934,
                                List.of(new Car("w203", "sth", CarType.SEDAN),
                                        new Car("w204", "sth", CarType.SEDAN)))));

        List<Model> modelList2 =  new ArrayList<>(List
                .of(new Model("Yaris", 1922,
                                List.of(new Car("1.4", "sth", CarType.SEDAN),
                                        new Car("1.2", "sth", CarType.SEDAN))),
                        new Model("Corola", 1937,
                                List.of(new Car("1.6", "sth", CarType.SEDAN),
                                        new Car("1.9", "sth", CarType.SEDAN)))));

        Manufacturer m1 = new Manufacturer("Mercedes Benc" ,1900,modelList1 );

        Manufacturer m2 = new Manufacturer("Toyota" ,1943,modelList2 );

        List<Manufacturer> manufacturerList =  new ArrayList<>(List.of(m1, m2));

        System.out.println("Models: " +  getAllModels(manufacturerList));

        System.out.println("Cars: " +  getAllCar(manufacturerList));

        System.out.println("Manufacturer names: " + getAllManufacturerNames(manufacturerList));

        System.out.println("Manufacturer years: " + getAllManufacturerYears(manufacturerList));

        System.out.println("Models name: " + getAllModelNames(manufacturerList));

        System.out.println("Models year: " + getAllModelYear(manufacturerList));
    }
}
