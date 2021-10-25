import java.util.Scanner;

public class Media {


    private static float soma;
    private static float mediaFinal;

    public static void main(String[] args) {
       float soma = 0;

       notas();
       media();
       System.out.println(resultado());

   }

    private static float lerTeclado() {
       float valor;
           Scanner ler = new Scanner(System.in);
           valor = ler.nextFloat();
           return valor;
       }


    private static float notas() {
        int i;
        float[] number = new float[10];
        for (i = 0; i < 4; i++) {
            System.out.println("Informe uma nota  de 0 a 10 (" + (i+1) + "):");
            number[i] = lerTeclado();
            if (number[i] > 10 || number[i] <0){
                System.out.println("Número tem que ser entre 0 e 10");
                i--;
            }
            else {
                soma += number[i];
            }
        }
        return soma;

    }

    private static float media() {
        System.out.println("Media Final = " + soma/4);
        mediaFinal = soma / 4;
        return mediaFinal;
    }

    private static String resultado(){
        float media = mediaFinal;
        String result;
        if (media >= 7){
            result = "Aluno Aprovado";
        } else if (media >= 5 && media <7){
            result = "Aluno de Recuperação";
        } else{
            result = "Aluno Reprovado";
        }
        return result;
    }
}
