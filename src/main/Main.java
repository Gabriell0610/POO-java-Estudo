package main;

public class Main {
    public static void main(String[] args) {
        //Iphone 12 - tela de 6.1 - 256gb - IOS
        // Galaxy Note 20 Ultra - tela de 6.9 - 250gb - Android

        //Declarando um objeto do tipo Celular
        Celular celularA = new Celular();
        celularA.nome = "iPhone12";
        celularA.tamanhoTela = 6.1f;
        celularA.armazenamento = 256;
        celularA.sistemaOperacional = "IOS";

        System.out.format("Celular %s com tela de %.1f, com %dgb e SO %s\n",
                celularA.nome, celularA.tamanhoTela, celularA.armazenamento, celularA.sistemaOperacional
        );

        Personagem personagem1 = new Personagem();
        personagem1.nome = "Kratos";
        personagem1.forca = 500;
        personagem1.nivel = 29;
        personagem1.mostrarStatus();
        personagem1.atacar("Odin", "Porrada");



    }
}