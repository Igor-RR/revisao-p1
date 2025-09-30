package application;

public class Main {
    public static void main(String[] args) {

       Animal[] animais = new Animal[4];

       animais[0] = new Cachorro("Rex");

       animais[1] = new Gato("Mingau");

       System.out.println(animais[0].toString());

       Gato gato = new Gato("Tom");

       System.out.println(gato.comunicar("O gato diz:"));
    }
}

