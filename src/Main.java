public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        final int FULL_TIME = 1;
        final int EMPLOYEE_WAGE_PER_HOUR = 20;
        int employeeHours = 0;
        int employeeWage = 0;
        double empPresent = Math.floor(Math.random() * 10) % 2;
        if (empPresent == FULL_TIME) {
            System.out.println("Employee Present");
            employeeHours = 8;
        } else {
            System.out.println("Employee Absent");
            employeeHours = 0;
        }
        employeeWage = employeeHours * EMPLOYEE_WAGE_PER_HOUR;
        System.out.println("Employee Wage:" + employeeWage);
    }
}