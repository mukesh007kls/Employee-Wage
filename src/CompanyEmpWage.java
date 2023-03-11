public class CompanyEmpWage {
    public final String companyName;
    public final int employeeWagePerHour;
    public final int employeeWorkingDaysPerMonth;
    public final int totalWorkingHoursAllowed;
    public int totalEmployeeWage;

    public CompanyEmpWage(String companyName, int employeeWagePerHour, int employeeWorkingDaysPerMonth, int totalWorkingHoursAllowed) {
        this.companyName = companyName;
        this.employeeWagePerHour = employeeWagePerHour;
        this.employeeWorkingDaysPerMonth = employeeWorkingDaysPerMonth;
        this.totalWorkingHoursAllowed = totalWorkingHoursAllowed;
    }

    public void setTotalEmployeeWage(int totalEmployeeWage) {
        this.totalEmployeeWage = totalEmployeeWage;
    }

    public String toString() {
        return "Total employee wage for " + companyName + " is:- " + totalEmployeeWage;
    }
}