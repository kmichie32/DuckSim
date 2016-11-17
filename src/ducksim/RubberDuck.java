
package ducksim;

import java.awt.Color;

public class RubberDuck extends Duck {
    
    public RubberDuck() {
        setColor(Color.YELLOW);
        flyBehavior = new FlyNoWay();
        quackBehavior = new QuackSqueek();
    }
    
    
    @Override
    public String getQuack() {
        return "Squeek!";
    }
    
    @Override
    public String display() {
        return "Rubber";
    }


}
