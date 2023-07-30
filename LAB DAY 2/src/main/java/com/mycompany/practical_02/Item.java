
package com.mycompany.practical_02;

public class Item {
    
    protected int location;
    protected String description;
    
  
   
    public Item(int location,String description){  
       this.location=location;
        this.description= description;
    }

     //Setter Location                        
    public void setLocation(int location){
        this.location=location;
    }
    //Getter Location
    public int getlocation(){
        return location;
    }
    
    //Setter Description
    public void setDescription(String description){
       this.description=description;
    }
    
    //Getter Description
    public String getDescription(){
        return description;
    }
    
}
