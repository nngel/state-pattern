public class OutOfOrderState implements VendingMachineState{
    public void selectItem(VendingMachine machine, int itemIndex){
        System.out.println("this machine is Out of order");
    }
    public void insertCoin(VendingMachine machine, int coin){
        System.out.println("this machine is Out of order");
    }
    public void dispenseItem(VendingMachine machine, int itemIndex){
        System.out.println("this machine is Out of order");
    }
    public void setOutOfOrder(VendingMachine machine){
        System.out.println("this machine is Out of order");
    }
}