public class Person {

    private String name;
    private int age;
    private String position;
    private String job;
    private int salary;

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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Person(){
    }
    public Person(String name, int age, String position, String job, int salary){
        this.name = name;
        this.age = age;
        this.position = position;
        this.job = job;
        this.salary = salary;
    }

    public static void main(String[] args) {
        Person per1 = new Person();
        per1.setName("Roman");
        System.out.println(per1.getName());
    }
}
