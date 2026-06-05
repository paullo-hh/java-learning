package operations;

import java.util.Scanner;

public class MathOperations {
    public void add() {
        Scanner scanner = new Scanner(System.in);
        String num1;
        String num2;

        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextBigInteger().toString();

        System.out.print("Digite o segundo número: ");
        num2 = scanner.nextBigInteger().toString();

        if (!num1.isEmpty() || !num2.isEmpty()) {
            int number1 = Integer.parseInt(num1);
            int number2 = Integer.parseInt(num2);

            System.out.println("O resultado da soma é: " + (number1 + number2));
        } else {
            System.out.println("Número inválido!");
            scanner.next(); // Limpa a entrada incorreta
        }
    }

    public void sub() {
        Scanner scanner = new Scanner(System.in);
        String num1;
        String num2;

        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextBigInteger().toString();

        System.out.print("Digite o segundo número: ");
        num2 = scanner.nextBigInteger().toString();

        if (!num1.isEmpty() || !num2.isEmpty()) {
            int number1 = Integer.parseInt(num1);
            int number2 = Integer.parseInt(num2);

            System.out.println("O resultado da subtração é: " + (number1 - number2));
        } else {
            System.out.println("Número inválido!");
            scanner.next(); // Limpa a entrada incorreta
        }
    }

    public void mult() {
        Scanner scanner = new Scanner(System.in);
        String num1;
        String num2;

        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextBigInteger().toString();

        System.out.print("Digite o segundo número: ");
        num2 = scanner.nextBigInteger().toString();

        if (!num1.isEmpty() || !num2.isEmpty()) {
            int number1 = Integer.parseInt(num1);
            int number2 = Integer.parseInt(num2);

            System.out.println("O resultado da multiplicação é: " + (number1 * number2));
        } else {
            System.out.println("Número inválido!");
            scanner.next(); // Limpa a entrada incorreta
        }
    }

    public void div() {
        Scanner scanner = new Scanner(System.in);
        String num1;
        String num2;

        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextBigInteger().toString();

        System.out.print("Digite o segundo número: ");
        num2 = scanner.nextBigInteger().toString();

        if (!num1.isEmpty() || !num2.isEmpty()) {
            try {
                int number1 = Integer.parseInt(num1);
                int number2 = Integer.parseInt(num2);

                if (number1 != 0 || number2 != 0) {
                    System.out.println("O resultado da divisão é: " + (number1 / number2));
                } else {
                    System.out.println("Divisor não pode ser zero.");
                }
            } catch (ArithmeticException e) {
                System.out.println("Erro ao tentar realizar a divisão de " + num1 + " por " + num2 + ". Detalhes: " + e.getMessage());
            }
        } else {
            System.out.println("Número inválido!");
            scanner.next(); // Limpa a entrada incorreta
        }
    }
}
