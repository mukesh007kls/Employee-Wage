public class Main {
    public static final int FULL_TIME = 1;
    public static final int PART_TIME = 2;
    public static final int EMPLOYEE_WAGE_PER_HOUR = 20;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");

        int employeeHours = 0;
        int employeeWage = 0;
        int empPresent = (int) Math.floor(Math.random() * 10) % 3;
        switch (empPresent) {
            case FULL_TIME:
                System.out.println("Employee Present full time");
                employeeHours = 16;
                break;
            case PART_TIME:
                System.out.println("Employee present part time");
                employeeHours = 8;
                break;
            default:
                System.out.println("Employee absent");
                employeeHours = 0;
                break;
        }
        employeeWage = employeeHours * EMPLOYEE_WAGE_PER_HOUR;
        System.out.println("Employee Wage:" + employeeWage);
    }
}