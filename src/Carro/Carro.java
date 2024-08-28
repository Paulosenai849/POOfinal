package Carro;

import java.util.Scanner;

public class Carro {
    String nome;
    String marca;
    String modelo;
    int ano;
    // funções da classe carro, açõs do carro
    public void ligarCarro(){
        System.out.println("carro ligado!!");
    }

    public void imprimirDados(){
        System.out.println("carro: " + nome);
        System.out.println("ano: " + ano);
        System.out.println("marca: " + marca);
        System.out.println("modelo: " + modelo);

    }

    public void lerDados(){
        Scanner ler =  new Scanner(System.in);
        System.out.println("Digite o nome do carro: ");
        nome = ler.nextLine();

        System.out.println("Digite a marca do carro: ");
        marca = ler.nextLine();
        System.out.println("Digite o modelo do arro: ");
        modelo = ler.nextLine();
        System.out.println("Digite o ano do carro: ");
        ano = ler.nextInt();
    }
}




