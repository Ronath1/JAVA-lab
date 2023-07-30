

package com.mycompany.lab_day_10;


import java.util.Scanner;
public class Lab_Day_10 {

    public static void main(String[] args) {
        Scanner q1=new Scanner(System.in);
        
        int no1,no2;
        System.out.print("Enter the Number 1 :");
        no1=q1.nextInt();
        
        System.out.print("Enter the Number 2 :");
        no2=q1.nextInt();
        
        try{
            int ans=no1/no2;
            System.out.println("Result "+ans);
        }
        catch(ArithmeticException e){
            System.out.println("Error: Division by zero is not allowed!!!");
//            System.out.println("e.getMassage()");
        }
    }
}
