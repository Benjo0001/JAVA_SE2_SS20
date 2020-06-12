/**
 * in dieser Klasse werden Autos gespeichert mit folgenden Attributen
 * Autotyp: Coupe / Limosine / Combi / Cabrio
 * Farbe
 * Hersteller
 */

public class Autos{
    private String type;
    private String color;
    private String manufacturer;

    Autos(){
        this.setType("");
        this.setColor("");
        this.setManufacturer("");
    }

    Autos(String type, String color, String manufacturer){
        this.setType(type);
        this.setColor(color);
        this.setManufacturer(manufacturer);
    }


/**
 * @param type the type to set
 */
public void setType(String type) {
    this.type = type;
}

/**
 * @param color the color to set
 */
public void setColor(String color) {
    this.color = color;
}

/**
 * @param manufacturer the manufacturer to set
 */
public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
}


/**
 * @return the type
 */
public String getType() {
    return type;
}

/**
 * @return the color
 */
public String getColor() {
    return color;
}

/**
 * @return the manufacturer
 */
public String getManufacturer() {
    return manufacturer;
}


    
}//end of Autos

