package watching;

import operations.MathOperations;

import java.util.Scanner;

public class PrintInScreen {
    public void printingFirstMessage() {
        System.out.println("Olá, vamos calcular?");
    }

    public void printingSecondMessage() {
        Scanner scanner = new Scanner(System.in);
        MathOperations operation = new MathOperations();
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\n--- OPÇÕES ---");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.print("Escolha uma das opções: ");

            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("INICIANDO OPERAÇÃO DE ADIÇÃO... \n");
                        operation.add();
                        break;
                    case 2:
                        System.out.println("INICIANDO OPERAÇÃO DE SUBTRAÇÃO... \n");
                        operation.sub();
                        break;
                    case 3:
                        System.out.println("INICIANDO OPERAÇÃO DE MULTIPLICAÇÃO... \n");
                        operation.mult();
                        break;
                    case 4:
                        System.out.println("INICIANDO OPERAÇÃO DE DIVISÃO... \n");
                        operation.div();
                        break;
                    default:
                        System.out.println("Opção inválida! Tente novamente.");
                }
            } else {
                System.out.println("Por favor, digte um número válido!");
                //scanner.next();
            }
        }
        scanner.close();
    }
}
