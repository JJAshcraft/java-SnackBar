package snackBarApp;

class Snack {
  private static int maxId = 0;
  public String name;
  public int quantity;
  public double cost;
  public int vendingMachineID;
  public double total;

  public Snack(String name, int quantity, double cost, int vendingMachineID) {
    maxId++;
    int id = maxId;
    this.name = name;
    this.quantity = quantity;
    this.cost = cost;
    this.vendingMachineID = vendingMachineID;
  }

  public void setName(String name) {
    this.name = name;
    System.out.println("new name is" + this.name);
  }

  public int getQuantity() {
    
    return quantity;
  }

  public void addQuantity(int addquantity) {
    this.quantity += addquantity;
    System.out.println(this.name + " quantity updated: +" + addquantity + "\n");
  }

  public void buySnack(int quantity) {

    if (this.quantity - quantity > 0) {
      this.quantity -= quantity;
    } else {
      System.out.println("Unable to dispense " + quantity);
    }

  }

  public double getTotalCost(int quantity) {
    total = this.cost * quantity;
    System.out.println("Total Cost is " + total);
    return total;
  }

  @Override
  public String toString() {
    String rtnStr = "name: " + this.name + "\n" + "quantity: " + this.quantity + "\n" + "cost: " + this.cost + "\n"
        + "vending machine ID " + this.vendingMachineID + "\n";
    return rtnStr;
  }
}