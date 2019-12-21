
package poo;

/**
 *
 * @author Hassan
 */
public class exercicio2 {
    public static void main(String[] args) {
        
        double [][] notasAlunos = new double[3][4];
        notasAlunos [0][1] = 10;
        notasAlunos [0][2] = 7;
        notasAlunos [0][3] = 9;
        notasAlunos [0][4] = 9.5;
        
        notasAlunos [1][0] = 9;
        notasAlunos [1][1] = 8;
        notasAlunos [1][2] = 7;
        notasAlunos [1][3] = 9;
        
        notasAlunos [2][0] = 8;
        notasAlunos [2][1] = 9;
        notasAlunos [2][2] = 10;
        notasAlunos [2][3] = 7;
        
       for (int i=0; i<notasAlunos.length; i++){
          // System.out.print("notasAlunos[i] +" ");  
          for (int j=0; j<notasAlunos[i].length; j++){
              System.out.print(notasAlunos[i][j]+" -");
          }
           System.out.print("calculando a media de cada aluno");
           
         double soma;    
       for (int i=0; i<notasAlunos.length; i++){
          
          for (int j=0; j<notasAlunos[j].length; j++){
              soma += notasAlunos[i][j];
              
              System.out.println("media do aluno" + i + " e = "+ (soma/4));
       }
    }
}
