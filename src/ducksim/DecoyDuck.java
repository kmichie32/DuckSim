package ducksim;

import java.awt.Color;

public class DecoyDuck extends Duck{

    public DecoyDuck() {
        setColor(Color.ORANGE);
        flyBehavior = new FlyNoWay();
        quackBehavior = new QuackNoWay();
    }    
    
    @Override
    public String getQuack() {
        return "";
    }

    @Override
    public String display() {
        return "Decoy";
    }

}
