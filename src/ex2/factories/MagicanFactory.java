package ex2.factories;

import ex2.chairs.Chair;
import ex2.chairs.MagicanChair;

public class MagicanFactory implements AbstractChairFactory{
    @Override
    public Chair createChair() {
        return new MagicanChair();
    }
}
