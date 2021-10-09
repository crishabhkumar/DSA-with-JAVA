package com.rishabh;

import java.util.*;

public class sortingHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<>();
        hmap.put(101,"Rishabh"); hmap.put(1022,"Vivek"); hmap.put(1030,"Priyanshu"); hmap.put(14,"Aman"); hmap.put(10500,"Anajli");

        //whene hashmap is not sorted
        System.out.println("When Hashmap is not sorted:");
        for(Map.Entry me : hmap.entrySet()){
            System.out.println(me.getKey() + " : " + me.getValue());
        }

        //Sorting using Key
        Map<Integer,String > mapKey = sortKeys(hmap);

        //displaying elements when sorted using keys
        System.out.println("Hashmap sorted using Keys:");
        for(Map.Entry me : mapKey.entrySet()){
            System.out.println(me.getKey() + " : " + me.getValue());
        }
        //sorting using values
        Map<Integer,String > mapValue = sortValues(hmap);

        //displaying elements when sorted using values
        System.out.println("Hashmap sorted using Values:");
        for(Map.Entry me : mapValue.entrySet()){
            System.out.println(me.getKey() + " : " + me.getValue());
        }

    }

    private static HashMap sortValues(HashMap hm){
        List lst = new LinkedList(hm.entrySet());       //Inserting objects of Map (key value pair in list)
        Collections.sort(lst, new Comparator<>() {
            public int compare(Object o1,Object o2){        //overridding the method
                return ((Comparable)((Map.Entry)(o1)).getValue()).compareTo(((Map.Entry)(o2)).getValue());
            }
        });
        //copying the sorted list in HashMap to preserve the iteration order
        HashMap sortedHashMap = new LinkedHashMap();    //for maintaining the insertion order
        for (Iterator it = lst.iterator(); it.hasNext();){
            Map.Entry entry = (Map.Entry)it.next();
            sortedHashMap.put(entry.getKey(),entry.getValue());
        }
        return sortedHashMap;
    }

    private static HashMap sortKeys(HashMap hm){
        List lst = new LinkedList(hm.entrySet());       //Inserting objects of Map (key value pair in list)
        Collections.sort(lst, new Comparator<>() {
            public int compare(Object o1,Object o2){        //overridding the method
                return ((Comparable)((Map.Entry)(o1)).getKey()).compareTo(((Map.Entry)(o2)).getKey());
            }
        });
        //copying the sorted list in HashMap to preserve the iteration order
        HashMap sortedHashMap = new LinkedHashMap();    //for maintaining the insertion order
        for (Iterator it = lst.iterator(); it.hasNext();){
            Map.Entry entry = (Map.Entry)it.next();
            sortedHashMap.put(entry.getKey(),entry.getValue());
        }
        return sortedHashMap;
    }

}
