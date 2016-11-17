package ducksim;

public class QuackNormal implements QuackBehavior{
    
    @Override
    public State quack() {
        return State.QUACKING;
    }

}
