package com.herdt.java9.kap12;

class UseArray
{
  public static void main(String[] args)
  {
    int a = 2;
    int b = 6;
    int[] field = {3, 4, 5, a + b};
    field[2] = 7;
    System.out.printf("Anzahl Elemente: %d %n", field.length);
    for (int i = 0; i < field.length; i++)
      System.out.printf("Element %d: %d%n",i, field[i]);
  }
}
