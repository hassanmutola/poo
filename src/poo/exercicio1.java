
package poo;

/**
 *
 * @author Hassan
 */
public class exercicio1 {
    public static void main(String[] args) {
        double tempDia001 = 31.1;
        double tempDia002 = 312;
        double tempDia003 = 33.7;
        double tempDia004 = 34;
        double tempDia005 = 33.1;
        
        double[]temperaturas = new double[365];
        temperaturas[0] = 31.3;
        temperaturas[1] = 32;
        temperaturas[2] = 33.7;
        temperaturas[3] = 34;
        temperaturas[4] = 33.1;
        
        System.out.println("o valor da temperatura do dia 1 e:" +temperaturas[2]);
        
        System.out.println("o tamanho do array: " + temperaturas.length);
        
        System.out.println("valores");
    }
    
}
