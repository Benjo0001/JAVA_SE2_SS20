package com.herdt.java9.kap12;
import static com.herdt.java9.kap12.Creature.*;

public class EnumerationTyp
{
  public static void main(String[] args)
  {
     Creature oneCreature = SNAKE;
     Creature anotherCreature = SPIDER;

     System.out.println(oneCreature.description());
     System.out.println(anotherCreature.description());
  }
}
