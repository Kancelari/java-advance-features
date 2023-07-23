package com.sda.java.advance.exercises;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Zoo {
    List<String> animals  ;

    public Zoo(List<String> animals) {
        this.animals = animals;
    }

    public Zoo() {
        animals =  new ArrayList<>();
    }

    public List<String> getAnimals() {
        return animals;
    }

    public void setAnimals(List<String> animals) {
        this.animals = animals;
    }


    public int  getNumberOfAllAnimals(){
        return animals.size();
    }

    public Map<String, Integer> getAnimalsCount(){
        Map<String, Integer> map =  new LinkedHashMap<>();
        for(String animal : animals){
            animal =  animal.toLowerCase();
            if(map.containsKey(animal)){
                map.put(animal , map.get(animal)+1);
            }
            else {
                map.put(animal,1);
            }
        }
        return  map;
    }

    public Map <String, Integer> getAnimalsCountSorted(){
        Map<String, Integer> map =  new LinkedHashMap<>();
        List<Map.Entry<String,Integer>> entryList =  getAnimalsCount().entrySet().stream()
                .sorted((e1,e2)-> e2.getValue().compareTo(e1.getValue()))
                .collect(Collectors.toList());
        for(Map.Entry<String,Integer> e : entryList){
            map.put(e.getKey(),e.getValue());
        }

        return  map;
    }

    public void addAnimal(String animal , int nr){
        for(int i=0 ; i<nr ; i++){
            animals.add(animal);
        }
    }

}
