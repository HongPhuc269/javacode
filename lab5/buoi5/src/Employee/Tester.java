package Employee;

public class Tester extends Employeee{
   
    
    private int numberOfError;
    
    public Tester(int id, String name, int age, String phone, String email, long basicSalary, 
            int numberOfError) {
        super(id, name, age, phone, email, basicSalary);
        this.numberOfError = numberOfError;
       
    }

    public int getNumberOfError() {
        return numberOfError;
    }
    public void setNumberOfError(int numberOfError) {
        this.numberOfError = numberOfError;
    }
 
    public long wage()
    {
        return this.getBasicSalary() + numberOfError * 50000;
    }   
    @Override
    public void input() {
        // TODO Auto-generated method stub
        super.input();
        System.out.println("Enter the number of error: ");
        numberOfError = Integer.valueOf(sc.nextLine());
    }
    @Override
    public long salaryCalculator() {
        // TODO Auto-generated method stub
        return this.getBasicSalary() + numberOfError * 50000;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+ " " +salaryCalculator()+" " +numberOfError;
    }
}
