public class Actor implements Speaker {

    @Override
    public void speak() {
        System.out.println("I've.been.nominated.for.3.Academy.Awards");
        
    }

    @Override
    public void announce(String movie) {
        System.out.println("I'm.currently.starring.in "+movie);
        
    }
}

