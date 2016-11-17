package ducksim;

public class CrossBling extends Bling{
    Duck duck;
    
    public CrossBling(Duck duck) {
        this.duck = duck;
    }
    
    @Override
    public String display() {
        return duck.display() + ":+";
    }

}
