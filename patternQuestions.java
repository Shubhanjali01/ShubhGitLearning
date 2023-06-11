// pattern Question to build the thought proccess


public class patternQuestions {
  public static void main(String[] args) {
    pattern1(4);
    pattern2(4);
    pattern3(4);
    pattern4(5);
    pattern5(5);
    pattern6(5);
    pattern7(5);
    pattern8(5);


  }

  static void pattern1(int n1) {
    for (int r1 = 0; r1 <= n1; r1++) {
      for (int c1 = 0; c1 <= n1; c1++) {
        System.out.print("*");
      }
      // when one row is printed the for new row we need new line
      System.out.println();
    }
    // for breaking gap between two questions solutions
    System.out.println();
  }

  static void pattern2(int n2) {
    // for no of rows(lines)
    for (int r2 = 0; r2 <= n2; r2++) {
      // for every rows,run the clos
      for (int c2 = 0; c2 <= r2; c2++) {
        System.out.print("*");
      }
      System.out.println();
    }
    System.out.println();
  }

  static void pattern3(int n3) {
    // for no of rows(lines)
    for (int r3 = 0; r3 <= n3; r3++) {
      // for every rows,run the clos
      for (int c3 = 0; c3 < n3 - r3 + 1; c3++) {
        System.out.print("*");
      }
      System.out.println();
    }
    System.out.println();
  }

  static void pattern4(int n4) {
    // for no of rows(lines)
    for (int r4 = 1; r4 <= n4; r4++) {
      // for every rows,run the clos
      for (int c4 = 1; c4 <= r4; c4++) {
        System.out.print(c4 + " ");
      }
      System.out.println();
    }
    System.out.println();
  }

  static void pattern5(int m) {
    // for no of rows(lines)
    for (int p = 1; p <= m; p++) {
      // for every rows,run the clos
      for (int q = 1; q <= p; q++) {
        System.out.print(q + " ");
      }
      System.out.println();
    }
    System.out.println();
  }

  static void pattern6(int n) {
    // how many times entire loop is running
    for (int rows = 1; rows <= n; rows++) {

      // spaces
      for (int spaces = 0; spaces < n - rows; spaces++) {
        System.out.print("  ");
      }

      // how many time colm ,colm is runing rows till 1 then 2 till row
      for (int colm = rows; colm >= 1; colm--) {
        System.out.print(colm + " ");
      }

      // continue
      for (int colm = 2; colm <= rows; colm++) {
        System.out.print(colm + " ");
      }
      System.out.println();
    }
  }

  public static void pattern7(int m1) {
    // for row line
    for (int row = 1; row <= m1; row++) {
      // first print spaces
      for (int space = 1; space <= m1 - row; space++) {
        System.out.print(" ");
      }
      // then print star
      for (int col = row; col >= 1; col--) {
        System.out.print("*");
      }
      System.out.println();
    }
    System.out.println();
  }




static void pattern8(int m2){

  for (int r = 0; r <=m2; r++) {
      for (int spac = 0; spac < m2-r; spac++) {
    System.out.print(" ");
  }

  for (int c = 0; c <=r; c++) {
    System.out.print("*");
  }
 
System.out.println();

  }
 
  
}



}