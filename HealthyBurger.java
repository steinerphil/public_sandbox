public class HealthyBurger extends Hamburger {

private String vegetable;
private boolean veganPatty;

public HealthyBurger(boolean veganPatty){
  super("Brown Rye", false);

}

public String addVegetable(String name, int amount){
this.vegetable = name;
double vegetablePrice = 0.5;
double cost = amount * vegetablePrice;
super.price += cost;

  return amount + " " + vegetable + " added, costs $" + cost;
}


}
