public class Waiter extends Employee{
    private long compensate;

    public Waiter(int id, String name, int age, long basicSalary, long compensate) {
        super(id, name, age, basicSalary);
        this.compensate = compensate;
    }

    public long getCompensate() {
        return compensate;
    }

    public void setCompensate(long compensate) {
        this.compensate = compensate;
    }
    @Override
    public long calculatorSalary() {
        return compensate + getBasicSalary();
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+" - "+compensate+" - "+calculatorSalary();
    }
    public static int compare(Waiter w1,Waiter w2) {
        return w1.getName().compareTo(w2.getName());
    }
    public static long compareByWage(Waiter w1,Waiter w2) {
        return w1.calculatorSalary() - w2.calculatorSalary();
    }
}
