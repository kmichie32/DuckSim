package ducksim;

public class StarBling extends Bling {
    Duck duck;
    
    public StarBling(Duck duck) {
        this.duck = duck;
    }
    
    @Override
    public String display() {
        return duck.display() + ":*";
    }

}
