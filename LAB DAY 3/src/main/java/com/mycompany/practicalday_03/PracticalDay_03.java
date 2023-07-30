
package com.mycompany.practicalday_03;

public class PracticalDay_03 {

    public static void main(String[] args) {
      
        Employee t1 = new Employee("kamal",11,10000);
      
       t1.setEname("kAmal");
      t1.setEage(22);
       t1.setEsalary(100000.00); 

        System.out.println("Employee Name is :" +t1.getEname());
        System.out.println("Employee Age is : "+t1.getEage() );
        System.out.println("Employee Salary is :"+t1.getEsalary());
    }
}
