
package com.mycompany.lab_day_09;


public class CylinderContainer extends Container  {
    
    private double height;
    private double radius;
    
    public CylinderContainer(double hight,double radius){
         this.height =hight;
         this. radius=radius;
        
    }
   @Override
    public double Volume(){
       
       double volume=Math.PI*radius*radius*height;

      return volume;
}
}
