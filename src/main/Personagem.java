package main;

import java.util.Random;

public class Personagem {
    String nome;
    int nivel;
    int forca;

    //void -> significa que a função não está retornando nada
    void mostrarStatus() {

        System.out.format("O %s está no nível (%d) com %d de força\n",nome,nivel,forca);
    }

    //Função que retorna um número aleatório que será somado com a foça do personagem
    int geradorDano() {
        //Biblioteca de número aleatório
        Random gerador = new Random();
        //Variável que armazena o numero aleatório + 1
        int danoAleatorio = 1 + gerador.nextInt(19);

        int dano = forca + danoAleatorio;
        return dano;
    }


    void atacar(String alvo, String habilidade) {
        int danoCausado = geradorDano();
        if(habilidade.length() == 0){
            System.out.format("O %s atacou %s e causou %d de dano", nome, alvo, forca);
        }else {
            System.out.format("O %s atacou %s com a habilidade (%s) e causou %d de dano", nome, alvo, habilidade, danoCausado);
        }
    }


}
