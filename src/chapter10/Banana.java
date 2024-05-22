package chapter10;

public class Banana extends Fruit{
    public Banana(int calories) {
        super(calories);
    }

    public void peel(){
        System.out.println("Peel banana");
    }

    public void makeSmoothie(){
        System.out.println("Banana smoothie blended");
    }
    @Override
    public void makeJuice(){
        System.out.println("Made banana juice?!");
    }
}
