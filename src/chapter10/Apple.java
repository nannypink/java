package chapter10;

public class Apple extends Fruit{
    public Apple(int calories) {
        super(calories);
    }

    public void core(){
        System.out.println("Apple core removed");
    }
    public void deSeed(){
        System.out.println("Seeds removed");
    }
    @Override
    public void makeJuice(){
        System.out.println("Made apple juice");
    }
}
