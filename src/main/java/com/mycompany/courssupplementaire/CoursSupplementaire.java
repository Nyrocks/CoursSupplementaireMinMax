/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.courssupplementaire;

import static java.lang.Double.max;
import static java.lang.Float.min;
import java.util.Arrays;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;
/**
 *
 * @author Manu
 */
public class CoursSupplementaire {

    public static void main(String[] args) {
    
   
    Scanner input = new Scanner(System.in);
 /* System.out.println("Saisir trois Entiers : ");
  int ent1 = Integer.parseInt(input.next());
  int ent2 = Integer.parseInt(input.next());
  int ent3 = Integer.parseInt(input.next());
   max3 (ent1, ent2, ent3);
   System.out.println("Saisir trois Entiers : \n");
  int min1 = Integer.parseInt(input.next());
  int min2 = Integer.parseInt(input.next());
  int mini3 = Integer.parseInt(input.next());
    min3 (min1,min2,mini3);
    System.out.println("Ca les additionnes maintenant ! : ");
  int Maximum = max3(ent1,ent2,ent3);
  int Minimum = min3(min1,min2,mini3);
  affAdd(Maximum,Minimum);
       System.out.println("saisir une minutes");
       int Min = Integer.parseInt(input.next());  
       time2sec(Min);*/
        //Factorielle(5,1);
        int max = a(-30);
        int i =-30;
        while (i<=30);
        max = fmax(a(i),max);
        
        
    }
    public static int Fonction(int x){
    
        int a = 3*x+4*x-5*x;
        return a;
        
    }
    
    public static int Maximum(int a, int b){
        int max;
        if (a>b){
            max = a;}
        else{
            max = b;}
        return max;
      
        
        
    }
   
          
    
    /*public static int MinMax(int a, int b){
        a = 5;
        b = 2;
        if (a<b){
            return a;
        }
            else {
                    return b;                   
                }
        }
        
        
        
    }
   /* public static void Factorielle(int intA, int intB){
        int moins;
        moins = intA;
        while (intA<intB){
        System.out.println(moins + "*" + intA + "=" + moins*intA );
         intA --;}
        
    }
            
   /* public static int min3(int d, int e, int f){
        int min = 0;
        
        if (d < e && d < f){
            min = d;
        }
        if (e < d && e < f){
            min = e;
        }
        if (f < d && f < e){
            min = f;
        }
        System.out.println(min);
        return min;
    }
            
      public static int max3(int a, int b, int c){
          
         
          int max = 0 ;
          
          if (a > b && a > c){
              max = a;
          }
           if (b > a && b > c){
              max = b;
          }
            if (c > a && c > b){
              max = c;
          }
            System.out.println(max);
          return max;
           
      
      
      }
      public static void affAdd(int intMax, int intMin){
         int addition = intMax + intMin; 
          System.out.println(addition);
          return;
      } 
     public static void time2sec(int time){
        int seconde = time * 60;
        System.out.println(seconde);}*/
        
}
