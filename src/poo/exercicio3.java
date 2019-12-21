package poo;

/**
 *
 * @author Hassan
 */
public class exercicio3 {
    
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
         
System.out.println("entre com o numero de pessoas que serao entrevistadas");
int numEntrevistados = scan.nextint();
         
String[][] nomesFilhos = new String[numEntrevistados][];
         
for (int i=0; i<nomesFilhos.length; i++){
         
System.out.println("entre com a quantidade de filhos");
int qtdFilhos = scan.nextint();
             
nomesFilhos[i] = new String[qtdFilhos];
             
 for (int j=0; j<nomesFilhos[i][j].length(); j++){
     
     System.out.println("digite o nome do filho" + (j+1));                
             }
             
         }
    }
}
