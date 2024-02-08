public class ArrayOfArrays {
  public static void main (String[] args) {
    pascalSquare(5);
  }

  public static void pascalSquare (int size) {
    int[] rowAbove = new int[size];
    int[] currentRow = new int[size];

    for (int z = 0; z < size; z++) {
      currentRow[z] = 1;
      System.out.print(currentRow[z] + " ");
    }
    
    for (int x = 0; x < size; x++) {
      for (int i = 0; i < size; i++) {
        if (x == 0) {
          currentRow[i] = 1;
          rowAbove[i] = 1;
        }

        else {
          if (i == 0 || x == 0) {
            currentRow[i] = 1;
            System.out.print("1 ");
          }
          
          else {
            currentRow[i] = rowAbove[i] + currentRow[i - 1];
            System.out.print(currentRow[i] + " ");
          }
        }
      }
      System.out.println();

      for (int k = 0; k < size; k++) {
        rowAbove[k] = currentRow[k];
      }
    }
  }

  public static void example4 () {
    int[] arnesh = {75, 75, 75, 60, 79};
    int[] adi = {76, 76, 76, 61, 80};
    int[] alex = {59, 59, 59, 59, 78};
    int[][] gradebook = {arnesh, adi, alex};

    printArrayOfArrays(gradebook);
    for (int i = 0; i < 5; i++) {
      System.out.println(gradebook[1][1]);
    }
  }

  public static void example3 () {
    int[][] a = new int[5][7];
    printArrayOfArrays(a);
  }

  public static void example2 () {
    int[] a = new int[5];
    int[] b = new int[7];
    int[] c = new int[2];

    int[][] d = {a, b, c};
    printArrayOfArrays(d);
  }

  public static void example1 () {
    int[] a = {1, 2, 3, 4};
    int[] b = {5, 6, 7};

    int[][] c = {a, b};

    System.out.println(c[1][2]);
    System.out.println("Length of c: " + c.length);
    System.out.println("Length of c[0]: " + c[0].length);
    System.out.println("Length of c[1]: " + c[1].length);
    System.out.println("c: " + c);
    System.out.println("c[1]: " + c[1]);

    printArrayOfArrays(c);
  }

  public static void printArrayOfArrays (int[][] arrayOfArrays) {
    for (int i = 0; i < arrayOfArrays.length; i++) {
      for (int x = 0; x < arrayOfArrays[i].length; x++) {
        System.out.println(arrayOfArrays[i][x]);
      }
      System.out.println();
    }
  }
}