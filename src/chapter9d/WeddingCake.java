package chapter9d;

public class WeddingCake extends Cake{
    private int tiers;

    public WeddingCake(){
        super("Fruit");
    }

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }
}
