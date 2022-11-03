public class formatSpec {
    public static void main(String[] args) {

        // %s-prints in as it is.
        System.out.println(String.format("%s", "FIRST NAME").toLowerCase());

        // %S-prints in upper case.
        System.out.println(String.format("%S", "last name"));
    }
}
