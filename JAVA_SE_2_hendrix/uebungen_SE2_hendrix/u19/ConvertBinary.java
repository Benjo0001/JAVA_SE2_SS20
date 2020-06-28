/**
    Schreiben Sie eine Klasse ConvertBinary, die eine im String-Format übergebene Binärzahl 
    in einen int-Typ umwandelt. Wird keine korrekte Zahl zur Umwandlung übergeben, 
    soll eine Exception vom Typ NoBinaryNumberException ausgelöst werden.

    Schreiben Sie eine Klasse ConvertBinaryTest zum Testen der Umwandlung.
 */
public class ConvertBinary {
   
    public static int ConvertBinaryNumberString(String bns) throws NoBinaryNumberException {
        int bn = 0;
        for (int i = 0; i < bns.length(); i++) {
            char c = bns.charAt(i);
            if(c != '1' && c != '0'){
                throw new NoBinaryNumberException(bns, i+1);
            }else{
                bn *=2;
                if(c =='1')
                    bn ++;
            }
        }
        return bn;
    }

    // public static int ConvertIntNumberString(String bns) throws NoBinaryNumberException {
    //     int bn = 0;
    //     try {
    //         bn = Integer.parseInt(bns);
            
    //     } catch (NoBinaryNumberException nbnE) {
    //         System.out.println(nbnE.getMessage()); 
    //     }
    //     return bn;
    // }
}