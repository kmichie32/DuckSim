
package ducksim;

import java.awt.Color;

public class MallardDuck extends Duck {
    
    
    public MallardDuck() {
        setColor(Color.GREEN);
        flyBehavior = new FlyWithWings();
        quackBehavior = new QuackNormal();
    }
    
    @Override
    public String display() {
        return "Mallard";
    }
    

}
