/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysii10;

import java.util.Scanner;

/**
 *
 * @author Mohamed
 */
public class ArraysII10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        int [] counterofnumbers=new int[10];
        
        int n=11112222;
        int ime;
        
      int[] r=numberoftallies(n);
         printarray(r);
         */
   int product=1;
   for(int i=0;i<5;i++){
       product*=2;
       System.out.println(product);
       
       
   }
   System.out.println(product);
        }
    public static void readarray(int[]a){
    Scanner s=new Scanner(System.in);
                
    for(int i=0;i<a.length;i++){
    System.out.println("\"Enter element of index"+i);
    a[i]=s.nextInt();
                                }
                                        }
                
    public static void printarray(int[]a){
        for(int i=0;i<a.length;i++){
            System.out.println("Number of "+i+" is "+a[i]);
            
            
            
            
        }
        
        
    }            
    public static int[] numberoftallies(int a){
        int[]counter=new int[10];
        
        while(a>0){               //my test
        int digit=a%10;
        counter[digit]++;
        a=a/10;//update
        
        
        }
        return counter;
   }
    public static int maxfromarray(int[]a){
        int maxindex=0;
        int maxno=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>maxno){
                
                maxindex=i;
                maxno=a[i];
            }
            
            
        }
        return maxindex;
        
        
    }
    
    }
        
        
                
                
                
        
        

        
        
    
    

