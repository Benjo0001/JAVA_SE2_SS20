import java.io.BufferedReader;

public class BufferedReaderPro{
    public static void main(String[] args){

        int zahl = getInput();
      

    }
    static int getInput(){
        int n;
        String z;
            //call for input
        System.out.println("Enter a number");

        //read Input
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader();
        z = br.readLine();

        try{
        n = Integer.parseInt(z);    //parse String to Integer
        }catch(Excaption e){
            System.out.println("Can't not convert String to int");
            n=0;
        }

        System.out.println("eingelesene Daten: Zahl + 2 = "+ (n+2));
        return n;
    }
}

