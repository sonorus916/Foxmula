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
public class sum {
    
   ArrayList<Integer> arrl = new ArrayList<Integer>();
   void input(int data)
   {
       arrl.add(data);
   }
   
   void search(int data)
   {
       for(int i=0; i<arrl.size()-1; i++) 
       {
           for(int j=i+1; j<arrl.size(); j++) 
           {
		int sum = arrl.get(i)+arrl.get(j);
                    if (sum==data)
                    {
                        System.out.println("pair is: "+"("+arrl.get(i)+","+arrl.get(j)+")");
                    }
            }
	}
   }
    
   
   //main fuction
   
   public static void main(String args[])
   {
       //variables
       sum alob = new sum();
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
               
               case 2:  System.out.println("bol kya sum chaiye");
                        data = scan.nextInt();
                        alob.search(data);
                        break;
                        
               default: System.out.println("bye bye");
           }
       }
   }
    
}
