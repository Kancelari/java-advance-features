package com.sda.java.advance.exercises;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise33 {

    private static List<File> jpgAndPngFiles(String  dirPath){
        List<File>files = new ArrayList<>();
        File dir =  new File(dirPath);
        if(!dir.isDirectory()){
            System.out.println("This dir dont exist");
            return  files;
        }
        find(files, dirPath);
        return  files;
    }

    private static void find(List<File> files, String path){
        File dir =  new File(path);
        for(File f : dir.listFiles()){
            if(f.isFile()){
                String appendix  =  f.getName().split("\\.")[1].toLowerCase() ;
                if(appendix.equals("jpg") || appendix.equals("png")){
                    files.add(f);
                }
            }
            else{
                find(files, f.getPath()) ;
            }
        }
    }


    public static void main(String[] args) {
        String dirPath =  "resources/Exercise33";

        List<String> fileNames =  jpgAndPngFiles(dirPath).stream().map(e->e.getName()).collect(Collectors.toList());
        System.out.println(jpgAndPngFiles(dirPath));

        System.out.println("File Names: " + fileNames);
    }
}
