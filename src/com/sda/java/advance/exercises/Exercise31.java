package com.sda.java.advance.exercises;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.LinkedHashMap;
import java.util.Map;

public class Exercise31 {

    private  static String readFile(String file) throws IOException {
        InputStream input =  new FileInputStream(file);
        byte[] bytes =  input.readAllBytes();
        input.close();
        return  new String(bytes);
    }

    private static Map<String, Integer> countFrequency(String str){
        String[]  ls =  str.replaceAll("[\\,,\\? , \\!, \\.]"," ").split("\\s|\\n");
        Map<String, Integer> map =  new LinkedHashMap<>();

        for(String s : ls){
            if(s.isEmpty()){
                continue;
            }
            if(map.containsKey(s)){
                map.put(s, map.get(s)+1);
            }
            else{
                map.put(s, 1);
            }
        }
        return  map;
    }


    private static void createFileStatistics(String file, String resourceFile) throws IOException {
        Path p = Paths.get(file);
        String delimeter = " | ";
        String  HEADERS = "Word" + delimeter +  "Frequency";

        String fileContent  =  readFile(resourceFile);

        Map<String, Integer> frequencyMap =  countFrequency(fileContent);


        for(String k : frequencyMap.keySet()){
            String str = "\n"+ k + delimeter + frequencyMap.get(k);
            HEADERS +=str;

        }

        if(!p.toFile().exists()){
            Files.write(p, (HEADERS).getBytes() , StandardOpenOption.CREATE, StandardOpenOption.WRITE);
        }
        else{
            Files.write(p, (HEADERS).getBytes() , StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.WRITE);
        }
    }

    public static void main(String[] args) throws IOException {
        String filePath =  "resources/file1.txt";

        String fileContent = readFile(filePath);
        System.out.println(fileContent);
        System.out.println(countFrequency(fileContent));

        createFileStatistics("resources/statistics.txt", filePath);
    }
}
