package chapter6.phoneBill;

public class PhoneBill {
    private int id;
    private double planFee;
    private double allottedMins;
    private double usedMins;
    private double overageMins;

    public PhoneBill(){
        this.id = 1;
        this.planFee = 100.00;
        this.allottedMins = 30;
        this.usedMins = 40;
    }
    public PhoneBill(int id){
        this.id = id;
        this.planFee = 100.00;
        this.allottedMins = 30;
        this.usedMins = 40;
    }

    public PhoneBill(int id, double planFee, double allottedMins, double usedMins){
        this.id = id;
        this.planFee = planFee;
        this.allottedMins = allottedMins;
        this.usedMins = usedMins;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPlanFee() {
        return planFee;
    }

    public void setPlanFee(double planFee) {
        this.planFee = planFee;
    }

    public double getAllottedMins() {
        return allottedMins;
    }

    public void setAllottedMins(double allottedMins) {
        this.allottedMins = allottedMins;
    }

    public double getUsedMins() {
        return usedMins;
    }

    public void setUsedMins(double usedMins) {
        this.usedMins = usedMins;
    }

    public double getOverageMins() {
        return overageMins;
    }

    public void setOverageMins(double overageMins) {
        this.overageMins = overageMins;
    }

    public static double calculateOverageFee(double overageMins){
        return overageMins * 0.25;
    }

    public static double calculateTax(double planFee, double overageFee){
        return (planFee + overageFee) * 0.15;
    }

    public static double calculateTotal(double planFee, double overageFee, double tax ){
        return planFee + overageFee + tax;
    }

    public static void printFinalBill(){
        System.out.println("Your total bill is:");
        System.out.println("Plan Fee: $" + planFee);
        System.out.println("Overage Fee: $" + overageFee);
        System.out.println("Tax: $" + tax);
        System.out.println("Total payable: $" + total);
    }

}
