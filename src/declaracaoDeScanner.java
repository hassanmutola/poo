import java.util.Scanner;

/**
 *
 * @author Hassan
 */
public class declaracaoDeScanner {
    public static void main(String[] args) {
        int i = 0;
        Scanner sc = new Scanner (System.in);
        System.out.print("como se chamas?");
        while (sc.hasNext()){
            i++;
            System.out.println("Token: "+sc.next());
        }
        sc.close();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }
}
