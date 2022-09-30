package pt.uma;

public class Aula1 {

    public static void main(final String[] arguments) {
        hello();

        System.out.println(perimRect(1,2));

        System.out.println(volPare(5,8, 78));

        System.out.println(tempCel(96));

        System.out.println(segundos(3, 20, 20));

        int[] arr = {1,2,3,4,5,9,6,30};

        System.out.println(max(arr));

        System.out.println(min(arr));

        System.out.println(media(arr));
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

    private static double tempCel(double faren) {
        return (faren - 32.0) * (5.0/9.0);
    }

    private static double segundos(double horas, double mins, double segs){
        return ((horas/60.0)/60.0) + (mins/60.0) + (segs);
    }

    private static int max(int[] numeros){
        int maior = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        return maior;
    }

    private static int min(int[] numeros) {
        int minimo = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] <= minimo) {
                minimo = numeros[i];
            }
        }
        return minimo;
    }

    private static double media(int[] numeros) {
        double med = 0.0;
        for (int i = 0; i < numeros.length; i++) {
                med += numeros[i];
        }
        return (med/numeros.length);
    }

};