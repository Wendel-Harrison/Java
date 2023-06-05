package celular;
import java.util.Scanner;

public class MainCelular {
    public static void main(String[] args) {
        Celular celular = new Celular();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Ligar o celular");
            System.out.println("2. Desligar o celular");
            System.out.println("3. Fazer chamada");
            System.out.println("4. Enviar mensagem");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    celular.ligar();
                    break;
                case 2:
                    celular.desligar();
                    break;
                case 3:
                    celular.fazerChamada();
                    break;
                case 4:
                    celular.enviarMensagem();
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