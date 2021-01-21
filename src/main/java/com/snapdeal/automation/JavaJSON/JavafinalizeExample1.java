package com.snapdeal.automation.JavaJSON;

public class JavafinalizeExample1 {  
    public static void main(String[] args)   
   {   
       JavafinalizeExample1 obj = new JavafinalizeExample1();   
       System.out.println(obj.hashCode());   
       obj = null;   
       // calling garbage collector    
       System.gc();   
       System.out.println("end of garbage collection");
       
       String minCPT = "10.00" ;
       String[] minCPT1 = minCPT.split("\\.");
       System.out.println(minCPT1[0]);
       System.out.println(minCPT);
   }   
   @Override  
   protected void finalize()   
   {   
       System.out.println("finalize method called");   
   }   
} 
