package garrafa;

public class Garrafa {
    private double capacidadeMaxima;
    private double volumeAtual;

    public Garrafa(double capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
        this.volumeAtual = 0;
    }

    public void encher(double quantidade) {
        if (volumeAtual + quantidade <= capacidadeMaxima) {
            volumeAtual += quantidade;
            System.out.println("A garrafa foi enchida com " + quantidade + " ml de líquido.");
        } else {
            System.out.println("A garrafa não suporta essa quantidade de líquido.");
        }
    }

    public void esvaziar() {
        if (volumeAtual > 0) {
            System.out.println("Você esvaziou a garrafa, tinha " + volumeAtual + " ml de líquido.");
            volumeAtual = 0;
        } else {
            System.out.println("A garrafa já está vazia.");
        }
    }

    public void beber(double quantidade) {
        if (quantidade <= volumeAtual) {
            volumeAtual -= quantidade;
            System.out.println("Você bebeu " + quantidade + " ml de líquido.");
        } else {
            System.out.println("Não há líquido suficiente na garrafa para beber essa quantidade.");
        }
    }

    public void verificarVolume() {
        System.out.println("O volume atual da garrafa é de " + volumeAtual + " ml.");
    }
}