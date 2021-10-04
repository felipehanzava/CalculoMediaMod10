import java.util.Scanner;

public class Media {


    private static int soma;

    public static void main(String[] args) {
       int soma = 0;
       int mediafinal;

       notas();
       media();

   }

    private static int lerTeclado() {
       int valor;
           Scanner ler = new Scanner(System.in);
           valor = ler.nextInt();
           return valor;
       }


    private static int notas() {
        int i;
        int[] number = new int[10];
        for (i = 0; i < 4; i++) {
            System.out.println("Informe uma nota  de 0 a 10: " + (i+1));
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

    private static int media() {
        int mediaFinal = 0;
        System.out.println("Media Final = ");
        System.out.println(mediaFinal = soma / 4);
        return 0;
    }
}
