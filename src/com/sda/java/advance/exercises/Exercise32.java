package com.sda.java.advance.exercises;

import java.io.*;
import java.util.List;

public class Exercise32 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String filePath =  "resources/cars.ser";
        Car c1 = new Car("E class w211" , "E class", 2010, 2000.0,
                List.of(new Manufacturer("Mercedes Bez", 1920, "Germany")), EngineType.V8);

        Car c2 = new Car("C class w204" , "C class", 2012, 8000.0,
                List.of(new Manufacturer("Mercedes Bez", 1920, "Germany")), EngineType.V6);

        ObjectOutputStream outputStream  = new ObjectOutputStream(new FileOutputStream(filePath));

        outputStream.writeObject(c1);
        outputStream.writeObject(c2);

        outputStream.close();

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filePath));

        Object c = inputStream.readObject();

        while (true){
            try {
                System.out.println((Car)c);
                c = inputStream.readObject();
            }catch (EOFException e){
                inputStream.close();
                break;
            }

        }

    }
}
