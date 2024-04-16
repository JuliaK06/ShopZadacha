package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) {
File f=new File();
        ArrayList<Laptop> list1= new ArrayList<>();
try{
    Scanner sc=new Scanner(f);
    while(sc.hasNext()){
        Laptop l=new Laptop();
        l.setYearOfProduction(sc.nextInt());
        if(l.getYearOfProduction()>2020 && l.getYearOfProduction()<2016){
            continue;
        }
        l.setBrand(sc.next());
        l.setPrice(sc.nextDouble());
        l.setCity(sc.next());
        l.setName(sc.next());
        list1.add(l);
    }
    PriorityQueue<Map.Entry<String, Integer>> list2=new PriorityQueue<>(Collections.reverseOrder());
    for(Laptop l1:list1){
        if(l1.getPrice()<=2000.0) {
           Integer m=  1;
            Map.Entry<String, Integer> m1 = new  AbstractMap.SimpleEntry<>(l1.getBrand(), m);
            for(Map.Entry<String, Integer>l2:list2){
                if(l2.getKey().equals(m1.getKey())){
                    int n=l2.getValue();
                    l2.setValue(++n);
                }
            }
            list2.add(m1);
        }
    }
 for(int i=0;i<3;i++){
     Map.Entry<String, Integer> m=list2.poll();
     System.out.println(m.getKey()+": ");
             for(Laptop a:list1){
               if(  a.getBrand().equals(m.getKey())){
                   System.out.println(a.getName()+", ");
               }

             }
 }
}
catch(FileNotFoundException e){
    System.out.println("File not found");
        }
    }
}
