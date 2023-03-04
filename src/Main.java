public class Main {


    public static void main(String[] args) {
        Main emp = new Main();
        emp.employee_Wage("Amazon",20,20,100);
        emp.employee_Wage("Facebook",25,24,250);
    }

    void employee_Wage(String companyName,int employeeWagePerHour,
                       int employeeWorkingDaysPerMonth,int totalWorkingHoursAllowed) {
        final int FULL_TIME = 1;
        final int PART_TIME = 2;
        
        System.out.println("Welcome to "+companyName+" Employee Wage Computation");
        int employeeHours = 0;
        int employeeWage = 0;
        int employeeDays = 0;
        double employeePresentDays = 0;
        while (employeeHours <= totalWorkingHoursAllowed && employeeDays < employeeWorkingDaysPerMonth) {
            int empPresent = (int) Math.floor(Math.random() * 10) % 3;
            switch (empPresent) {
                case FULL_TIME->{
                    employeePresentDays++;
                    employeeHours += 8;
                    System.out.println("Employee Present full time:" + employeePresentDays + " " + employeeHours);
                }
                case PART_TIME-> {
                    employeePresentDays += 0.5;
                    employeeHours += 4;
                    System.out.println("Employee present part time:" + employeePresentDays + " " + employeeHours);
                }
                default->System.out.println("Employee absent");
            }
            employeeDays++;
        }
        employeeWage = employeeHours * employeeWagePerHour;
        System.out.println("Employee Wage:" + employeeWage);
    }
}
