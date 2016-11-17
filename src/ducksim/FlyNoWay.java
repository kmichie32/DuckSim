package ducksim;

public class FlyNoWay implements FlyBehavior {
    
    public State fly() {
        return State.SWIMMING;
    }

}
