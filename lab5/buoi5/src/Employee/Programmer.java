package Employee;

public class Programmer extends Employeee{
    
   
    private int hoursOfOvertime;
    
    public Programmer(int id, String name, int age, String phone, String email, long basicSalary, 
    int hoursOfOvertime) {
    super(id, name, age, phone, email, basicSalary);
    this.hoursOfOvertime = hoursOfOvertime;
  
    }

    public int getHoursOfOvertime() {
        return hoursOfOvertime;
    }

    public void setHoursOfOvertime(int hoursOfOvertime) {
        this.hoursOfOvertime = hoursOfOvertime;
    }

   
    @Override
    public void input() {
        // TODO Auto-generated method stub
        super.input();
        System.out.println("Enter the hours of overtime: ");
        hoursOfOvertime = Integer.valueOf(sc.nextLine());
        System.out.println("Enter the wage: ");
     

    }
    @Override
    public long salaryCalculator() {
        // TODO Auto-generated method stub
    
        // TODO Auto-generated method stub
        return this.getBasicSalary() + hoursOfOvertime * 200000;
    
    }
   @Override
   public String toString() {
       // TODO Auto-generated method stub
       return super.toString()+" "+hoursOfOvertime+" "+salaryCalculator();
   }
    
    
}
