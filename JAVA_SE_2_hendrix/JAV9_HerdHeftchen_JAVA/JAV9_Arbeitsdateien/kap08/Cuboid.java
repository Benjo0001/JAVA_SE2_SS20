/*
* Beschreibung eines Quaders
*/
class Cuboid extends Rectangle
{
/*
* Attribute
*/
  private int height;

/*
* Getter und Setter
*/
  public void setHeight(int height)
  {
    this.height = height;
  }
  public int getHeight()
  {
    return height;
  }
/*
* Konstruktoren
*/


Cuboid()
  {
    this(1, 1, 1);
    setHeight(20);
  }

  Cuboid(int width, int length, int height)
  {
    super(width, length);    // Konstruktor der Superklasse wird aufgerufen
    setHeight(height);
  }


/*
* Methoden
*/
  int getBase()
  {
    return super.getArea();
  }

  public int getVolume()
  {
    return getWidth() * getLength() * getHeight() / 3;
  }

  int getArea()
  {
    return 2 * (getWidth() * getLength()
              + getWidth() * getHeight()
              + getHeight() * getLength());
  }
}

