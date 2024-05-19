package chapter9;

public class Square extends Rectangle{
    @Override // tells Java you're overriding the method from the super class with same name and signature
    public double calculatePerimeter() {
        return sides * length;
    }
}
