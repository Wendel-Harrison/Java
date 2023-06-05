package celular;

import java.util.Scanner;

public class Celular {
    private boolean ligado;

    public Celular() {
        ligado = false;
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("O celular está ligado.");
        } else {
            System.out.println("O celular já está ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("O celular está desligado.");
        } else {
            System.out.println("O celular já está desligado.");
        }
    }

    public void fazerChamada() {
        if (ligado) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Informe o número para fazer a chamada: ");
            String numero = scanner.nextLine();
            System.out.println("Fazendo chamada para o número: " + numero);
        } else {
            System.out.println("O celular precisa estar ligado para fazer chamadas.");
        }
    }

    public void enviarMensagem() {
        if (ligado) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Informe o número para enviar a mensagem: ");
            String numero = scanner.nextLine();
            System.out.print("Digite a mensagem: ");
            String mensagem = scanner.nextLine();
            System.out.println("Enviando mensagem para o número: " + numero);
            System.out.println("Mensagem: " + mensagem);
        } else {
            System.out.println("O celular precisa estar ligado para enviar mensagens.");
        }
    }
}