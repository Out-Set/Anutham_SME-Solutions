public class App {
    public static void main(String[] args) throws Exception {
        double x1 = 14.0, x2 = 21.0, x3 = 35.0;
        double y1 = 4.0, y2 = 54.0, y3 = 6.0;

        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle(x1, x2, x3, y1, y2, y3);

        double res = t1.getArea(x1, x2, x3, y1, y2, y3);
        System.out.println("Area for the given Triangle is: "+res);
    }
}

class Triangle {
    double x1, x2, x3;
    double y1, y2, y3;

    // Default constructor
    Triangle(){
        System.out.println("Default constructor for the Triangle");
    }

    // Parameterized constructor
    Triangle(double x1,double x2,double x3,double y1,double y2,double y3){
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;

        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;   
        
        System.out.println("X-vertices are: "+x1+", "+x2+" and "+x3);
        System.out.println("Y-vertices are: "+y1+", "+y2+" and "+y3);
    }

    // Method to calculate area
    double getArea(double x1,double x2,double x3,double y1,double y2,double y3){
        double area = x1*y2-x1*y3 + x2*y3-x2*y1 + x3*y1-x3*y2;

        // Math.abs() returns returns the absolute value, because area is never negative.
        return Math.abs(area/2);
    }
}

