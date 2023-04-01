
//Java Program4
//Write a Java Program to show a NullPointerException


import java.io.*;

class Demo3
{

   public void m1(){
    Sysytem.out.println("Hi m1");
   }

}

class MainOf
{
  public static void main(String[] args){
   System.out.println("Hi Main");
    Demo d3 = null;
     
    try
    {
      System.out.println(d3.x);
      d3.m1();
    }
      catch(NullPointerException n1){
       System.out.println("NullPointerException Handled");
      
      }
  }
}

