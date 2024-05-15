package chapter6.phoneBill;

public class PhoneBill {
    private int id;
    private double planFee;
    private double allottedMins;
    private double usedMins;

// overloaded constructors
    public PhoneBill(){
        this.id = 0;
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
    public double calculateOverageFee(){
        if(usedMins <= allottedMins){
            return 0;
        }
        double overageMins = usedMins - allottedMins;
        return overageMins * 0.25;
    }

    public double calculateTax(){

        return (planFee + calculateOverageFee()) * 0.15;
    }

    public double calculateTotal(){
        return planFee + calculateOverageFee() + calculateTax();
    }

    public void printFinalBill(){
        System.out.println("Your total bill is:");
        System.out.println("Plan Fee: $" + planFee);
        System.out.println("Overage Fee: $" + calculateOverageFee());
        System.out.println("Tax: $" + calculateTax());
        System.out.println("Total payable: $" + calculateTotal());
    }

}
