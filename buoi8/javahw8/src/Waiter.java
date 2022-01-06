public class Waiter extends Employee {
    private long compenstate;

    public Waiter(int id, String name, int age, long basicSalary, long compenstate) {
        super(id, name, age, basicSalary);
        this.compenstate = compenstate;
    }

    public long getCompenstate() {
        return compenstate;
    }

    public void setCompenstate(long compenstate) {
        this.compenstate = compenstate;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + "Compenstate:" + compenstate + " - " + "Total Salary:" + calculatorSalary();
    }

    @Override
    public long calculatorSalary() {
        return compenstate + super.getBasicSalary();
    }

}
