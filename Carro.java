import java.util.Scanner;

public class Carro {
    private boolean ligado;
    private int velocidade;

    public Carro() {
        ligado = false;
        velocidade = 0;
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("O carro está ligado.");
        } else {
            System.out.println("O carro já está ligado.");
        }
    }

    public void acelerar() {
        if (ligado) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Informe o incremento de velocidade: ");
            int incremento = scanner.nextInt();
            scanner.nextLine();
            velocidade += incremento;
            System.out.println("O carro acelerou para " + velocidade + " km/h.");
        } else {
            System.out.println("O carro precisa estar ligado para acelerar.");
        }
    }

    public void frear() {
        if (ligado) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Informe o decremento de velocidade: ");
            int decremento = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner
            velocidade -= decremento;
            if (velocidade < 0) {
                velocidade = 0;
            }
            System.out.println("O carro freou para " + velocidade + " km/h.");
        } else {
            System.out.println("O carro precisa estar ligado para frear.");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            velocidade = 0;
            System.out.println("O carro está desligado.");
        } else {
            System.out.println("O carro já está desligado.");
        }
    }
}