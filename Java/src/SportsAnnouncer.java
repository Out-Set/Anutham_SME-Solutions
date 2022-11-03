//Java class SportsAnnouncer
public class SportsAnnouncer implements Speaker {

    @Override
    public void speak() {
        System.out.println("Goal!");
        
    }

    @Override
    public void announce(String team) {
        System.out.println("The."+team+".have.scored.a.goal!");
        
    }
}

