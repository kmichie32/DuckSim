package ducksim;

public class MoonBling extends Bling{
    Duck duck;
    
    public MoonBling(Duck duck) {
        this.duck = duck;
    }
    
    @Override
    public String display() {
        return duck.display() +":)";
    }

}
