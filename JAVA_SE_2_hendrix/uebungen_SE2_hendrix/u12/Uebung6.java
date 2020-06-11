public class Uebung6
{
  public static void main(String[] args)
  {
    ZeitFormat t1 = new ZeitFormat12(0, 36);
    ZeitFormat t2 = new ZeitFormat12(7, 23);
    ZeitFormat t3 = new ZeitFormat12(14, 43);
    ZeitFormat t4 = new ZeitFormat24(0, 36);
    ZeitFormat t5 = new ZeitFormat24(7, 23);
    ZeitFormat t6 = new ZeitFormat24(14, 43);

    System.out.println("Ausgabe:");
    t1.printTime();
    t2.printTime();
    t3.printTime();
    t4.printTime();
    t5.printTime();
    t6.printTime();

    System.out.println();
    System.out.println("Vergleichen:");
    t1.printTime();
    t2.printTime();
    if (Uhrzeit.entspricht(t1, t2))
      System.out.println("t1 entspricht t2");
    else
      System.out.println("t1 und t2 sind verschieden");

   t1.printTime();
   t4.printTime();
   if (Uhrzeit.entspricht(t1, t4))
      System.out.println("t1 entspricht t4");
    else
      System.out.println("t1 und t4 sind verschieden");
  }
}
