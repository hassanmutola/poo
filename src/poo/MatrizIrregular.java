package poo;

import java.util.Scanner;

/**
 *
 * @author Hassan
 */
public class MatrizIrregular {
    
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
         
System.out.println("entre com o numero de pessoas que serao entrevistadas");
int numEntrevistados = scan.nextInt();
         
String[][] nomesFilhos = new String[numEntrevistados][];
         
for (int i=0; i<nomesFilhos.length; i++){
         
System.out.println("entre com a quantidade de filhos");
int qtdFilhos = scan.nextInt();
             
nomesFilhos[i] = new String[qtdFilhos];
             
 for (int j=0; j<nomesFilhos[i][j].length(); j++){
     
     System.out.println("digite o nome do filho" + (j+1));
     
     nomesFilhos[i][j] = scan.next();
             }
             
         }
for (int i=0; i<nomesFilhos.length; i++){
System.out.println("pessoa " + i + "tem " + nomesFilhos[i].length+ "Filhos");
for (int j=0; j<nomesFilhos[i][j].length(); j++){
    System.out.println("poo.MatrizIrregular.main()");    
}
}
    }
}
