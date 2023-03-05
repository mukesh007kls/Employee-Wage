import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeWage {
    final int FULL_TIME = 1;
    final int PART_TIME = 2;
    public String companyName;
    public int employeeWagePerHour;
    public int employeeWorkingDaysPerMonth;
    public int totalWorkingHoursAllowed;
    int employeeWage;
    static final HashMap<String,Integer> COMPANY=new HashMap<>();
    public EmployeeWage(String companyName, int employeeWagePerHour, int employeeWorkingDaysPerMonth, int totalWorkingHoursAllowed) {
        this.companyName = companyName;
        this.employeeWagePerHour = employeeWagePerHour;
        this.employeeWorkingDaysPerMonth = employeeWorkingDaysPerMonth;
        this.totalWorkingHoursAllowed = totalWorkingHoursAllowed;
    }


    public static void main(String[] args) {
        EmployeeWage amazon = new EmployeeWage("Amazon", 20, 20, 100);
        amazon.employee_Wage();
        EmployeeWage facebook = new EmployeeWage("Facebook", 25, 24, 250);
        facebook.employee_Wage();
        for (Map.Entry<String,Integer> company1:COMPANY.entrySet()) {
            System.out.println(company1.getKey()+":-"+company1.getValue());
        }
    }

    public void employee_Wage() {
        int employeeHours = 0;
        int employeeDays = 0;
        while (employeeHours <= totalWorkingHoursAllowed && employeeDays < employeeWorkingDaysPerMonth) {
            int empPresent = (int) Math.floor(Math.random() * 10) % 3;
            switch (empPresent) {
                case FULL_TIME -> employeeHours += 8;
                case PART_TIME -> employeeHours += 4;
            }
            employeeDays++;
        }
        employeeWage = employeeHours * employeeWagePerHour;
        COMPANY.put(companyName,employeeWage);
    }
}
