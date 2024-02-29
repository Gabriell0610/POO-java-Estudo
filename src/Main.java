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

        Celular celularB = new Celular();
        celularB.nome = "Galaxy Note Ultra";
        celularB.tamanhoTela = 6.9f;
        celularB.armazenamento = 250;
        celularB.sistemaOperacional = "Android";

        System.out.format("Celular %s com tela de %.1f, com %dgb e SO %s\n",
                celularA.nome, celularA.tamanhoTela, celularA.armazenamento, celularA.sistemaOperacional
        );
        System.out.format("Celular %s com tela de %.1f, com %dgb e SO %s",
                celularB.nome, celularB.tamanhoTela, celularB.armazenamento, celularB.sistemaOperacional
        );

    }
}