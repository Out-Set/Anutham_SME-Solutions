public class Place {
    
    // Initiating attributes
    private String city;
    private String state;
    
    // Default constructor that initialize city and state to default values
    public Place(){
        
    }
    
    // Overloaded constructor to initialize city and state to parameter values
    public Place(String city, String state){
        this.city = city;
        this.state = state;
    }
    
    // Copy constructor to initialize city and state to same values as p's city and state
    public Place(Place p){
        city = p.city;
        state = p.state;
    }
    
    // setter method to set city to parameter value
    public void setCity(String city){
        this.city = city;
    }
    
    // setter method to set state to parameter value
    public void setState(String state){
        this.state = state;
    }
    
    // getter  method to return city
    public String getCity() {
        return city;
    }
    
    // getter method to return state
    public String getState() {
        return state;
    }
    
    // Method to return state initials, if state not found, return default value of "Unknown"
    public String getStateInitials() {
        
        // based on value of state (case-insensitive), return the corresponding state initials
        if(state.equalsIgnoreCase("Maryland"))
            return "MD";
        else if(state.equalsIgnoreCase("California"))
            return "CA";
        else if(state.equalsIgnoreCase("Florida"))
            return "FL";
        else if(state.equalsIgnoreCase("Ohio"))
            return "OH";
        // similarly, add more states using else if
        else // no match, return "Unknown"
            return "Unknown";
    }
    
    // method to return true if obj is an object of Place class and returns true if state and city of Place is same as state and city of obj(case-insensitive)
    public boolean equals(Object obj){
        
        // validate obj is an object of Place
        if(obj instanceof Place){
             
            Place p = (Place)obj; // case obj to Place
            
            return city.equalsIgnoreCase(p.city) && state.equalsIgnoreCase(p.state);
        }
        
        return false; // obj is not an object of Place
    }
    
    // method to return String representation of Place's state and city
    public String toString(){
        
        return "State: " + state + ", City: " + city;
    }

    public static void main(String []args){
        
        // test the Place class
        Place p1 = new Place("Miami", "Florida");
        Place p2 = new Place("New York City", "New York");
        
        System.out.println(p1);
        System.out.println("State initials: " + p1.getStateInitials());
        
        System.out.println(p2);
        System.out.println("State initials: " + p2.getStateInitials());
    }
}

