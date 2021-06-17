import java.util.Scanner;

class Main {

  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("");

    int[] myIntegers = getIntegers(4); //set the amount of numbers witch the user can type in

    printArray(sortIntegers(myIntegers));
  }

  public static int[] getIntegers(int count) {
    int[] array = new int[count];
    System.out.println("Enter " + count + " values:\r");
    for (int i = 0; i < array.length; i++) {
      array[i] = scanner.nextInt();
    }
    return array;
  }

  public static void printArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.println("Element " + i + " is " + array[i]);
    }
  }


  public static int[] sortIntegers(int[] array) {
    int[] sortedArray = new int[array.length];
    sortedArray = array;

    boolean isNotSorted = true; // Switch to turn while loop on/off
    int temp = 0; // for temp storing

    while (isNotSorted) {
      isNotSorted = false;
      for (int i = 0; i < sortedArray.length -1; i++) {
        if (sortedArray[i] < sortedArray[i + 1]) {
          temp = sortedArray[i];
          sortedArray[i] = sortedArray[i+1];
          sortedArray[i + 1] = temp;
          isNotSorted = true;
        }
      }
    }
  

    return sortedArray;
  } 


}
