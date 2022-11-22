class Date {      
    private int month;     
    private int day;      
    public Date(int month, int day) {         
        this.month = month;         
        this.day = day;     
    }      
    public int getMonth() {         
        return month;     
    }      
    public int getDay() {         
        return day;     
    }      
    public int daysInMonth() {         
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {             
            return 31;         
        } 
        else if (month == 2) {             
            return 28;         
        } 
        else {             
            return 30;         
        }     
    }      
    public void nextDay() {         
        if(day == daysInMonth()) {             
            if(month == 12) {                 
                month = 1;             
            } 
            else {                 
                month++;             
            }             
            day = 1;         
        } 
        else {             
            day++;         
        }     
    }      
    @Override     
    public String toString() {         
        return String.format("%02d/%02d", month, day);     
    } 
}

public class DateTime {
    public static void main(String[] args){
        new Date(1, 12);
    }
}