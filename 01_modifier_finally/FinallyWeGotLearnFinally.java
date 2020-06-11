
public class FinallyWeGotLearnFinally {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            // int a = 5/0;
            System.out.println(scan.next());
        } catch (Exception e) {
            System.out.println(e);
        }finally{
            // System.out.println("This is printed out every run, it is good use for clean up");
            scan.close();
        }
    }
}