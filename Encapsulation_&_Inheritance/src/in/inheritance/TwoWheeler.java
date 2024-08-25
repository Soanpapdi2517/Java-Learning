package in.inheritance;

public class TwoWheeler extends Vehicle{
    protected TwoWheeler(){
        hasNoofTires = 2;
    }
    public void balance(){
        System.out.println("Two Wheeler balances on Two Tires");
    }
}
