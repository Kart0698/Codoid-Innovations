
//Java Program 3
//How to read a File in Java


import java.io.*;
import java.util.Scanner;

public class Demo1
{
  public static void main(String[] args) {
   
   //Create a File

    File file = new File("Demo.txt");
    System.out.println(file.getName()+"File Created Successfully");
    System.out.println("Path: "+file.getAbsolutePath());
    
   //Write Data into a File

    FileWriter fw = new FileWriter(file);
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the data to be added to the file");
    
    String data = sc.nextLine();
    fw.write(data);
    
    System.out.println("Write operation done successfully");
    
    fw.close();

    //Read data from a File

    FileReader fr = new FileReader(file);
    System.out.println("Content of the file:");
    
    int x=0;
    while((x=fr.read())!=-1){
     System.out.println((char)x);
     }
    fr.close();
  }

}