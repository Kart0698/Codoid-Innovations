
//Java Program 2
//Write a program to remove duplicates in an ArrayList

import java.util.ArrayList;
import java.util.LinkedHashSet;

class Demo
{
  public static void main(String[] args){
   
   ArrayList a1 = new ArrayList();
    a1.add(10);
    a1.add(10);
    a1.add(23);
    a1.add(45.98);
    a1.add(45.98);
    a1.add('e');
    a1.add('f');
    a1.add(true);
    a1.add('e');	 

    //before removing duplicate values
    System.out.println("a1="+a1);

    //Coverting ArrayList to LinkedHashSet to remove duplicate from the container
    LinkedHashSet l1 = new LinkedHashSet(a1);

    //After removing duplicate
    System.out.println("l1="+l1);
   }
}