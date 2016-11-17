package ducksim;

public class QuackSqueek implements QuackBehavior{

    @Override
    public State quack() {
        return State.QUACKING;
    }

}
