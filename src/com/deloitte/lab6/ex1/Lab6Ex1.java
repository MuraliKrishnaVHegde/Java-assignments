package com.deloitte.lab6.ex1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Lab6Ex1 {
	public static List<Integer> getSortedValues(HashMap<String, Integer> map) {
        Collection<Integer> usvalues = map.values();
        
        List<Integer> svalues = new ArrayList<>(usvalues);
        
        Collections.sort(svalues);
        
        return svalues;
    }
public static void main(String[] args) {
	HashMap<String, Integer> map = new HashMap<>();
    map.put("Murali", 40);
    map.put("Manoj", 26);
    map.put("Nidhi", 46);
    map.put("Naman", 35);

    List<Integer> svalues = getSortedValues(map);

    System.out.println("Sorted values: " + svalues);
}
}