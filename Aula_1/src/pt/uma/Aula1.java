package pt.uma;

public class Aula1 {

    public static void main(final String[] arguments) {
        hello();

        System.out.println(perimRect(1,2));

        System.out.println(volPare(5,8, 78));

        System.out.println(tempCel(96));

        System.out.println(segundos(3, 20, 20));
    };

    private static void hello() {
        System.out.println("Hello world!");
    };

    private static int perimRect(int lado1, int lado2){
        return 2 * (lado1 + lado2);
    }

    private static int volPare(int comprimento, int altura, int largura){
        return comprimento * altura * largura;
    }

    private static int tempCel(int faren) {
        return (faren - 32)*(5/9);
    }

    private static int segundos(int horas, int mins, int segs){
        return ((horas/60)/60) + (mins/60) + (segs);
    }

    private static int max(int[] numeros){
        int maior = numeros[0];
        for (int i = 1; i == numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        return maior;
    }

    private static int min(int[] numeros){
        return ();
    }

    private static int media(int[] numeros){
        return ();
    }

};