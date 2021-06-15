class Main {
  public static void main(String[] args) {
    System.out.println("");

   Hamburger bigmac = new Hamburger("white", true);
HealthyBurger mcvegan = new HealthyBurger(true);

    bigmac.addSalat(3);
    bigmac.addTomato(5);
    System.out.println(bigmac.getBreadType() + " and " + bigmac.getPrice());

  System.out.println(mcvegan.addSalat(2));
  System.out.println(mcvegan.addVegetable("Cucumber", 7));
    System.out.println(mcvegan.getBreadType() + " and " + mcvegan.getPrice());


  }
}