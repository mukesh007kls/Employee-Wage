public class Main {
    public static final int FULL_TIME = 1;
    public static final int PART_TIME = 2;
    public static final int EMPLOYEE_WAGE_PER_HOUR = 20;
    public static final int EMPLOYEE_WORKING_DAYS_PER_MONTH=20;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        int employeeHours = 0;
        int employeeWage = 0;
        int employeeDays=0;
        double employeePresentDays=0;
        while(employeeDays<EMPLOYEE_WORKING_DAYS_PER_MONTH) {
            int empPresent = (int) Math.floor(Math.random() * 10) % 3;
            switch (empPresent) {
                case FULL_TIME:
                    employeePresentDays++;
                    System.out.println("Employee Present full time:"+employeePresentDays);
                    employeeHours += 16;
                    break;
                case PART_TIME:
                    employeePresentDays+=0.5;
                    System.out.println("Employee present part time:"+employeePresentDays);
                    employeeHours += 8;
                    break;
                default:
                    System.out.println("Employee absent");
                    employeeHours = 0;
                    break;
            }
            employeeDays++;
        }
        employeeWage = employeeHours * EMPLOYEE_WAGE_PER_HOUR;
        System.out.println("Employee Wage:" + employeeWage);
    }
}