class Main {
  public static void main(String[] args) {
    System.out.println("");

    Hamburger bigmac = new Hamburger("white", true);
    HealthyBurger mcvegan = new HealthyBurger(true);
    DeluxeBurger deluxe = new DeluxeBurger("Chio", "Coke", "Sesam", true);

 System.out.println("bigmac: " + bigmac.getPrice());
 System.out.println("mcvegan: " + mcvegan.getPrice());
 System.out.println("deluxe: " + deluxe.getPrice());

// proof if edding do not work as given in the challenge
deluxe.addSalat(1);
System.out.println(deluxe.addSalat(1));
System.out.println("deluxe: " + deluxe.getPrice());



  bigmac.addSalat(3);
    bigmac.addTomato(5);
    System.out.println(bigmac.getBreadType() + " and " + bigmac.getPrice());

  System.out.println(mcvegan.addSalat(2));
  System.out.println(mcvegan.addVegetable("Cucumber", 7));
    System.out.println(mcvegan.getBreadType() + " and " + mcvegan.getPrice());

*/
  }
}