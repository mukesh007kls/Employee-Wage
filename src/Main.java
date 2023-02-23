public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        int FULL_TIME = 1;
        double empPresent = Math.floor(Math.random() * 10) % 2;
        if (empPresent == FULL_TIME) {
            System.out.println("Employee Present");
        } else {
            System.out.println("Employee Absent");
        }
    }
}