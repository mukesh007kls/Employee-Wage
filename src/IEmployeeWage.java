public interface IEmployeeWage {
    void addCompanyEmployeeWage(String companyName, int employeeWagePerHour, int employeeWorkingDaysPerMonth, int totalWorkingHoursAllowed);
    void computeWage();
}
