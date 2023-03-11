import java.util.HashMap;
import java.util.Map;

public class EmpWageBuilder implements IEmployeeWage {
    public static final int FULL_TIME = 1;
    public static final int PART_TIME = 2;

    private int numberOfCompanies;
    private CompanyEmpWage[] companyEmpWageArray;
    public EmpWageBuilder(){
        companyEmpWageArray=new CompanyEmpWage[5];
    }

    public static void main(String[] args) {
        EmpWageBuilder empWageBuilder=new EmpWageBuilder();
        empWageBuilder.addCompanyEmployeeWage("Facebook",30,20,100);
        empWageBuilder.addCompanyEmployeeWage("Instagram",20,29,120);
        empWageBuilder.addCompanyEmployeeWage("chatGpt",10,23,200);
        empWageBuilder.computeWage();
    }
   public void addCompanyEmployeeWage(String companyName, int employeeWagePerHour, int employeeWorkingDaysPerMonth, int totalWorkingHoursAllowed){
        companyEmpWageArray[numberOfCompanies]=new CompanyEmpWage(companyName,employeeWagePerHour,employeeWorkingDaysPerMonth,totalWorkingHoursAllowed);
        numberOfCompanies++;
   }
   public void computeWage(){
       for (int i = 0; i < numberOfCompanies; i++) {
           companyEmpWageArray[i].setTotalEmployeeWage(this.computeEmployeeWage(companyEmpWageArray[i]));
           System.out.println(companyEmpWageArray[i]);
       }
   }

    private int computeEmployeeWage(CompanyEmpWage companyEmpWage) {
        int empWorkingHours=0;
        int totalEmployeeHours=0;
        int totalWorkingDaysPerMonth=0;
        while (totalEmployeeHours<=companyEmpWage.totalWorkingHoursAllowed&&totalWorkingDaysPerMonth<companyEmpWage.employeeWorkingDaysPerMonth) {
            totalWorkingDaysPerMonth++;
            int employeeCheck = (int) (Math.random() * 10 % 3);
            switch (employeeCheck) {
                case FULL_TIME -> empWorkingHours = 8;
                case PART_TIME -> empWorkingHours = 4;
            }
            totalEmployeeHours+=empWorkingHours;
        }
        return  totalEmployeeHours*companyEmpWage.employeeWagePerHour;
    }

}
