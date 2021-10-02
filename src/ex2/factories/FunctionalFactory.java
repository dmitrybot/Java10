package ex2.factories;

import ex2.chairs.Chair;
import ex2.chairs.FunctionalChair;

public class FunctionalFactory implements AbstractChairFactory{
    @Override
    public Chair createChair() {
        return new FunctionalChair();
    }
}
