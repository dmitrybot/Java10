package ex2;

import ex2.chairs.FunctionalChair;
import ex2.chairs.MagicanChair;
import ex2.chairs.VictorianChair;
import ex2.factories.AbstractChairFactory;
import ex2.factories.FunctionalFactory;
import ex2.factories.MagicanFactory;
import ex2.factories.VictorianFactory;

public class ChairTest {

    public static void main(String[] args) {
        Client c = new Client();
        AbstractChairFactory factory;
        factory = new MagicanFactory();
        c.setChair(factory.createChair());
        ((MagicanChair) c.chair).doMagic();
        factory = new FunctionalFactory();
        c.setChair(factory.createChair());
        int z = ((FunctionalChair) c.chair).sum(1, 2);
        factory = new VictorianFactory();
        c.setChair(factory.createChair());
        int age = ((VictorianChair) c.chair).getAge();

    }
}
