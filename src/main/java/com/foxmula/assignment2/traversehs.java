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
public class traversehs {
    HashSet<Integer> hs = new HashSet<Integer>();
   void input(int data)
   {
       hs.add(data);
   }
   
   void display()
   {
       Iterator<Integer> iter = hs.iterator();
       while(iter.hasNext())
       {
            System.out.print(iter.next()+" "); 
	 }
   }
    
   
   //main fuction
   
   public static void main(String args[])
   {
       //variables
       traversehs alob = new traversehs();
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
               
               case 2:  System.out.println("le bhai dekhle le apna");
                        
                        alob.display();
                        break;
                        
               default: System.out.println("bye bye");
           }
       }
   }
    
}

