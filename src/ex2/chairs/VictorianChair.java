package ex2.chairs;

public class VictorianChair implements Chair{
    private int age;

    public VictorianChair(int age){
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
