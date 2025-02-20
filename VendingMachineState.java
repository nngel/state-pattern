public interface VendingMachineState {
    public void selectItem(VendingMachine machine);
    public void insertCoin(VendingMachine machine, int coin);
    public void dispenseItem(VendingMachine machine);
    public void setOutOfOrder(VendingMachine machine);
}