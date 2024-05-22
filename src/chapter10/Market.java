package chapter10;

public class Market {
    public static void main(String[] args){
        Fruit apple = new Apple(40);
        apple.makeJuice();

        Apple golden = new Apple(45);
        golden.deSeed();

        Fruit banana = new Banana(120);
        banana.makeJuice();

        Banana banana1 = new Banana(120);
        banana1.makeSmoothie();
    }


}
