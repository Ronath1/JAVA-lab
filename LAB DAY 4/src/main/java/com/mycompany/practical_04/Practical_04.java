
package com.mycompany.practical_04;


public class Practical_04 {

    public static void main(String[] args) {
        Employee f1= new Employee(empID,empName,empDesignation);
        f1.setempID(123);
        f1.setempName("ronath");
        f1.setempDesignation("adadadddd");
        
        System.out.println("ID Is: " +f1.getempId());
        System.out.println("name Is :" +f1.getempName());
        System.out.println("Designation :" +f1.getempDesignation());
    }
}
