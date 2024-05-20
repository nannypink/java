package chapter9d;

public class TasteTester {

    public static void main(String[] args){
        Cake cake = new Cake("TripleChocolate");
        cake.setPrice(15.99);
        System.out.println("Cake flavour: " + cake.getFlavour());
        System.out.println("Cake price: " + cake.getPrice());

        BirthdayCake birthday = new BirthdayCake();
        birthday.setCandles(10);
        birthday.setPrice(20.00);
        System.out.println("Cake flavour: " + birthday.getFlavour());
        System.out.println("No of candles: " + birthday.getCandles());
        System.out.println("Cake price: " + birthday.getPrice());

        WeddingCake wedding = new WeddingCake();
        wedding.setFlavour("Fruit");
        wedding.setTiers(4);
        wedding.setPrice(100.00);
        System.out.println("Cake flavour: " + wedding.getFlavour());
        System.out.println("No of tiers: " + wedding.getTiers());
        System.out.println("Cake price: " + wedding.getPrice());
    }

}


