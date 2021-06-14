public class Hamburger{

private String breadType;
private boolean meat;
private double salat;
private double tomato;
private double price;

public Hamburger(String breadType, boolean meat){
  this.breadType = breadType;
  this.meat = meat;
  this.price = 1.99;
}

public String addSalat(int amount){
this.salat = amount;
double salatPrice = 0.5;
double cost = amount * salatPrice;
this.price += cost;

  return salat + " salat added, costs $" +  cost;
}

public String addTomato(int amount){
this.tomato = amount;
double tomatoPrice = 0.8;
double cost = amount * tomatoPrice;
this.price += cost;

  return tomato + " tomato added, costs $" + cost;
}

public double getPrice(){
 return this.price;
}

}