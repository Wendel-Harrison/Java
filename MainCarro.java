import java.util.Scanner;

public class MainCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Ligar o carro");
            System.out.println("2. Acelerar o carro");
            System.out.println("3. Frear o carro");
            System.out.println("4. Desligar o carro");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    carro.ligar();
                    break;
                case 2:
                    carro.acelerar();
                    break;
                case 3:
                    carro.frear();
                    break;
                case 4:
                    carro.desligar();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 5);

        scanner.close();
    }
}
