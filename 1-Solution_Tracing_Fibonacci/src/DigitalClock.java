public class DigitalClock 
{
    private int currentHour;
    private int currentMinutes;

    public int getHour() {
        return currentHour;
    }

    public void setHour(int currentHour) {
        this.currentHour = currentHour;
    }

    public int getMinutes() {
        return currentMinutes;
    }

    public void setMinutes(int currentMinutes) {
        this.currentMinutes = currentMinutes;
    }

    public DigitalClock (int hour, int minutes) 
    { 
        // modified condition
        if (hour >= 0 && hour <= 23){
            currentHour = hour;
        }
        else{
            currentHour = 0;
            // throw an exception on invalid hour's input
            throw new IllegalArgumentException("Invalid input for Hours");
        }

        if (minutes >= 0 && minutes <=59){
            currentMinutes = minutes;
        }
        else{
            currentMinutes = 0;
            // throw an exception on invalid minute's input
            throw new IllegalArgumentException("Invalid input for Minutes");
        }
    }

    public static void main(String[] args) {
        // on valid input
        DigitalClock digitalClockOne = new DigitalClock(2, 15);
        System.out.println("Digital Clock One- "+digitalClockOne.getHour()+":"+digitalClockOne.getMinutes());
        
        // on invalid hours input
        DigitalClock digitalClockTwo = new DigitalClock(-1, 25);
        System.out.println("Digital Clock Two- "+digitalClockTwo.getHour()+":"+digitalClockTwo.getMinutes());

        // on invalid minutes input
        DigitalClock digitalClockThree = new DigitalClock(12, 66);
        System.out.println("Digital Clock One- "+digitalClockThree.getHour()+":"+digitalClockThree.getMinutes());
    }
}
