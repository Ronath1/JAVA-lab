
package com.mycompany.lab_day_10_q3;

import java.io.File;
import java.util.Scanner;

public class Lab_Day_10_Q3 {


    public static void main(String[] args) {
        try{
            File file = new File("nonexistent.text");
            Scanner scanner=new Scanner(file);
            while(scanner.hasNextLine()){
                String line=scanner.nextLine();
                System.out.println("line");
            }
        }
        scanner.close();
        catch(){
            System.out.println("Error");
        }
    }
}
