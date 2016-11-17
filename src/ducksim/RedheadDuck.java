
package ducksim;

import java.awt.Color;

public class RedheadDuck extends Duck {
    
    public RedheadDuck() {
        setColor(Color.RED);
        flyBehavior = new FlyWithWings();
        quackBehavior = new QuackNormal();
    }
    
    @Override
    public String display() {
        return "Redhead";
    }

}
