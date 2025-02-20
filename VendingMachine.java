import java.util.Map;
import java.util.HashMap;

public class VendingMachine {
    
    private VendingMachineState machineState;

    private Map<String,Integer> itemInventory;
    private double balance;


    public VendingMachine(double balance){
        setBalance(balance);
        setState(new IdleState());
    }

    public void setState(VendingMachineState state){
        this.machineState = state;
    }
    public VendingMachineState getState() {
        return machineState;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
}