public class Thermometer{       
    public static void main(String []args){          
        temperature temp = new temperature(); //create an object of temperature class     
        temp.setFahrenheit(); //Invoke to set Fahrenheit          
        temp.setKelvin();      //Invoke to set Kelvin         
        System.out.println(temp); //Display all 3 scales, it invokes toString()      
    }
}

class temperature {
    double Celsius,Fahrenheit,Kelvin; //Declare private members as Celsius

    //Initialize constructor 
    temperature(){        
        Celsius=37;       
    } 

    double getCelsius() {
        return Celsius;
    }  
   
    double getFahrenheit(){
        return Fahrenheit;
    } 
             
    double getKelvin(){
        return Kelvin;
    }  
 
    //IF the user wants to set Celsius other than 37, then it can invoke in the main function
    //Passed value will be Celsius
    void setCelsius(double cel){         
        Celsius=cel;        
    }     
        
    //Converts the Celsius to Fahrenheit and sets the member Fahrenheit       
    void setFahrenheit(){        
        Fahrenheit=(Celsius*9/5)+32;
    }     
        
    //Converts the Celsius to Kelvin and sets the member Kelvin 
    void setKelvin(){         
        Kelvin=Celsius+273.15;    
    }     
        
    //Returns all three scale value of temperature 
    public String toString(){         
        return "Celsius:"+Celsius+"\nFahrenheit:"+Fahrenheit+"\nKelvin:"+Kelvin+"";     
    }        
}