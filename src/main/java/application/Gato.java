package application;

public class Gato extends Animal {
    
    public Gato(String nome){
        super(nome);
    }
    
    @Override
    public String comunicar(){
        return "Miau";
    }

    public String comunicar(String prefixo){
        return prefixo + " : " + this.comunicar();
    }
    
}
