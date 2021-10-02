package ex2;

import ex2.chairs.Chair;

public class Client {

    public Chair chair;

    public Client(){

    }

    public Client(Chair chair){

    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }

    public void sit(){
        System.out.println("He is sitting");
    }
}
