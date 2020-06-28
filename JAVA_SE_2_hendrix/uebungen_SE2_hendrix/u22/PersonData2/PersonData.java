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
import static java.lang.System.*;

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
        String filePath = "persons.dat";
        PrintWriter writer = new PrintWriter(new FileWriter(filePath));

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
            System.out.print("\nEnter your name: ");
            //String name = reader.readLine();
            p1.setName(reader.readLine());
    
            System.out.print("\nEnter your gender: ");
            p1.setGender(reader.readLine());
    
            System.out.print("\nEnter your heigth (in m): "); 
            p1.setHeigth(Double.parseDouble((reader.readLine())) );
            
            try {
                //write person data in file
                writer.println(p1.getName());
                writer.println(p1.getGender());
                writer.println(Double.toString(p1.getHeigth()));

            } catch (Exception e) {
                System.out.println("Fehlerhafte Eingabe: " + e.getMessage());
            }

        } catch (Exception e) {
            //TODO: handle exception
        }

        // DOES NOT WORK: writer did not write into file..
        // ... try later

    }
}