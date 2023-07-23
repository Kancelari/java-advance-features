package com.sda.java.advance.exercises;

import java.util.*;
import java.util.stream.Collectors;

public class Exercise14 {

    public static  List<Integer> randomList(int nr){

        Random random =  new Random();
        List<Integer> ls =  new ArrayList<>();

        random.setSeed(System.currentTimeMillis());

        for (int i = 0; i < nr; i++) {
            ls.add(random.nextInt(nr));
        }

        return ls;

    }

    public static List<Integer> randomListOnceDublicated(int nr) {

        Random random = new Random();
        List<Integer> ls = new ArrayList<>();

        random.setSeed(System.currentTimeMillis());

        for (int i = 0; i < nr; i++) {
            int el = random.nextInt(nr);
//            System.out.println(Collections.frequency(ls, el));
            while (true) {
                if (Collections.frequency(ls, el) < 2) {
                    break;
                }
                el = random.nextInt(nr);
            }

            ls.add(el);
        }

        return ls;

    }

    public static Map<Integer, Integer> listToMap(List<Integer> ls) {
        Map<Integer, Integer> map = new HashMap<>();


        for (Integer el : ls) {
            if (map.containsKey(el)) {
                int val = map.get(el) + 1;
                map.put(el, val);
            } else {
                map.put(el, 1);
            }

        }
        return map;
    }

    public static List<Integer> onceRepeated(List<Integer> ls){
        List<Integer> onceLs =  new ArrayList<>();
        Map<Integer, Integer> map =  listToMap(ls) ;

        System.out.println("Map is:" + map);

        for (Integer key : map.keySet()){
            if(map.get(key)>1){
                onceLs.add(key);
            }
        }
        return  onceLs;
    }

    public static Map<Integer, Integer> sortedMap(Map<Integer, Integer> map){
        List<Map.Entry<Integer, Integer>> entryList = map.entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())).collect(Collectors.toList());
        Map<Integer, Integer> sortedMap =  new LinkedHashMap<>() ;
        for (Map.Entry<Integer, Integer> e : entryList){
            sortedMap.put(e.getKey(), e.getValue());
        }
        return  sortedMap;
    }

    public static  List<Integer> mostFrequently(List<Integer> ls, int nr){
        List<Integer> mostFrequent =  new ArrayList<>();

        Map<Integer, Integer> map =  listToMap(ls) ;

        Map<Integer, Integer> sortedMap  =  sortedMap(map);

        System.out.println("sortedMap is:" + sortedMap);
        int i =0 ;
        for (Integer key : sortedMap.keySet()){
            if (i == nr ){
                break;
            }
            mostFrequent.add(key);
            i++ ;
        }

        return mostFrequent;
    }

    public static void main(String[] args) {
        List<Integer> randomLs = randomList(200);
//
//        System.out.println("randomLs: " + randomLs);
        List<Integer> onceRepeatedLs = onceRepeated(randomLs);
//        System.out.println("onceRepeatedLs: " + onceRepeatedLs);
//
//        List<Integer> mostFrequentLs = mostFrequently(randomLs, 25);
//        System.out.println("mostFrequentLs: " + mostFrequentLs);

        randomLs = randomListOnceDublicated(100);
        System.out.println("randomLs: " + randomLs);

        onceRepeatedLs = onceRepeated(randomLs);
        System.out.println("onceRepeatedLs: " + onceRepeatedLs);


    }
}
