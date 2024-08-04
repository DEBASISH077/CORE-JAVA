public class ControlStatements1 {
    public static void main(String[] args) {
        int no2;
        int no1 = 10;
        if (no1 == 10) {
            no2 = 20;
            System.out.println("hello");
        }
        // (ERROR) System.out.println(no2);
        if (10 == 10) {
            no2 = 20;
            System.out.println("hello");
        }
        // CODE WILL RUN PERFECTLY
        System.out.println(no2);
    }
}
