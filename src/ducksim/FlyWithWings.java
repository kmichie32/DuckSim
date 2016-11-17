package ducksim;

public class FlyWithWings implements FlyBehavior{     
    
    public State fly() {
        return State.FLYING;
    }

}