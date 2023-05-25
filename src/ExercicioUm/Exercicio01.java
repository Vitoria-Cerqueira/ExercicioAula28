package ExercicioUm;


import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Você deseja criar: \n 1- Lâmpada Incadescente \n 2- Lampada Flourescente");
        System.out.println(FabricaLampada.construir(teclado.nextInt()));

    }
}