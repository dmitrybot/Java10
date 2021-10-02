package ex2.factories;

import ex2.chairs.Chair;
import ex2.chairs.VictorianChair;

import java.util.Random;

public class VictorianFactory implements AbstractChairFactory{
    @Override
    public Chair createChair() {
        return new VictorianChair((int) (Math.random() * 60));
    }
}
