import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    printNTimes("donkeu", 6);
    printNums();
  }

  public static void printNTimes(String word, int N)
  {
    for (int i = 0; i < word.length(); i++) //for each letter in the word... (loop)
    {
      String letter = word.substring(i,i+1);
      for (int j = 0; j < N; j++)           // print that letter N times (loop)
      {
        System.out.print(letter);
      }
      System.out.println();
    }
  }
  

  public static void printNums()
  {
    for (int i = 10; i > 0; i--)
    {
      
      for (int j = 0; j < i; j++)
      {
        System.out.print(i + " ");
      }
      System.out.println();
    }
  }

  public static void uprightNumberTriangle(int N)
  {
    // code solution here
  }

  public static void starTree()
  {
    // code solution here
  }

  public static void multTable()
  {
    // code solution here
  }
}
