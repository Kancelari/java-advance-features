package com.sda.java.advance.exercises;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;


public class Exercise30 {


    public static String reverseStr(String str){
        String st1 = "";
        for (int i = str.length()-1 ; i >=0 ; i-- ){
            st1 +=str.substring(i,i+1);
        }
        return st1;
    }

    public static String reverseFilContent(File f) throws IOException {
        Path p =  Paths.get(f.getAbsolutePath());
        String str = String.join( "\n", Files.readAllLines(p)) ;
        return  reverseStr(str);
    }


    private  static  String dirPath  = "resources/Exercise30";
    public  static  void reverseFiles(String dirPath) throws IOException {
        File dir  =  new File(dirPath);
        if(!dir.isDirectory()){
            System.out.println("This dir does not exist");
            return;
        }
        File[] files =  dir.listFiles();
        for (File f : files){
            if(f.isFile()){
                System.out.println(f.getName());
                String [] nameParts =  f.getName().split("\\.");
                String name  =  dirPath + "/" + reverseStr(nameParts[0])  + "." + nameParts[1];
                String reverseStr =  reverseFilContent(f) ;
                Path p =  Paths.get(name);
                Files.write(p, reverseStr.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.WRITE);

            }
        }

    }


    public static void main(String[] args) throws IOException {
        System.out.println(reverseFilContent(new File("resources/Exercise30/file1.txt")));
        System.out.println(new File("resources/Exercise30/file1.txt").getName());
        reverseFiles(dirPath);
    }
}
