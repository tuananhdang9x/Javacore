public abstract class Employee {
    private int id;
    private String name;
    private int age;
    private long basicSalary;

    public Employee(int id, String name, int age, long basicSalary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.basicSalary = basicSalary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(long basicSalary) {
        this.basicSalary = basicSalary;
    }

    @Override
    public String toString() {
        return "ID number:" + id + " - " + "Name:" + name + " - " + "Age:" + age + " - " + "BasicSalary:" + basicSalary;
    }

    public abstract long calculatorSalary();

}
