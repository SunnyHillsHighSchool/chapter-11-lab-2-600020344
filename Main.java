class Main {
  public static void main(String[] args) {
    //add test cases
    int[] testCases = new int[]{496,45,6,14,8128,1245,33,28,27,33550336};
    for (int i = 0; i<testCases.length; i++)
    {
      String str = "";
      if (Perfect.isPerfect(testCases[i]))
        str = " is perfect.";
      else
        str = " is not perfect.";
      System.out.println(testCases[i] + str);
    }
  }
}
