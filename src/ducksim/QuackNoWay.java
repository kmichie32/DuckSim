package ducksim;

public class QuackNoWay implements QuackBehavior{

    @Override
    public State quack() {
        return State.SWIMMING;
    }

}
