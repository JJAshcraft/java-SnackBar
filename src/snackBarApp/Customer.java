package snackBarApp;

public class Customer
{
  private static int maxId = 0;
  public int id;
  public String name;
  public double cash;

  public Customer(String name, double cash)
  {
    maxId++;
    id = maxId;
    this.name = name;
    this.cash = cash;
  }

  public void addCash(double cash)
  {
    this.cash += cash;
    System.out.println(this.name + " adds " + cash + " dollars. New Cash total is " + this.cash + "\n");
  }

  public void buyWithCash(Snack snack, int quantity)
  {
    System.out.println("Customer " + this.id + " starts purchase:");
    if(snack.getQuantity() < quantity)
    {
      System.out.println("Vending machine does not contain enough items.");
    }
    if(snack.cost * quantity <= this.cash)
    {
      this.cash -= (snack.cost * quantity);
      snack.buySnack(quantity);
      System.out.println("Customer " + this.id + " buys "+ quantity + " " + snack.name);
      System.out.println("Customer " + this.id + " cash on hand: " + this.cash);
      System.out.println("Snack " + snack.name + " new quantity: " + snack.getQuantity() + "\n");
    } else
    {
      System.out.println("Customer " + this.id + " has insufficient cash");
    }
  }
    public String getName()
    {
      return this.name;
    }
    public void setName(String name)
    {
      this.name = name;
    }
    public double cashOnHand()
    {
      return this.cash;
    }
  }

