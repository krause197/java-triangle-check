class Triangle {
  public int mSide1;
  public int mSide2;
  public int mSide3;

  public Triangle(int side1, int side2, int side3) {
    mSide1 = side1;
    mSide2 = side2;
    mSide3 = side3;
  }

  public static void checkTriangle (int side1, int side2, int side3) {
    if (side1 + side2 <= side3 || side2 + side3 <= side1 || side1 + side3 <= side2) {
      System.out.println("This is not a triangle.");
    } else if (side1 == side2 && side2 == side3) {
      System.out.println("This is an Equilateral Triangle.");
    } else if (side1 != side2 && side2 != side3) {
      System.out.println("This is a Scalene Triangle.");
    } else {
      System.out.println("What did you do?");
    } // End else
  } // End checkTriangle
} // End Class
