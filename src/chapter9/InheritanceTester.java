package chapter9;

public class InheritanceTester {
    public static void main(String[] args){
        // Running this calls superclass constructor first, then inherited subclass constructor
        // Must be the first line of the subclass constructor to use this!
        Employee employee = new Employee();

    }
}
