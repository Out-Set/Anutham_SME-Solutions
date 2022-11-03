public class tempratureScale{
    public static void main(String []args){          
        temperature temp=new temperature();          
        temp.setCelsius(200); //invokes to set Celsius by passing the value          
        temp.setFahrenheit();          
        temp.setKelvin();         
        System.out.println(temp);      
    } 
}
