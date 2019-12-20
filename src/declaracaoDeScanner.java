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
}
