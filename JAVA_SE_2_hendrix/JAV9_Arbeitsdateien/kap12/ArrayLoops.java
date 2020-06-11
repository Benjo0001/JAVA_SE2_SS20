package com.herdt.java9.kap12;

class ArrayLoops
{
  public static void main(String[] args)
  {
    int[] square = new int[10];
    for (int i = 0; i < square.length; i++)
      square[i] = i * i;

    for (int i = 0; i < square.length; i++)
      System.out.println(square[i]);

    for (int sq : square)
      System.out.println(sq);
  }
}
