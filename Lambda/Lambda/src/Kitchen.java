public class Kitchen extends Employee{
    private long serviceCharge;

    public Kitchen(int id, String name, int age, long basicSalary, long serviceCharge) {
        super(id, name, age, basicSalary);
        this.serviceCharge = serviceCharge;
    }

    public long getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(long serviceCharge) {
        this.serviceCharge = serviceCharge;
    }
    @Override
    public long calculatorSalary() {
        // TODO Auto-generated method stub
        return getBasicSalary()+serviceCharge;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+" "+serviceCharge+" "+calculatorSalary();
    }
}
