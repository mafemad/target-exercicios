package exercicio;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int number = scanner.nextInt();

        String resp = (isNumberInFibonacciSequence(number))? "O número pertence a sequencia fibonacci" :
                                                             "O número não pertence a sequencia fibonacci";
        System.out.println(resp);
    }

    public static boolean isNumberInFibonacciSequence(int number) {
        int a = 0;
        int b = 1;

        while (a <= number) {
            if (a == number) {
                return true;
            }
            int temp = b;
            b = a + b;
            a = temp;
        }

        return false;
    }
}
