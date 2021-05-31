/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foxmula.assignment2;
import java.util.*;
/**
 *
 * @author Lenovo
 */
public class occur {
    
   ArrayList<Integer> arrl = new ArrayList<Integer>();
   void input(int data)
   {
       arrl.add(data);
   }
   
   void count()
   {
       HashSet<Integer> hs = new HashSet<Integer>(arrl);
       ArrayList<Integer> arr2 = new ArrayList<Integer>(hs);
      for(int i =0; i<hs.size()-1; i++)
      {
          int n;
          n = arr2.get(i);
          System.out.println(n+" has occured "+Collections.frequency(arrl,n));
      }
   }
    
   
   //main fuction
   
   public static void main(String args[])
   {
       //variables
       occur alob = new occur();
       int data, select;
       
       Scanner scan = new Scanner(System.in);
       System.out.println("1 for input");
       System.out.println("2 for searching");
       
       while(true)
       {
           select = scan.nextInt();
           
           switch(select)
           {
               case 1:  System.out.println("data diyo bhai:");
                        data = scan.nextInt();
                        alob.input(data);
                        break;
               
               case 2:  System.out.println("ye le dekh occurence");
                        alob.count();
                        break;
                        
               default: System.out.println("bye bye");
           }
       }
   }
    
}
