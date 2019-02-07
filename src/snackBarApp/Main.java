package snackBarApp;

public class Main {

  public static void vending() {
System.out.println("\n");
    Customer cust1 = new Customer("Jane", 45.25);
    Customer cust2 = new Customer("Bob", 33.14);

    VendingMachine food = new VendingMachine("Food");
    VendingMachine drink = new VendingMachine("Drink");
    VendingMachine office = new VendingMachine("Office");

    Snack chips = new Snack("Chips", 36, 1.75, food.id);
    Snack chocolateBar = new Snack("Chocolate Bar", 36, 1.00, food.id);
    Snack pretzel = new Snack("Pretzel", 30, 2.00, food.id);

    Snack soda = new Snack("Soda", 24, 2.50, drink.id);
    Snack water = new Snack("Water", 20, 2.75, drink.id);

    cust1.buyWithCash(soda, 3);
    cust1.buyWithCash(pretzel, 1);

    cust2.buyWithCash(soda, 2);
    cust1.addCash(10);

    cust1.buyWithCash(chocolateBar, 1);
    pretzel.addQuantity(12);
    cust2.buyWithCash(pretzel, 3);

  }

  public static void main(String[] args) {
    vending();
  }
}