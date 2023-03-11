import java.util.ArrayList;

public class EmpWageBuilder implements IEmployeeWage {
    public static final int FULL_TIME = 1;
    public static final int PART_TIME = 2;

    private ArrayList<CompanyEmpWage> companyEmpWageArrayList;
    public EmpWageBuilder(){
        companyEmpWageArrayList =new ArrayList<>();
    }

    public static void main(String[] args) {
        EmpWageBuilder empWageBuilder=new EmpWageBuilder();
        empWageBuilder.addCompanyEmployeeWage("Facebook",30,20,100);
        empWageBuilder.addCompanyEmployeeWage("Instagram",20,29,120);
        empWageBuilder.addCompanyEmployeeWage("chatGpt",10,23,200);
        empWageBuilder.computeWage();
    }
   public void addCompanyEmployeeWage(String companyName, int employeeWagePerHour, int employeeWorkingDaysPerMonth, int totalWorkingHoursAllowed){
        companyEmpWageArrayList.add(new CompanyEmpWage(companyName,employeeWagePerHour,employeeWorkingDaysPerMonth,totalWorkingHoursAllowed));
   }
   public void computeWage(){
       for (int i = 0; i < companyEmpWageArrayList.size(); i++) {
           CompanyEmpWage companyEmpWage=companyEmpWageArrayList.get(i);
           companyEmpWage.setTotalEmployeeWage(this.computeEmployeeWage(companyEmpWage));
           System.out.println(companyEmpWageArrayList.get(i)+" daily wage is:- "+companyEmpWage.employeeDailyWage);
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
                case FULL_TIME -> {
                    empWorkingHours = 8;
                    companyEmpWage.employeeDailyWage.add(empWorkingHours*companyEmpWage.employeeWagePerHour);
                }
                case PART_TIME -> {
                    empWorkingHours = 4;
                    companyEmpWage.employeeDailyWage.add(empWorkingHours*companyEmpWage.employeeWagePerHour);
                }
                default -> companyEmpWage.employeeDailyWage.add(0);
            }
            totalEmployeeHours+=empWorkingHours;
        }
        return  totalEmployeeHours*companyEmpWage.employeeWagePerHour;
    }
}
