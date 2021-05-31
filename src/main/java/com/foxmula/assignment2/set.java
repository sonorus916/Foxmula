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
public class set {
    
   HashSet<Integer> arrl = new HashSet<Integer>();
   void input(int data)
   {
       arrl.add(data);
   }
   
   void search(int data)
   {
       boolean result =  arrl.contains(data);
       
       if (result)
        {
            System.out.println("congratulations founded "+data+" in array list");
        }
       
       else
       {
           System.out.println("sry"+data+"not found in araay list");
       
       }
   }
    
   
   //main fuction
   
   public static void main(String args[])
   {
       //variables
       set alob = new set();
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
               
               case 2:  System.out.println("bol kya search karu");
                        data = scan.nextInt();
                        alob.search(data);
                        break;
                        
               default: System.out.println("bye bye");
           }
       }
   }
    
}
