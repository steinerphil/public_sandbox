public class DeluxeBurger extends Hamburger{

private String chips;
private String drinks;

public DeluxeBurger(String chips, String drinks, String breadType, boolean meat){
super(breadType, meat);
super.price += 3.0;
}

@Override
public String addSalat(int amount){
  System.out.println("Can not add Salat because burger is finished");
  return "error0: adding not allowed";
}

@Override
public String addTomato(int amount){
  System.out.println("Can not add Salat because burger is finished");
  return "error0: adding not allowed";
}
}