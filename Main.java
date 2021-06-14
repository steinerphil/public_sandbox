class Main {
  public static void main(String[] args) {
    System.out.println("");

   Hamburger bigmac = new Hamburger("white", true);


    bigmac.addSalat(3);
    bigmac.addTomato(5);
    System.out.println(bigmac.getPrice());
  }
}