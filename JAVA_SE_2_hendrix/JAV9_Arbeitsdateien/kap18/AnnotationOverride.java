package com.herdt.java9.kap18;

class AnnotationOverride extends AnnotationOverrideSuper
{
  @Override
  public void writeTex()
  {
    System.out.println("Ausgabe der abgeleiteten Klasse");
  }

  public static void main (String[] args)
  {
	  AnnotationOverride instance = new AnnotationOverride();
	  instance.writeText();
  }
}
