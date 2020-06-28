/**
Übung 22

Erstellen Sie eine Anwendung zur Erfassung von Personendaten. 
Dazu sind über die Tastatur folgende Daten abzufragen: Name, Geschlecht, Größe (in cm) und Gewicht (in kg). 
Lesen Sie die Daten erst in einen Puffer und schreiben Sie die eingegebenen Werte dann in eine Datei.
 * 
 * 
 * 3 ways for reading user's input from console in Java
 * https://www.codejava.net/java-se/file-io/3-ways-for-reading-input-from-the-user-in-the-console  
 */

import java.io.*;
import java.util.Locale;

public class PersonData {
    private String name;
    private String gender;
    private double heigth;

    public PersonData(){
        name="";
        gender="";
        heigth=0;
    }
    public void setGender(String g) {
        if(g.equals("m") || g.equals("male")){
            this.gender = "male";
        }else if(g.equals("f") || g.equals("female") || g.equals("w")){
            this.gender = "female";
        }else{
           System.out.println("Your gender could not be set");
        }
    }
    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }
    public double getHeigth() {
        return heigth;
    }
    public String getName() {
        return name;
    }

    // write Data Into File

    public static void main(String[] args) throws IOException {
        PersonData p1 = new PersonData();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("\nEnter your name: ");
        //String name = reader.readLine();
        p1.setName(reader.readLine());

        System.out.print("\nEnter your gender: ");
        p1.setGender(reader.readLine());

        System.out.print("\nEnter your heigth (in m): "); 
        p1.setHeigth(Double.parseDouble((reader.readLine())) );

        //write person data in file
        PersonFileWriter.writePersonData(p1);

        
        //output - fast 
        // System.out.println("\n------------------------");
        // System.out.println("Your name is: " + p1.getName());
        // System.out.println("Your gender is: " + p1.getGender());
        
        // // format hight value with zero in the end (0.00 m)
        // //System.out.println("Your heigth is: " + String.format(Locale.ENGLISH, "%1.2f", p1.getHeigth()) + " m");
        // System.out.printf("Your heigth is: %1.2f m", p1.getHeigth());
        // System.out.println("\n------------------------\n");


    }
}