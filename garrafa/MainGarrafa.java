package garrafa;
import java.util.Scanner;

public class MainGarrafa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double capacidadeMaxima;

        System.out.print("Informe a capacidade máxima da garrafa em ml: ");
        capacidadeMaxima = scanner.nextDouble();

        Garrafa garrafa = new Garrafa(capacidadeMaxima);

        int opcao;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Encher a garrafa");
            System.out.println("2. Esvaziar a garrafa");
            System.out.println("3. Beber líquido da garrafa");
            System.out.println("4. Verificar volume da garrafa");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Informe a quantidade de líquido para encher a garrafa em ml: ");
                    double quantidadeEncher = scanner.nextDouble();
                    garrafa.encher(quantidadeEncher);
                    break;
                case 2:
                    garrafa.esvaziar();
                    break;
                case 3:
                    System.out.print("Informe a quantidade de líquido para beber em ml: ");
                    double quantidadeBeber = scanner.nextDouble();
                    garrafa.beber(quantidadeBeber);
                    break;
                case 4:
                    garrafa.verificarVolume();
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