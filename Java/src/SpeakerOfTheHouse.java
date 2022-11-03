//Java class SpeakerOfTheHouse
public class SpeakerOfTheHouse implements Speaker  {

    @Override
    public void speak() {
        System.out.println("I.am.Speaker.of.the.House.");
        
    }

    @Override
    public void announce(String bill) {
        System.out.println("The."+bill+".has.passed!");
        
    }    
}

