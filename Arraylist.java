/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;
import java.util.*;
public class Stringdemo1 {
    public static void main(String[] args) {
       // TODO code application logic here
       ArrayList<String> list=new ArrayList<>();
        list.add("object");
        list.add("oriented");
        list.add("programming");
        list.add("language");
        for(String i:list)
        {
            System.out.println(i);
        }
        System.out.println("List:"+list);
        list.replaceAll(t->t.toUpperCase());
        list.replaceAll(t->t+"S");
        System.out.println("Plural:"+list);
        Collections.reverse(list);
        System.out.println("Reversed List:"+list);
        list.removeIf(t->t.endsWith("S"));
        System.out.println("Plural words removed:"+list);
        // TODO code application logic here
    }
    
}

