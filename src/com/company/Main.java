package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
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
        if(l.getYearOfProduction()>2020 && l.getYearOfProduction()<2015){
            continue;
        }
        l.setBrand(sc.next());
        l.setPrice(sc.nextDouble());
        l.setCity(sc.next());
        if(!(l.getCity()=="София" || l.getCity()=="Бургас" || l.getCity()=="Варна" )){
            continue;
        }
        l.setName(sc.next());
        list1.add(l);
    }
    sc.next();
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
    File output = new File("output.txt");
    PrintWriter p=new PrintWriter(output);
 for(int i=0;i<3;i++){
     Map.Entry<String, Integer> m=list2.poll();
     p.println(m.getKey()+": ");
             for(Laptop a:list1){
               if(  a.getBrand().equals(m.getKey())){
                   p.println(a.getName()+", ");
               }

             }
             p.println('\n');

 }

} catch(FileNotFoundException e){
    System.out.println("File not found");
        }


}
    }

