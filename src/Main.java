import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Quantos alunos deseja informar");
        int QtdeAlunos = input.nextInt();

        System.out.println("Quantas notas por aluno?");
        int QtdeNotas = input.nextInt();

        double [] [] notasTurma = new double [QtdeAlunos] [QtdeNotas];
        double Total = 0;

        for(int i = 0; i < notasTurma.length; i++){
            for(int j = 0; j < notasTurma[j].length; j++){

                System.out.printf("informe a nota" , i+ 1, j+ 1);
                notasTurma [i] [j] = input.nextDouble();
                Total += notasTurma [i] [j];

            }

        }
        double Media = Total /(QtdeAlunos * QtdeNotas);
        if(Media < 10){
            System.out.println("Aluno Reprovado");

        }else {
            System.out.println("Aprovado");
        }





    }
    }
