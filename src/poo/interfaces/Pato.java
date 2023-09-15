package poo.interfaces;

public class Pato implements Animal, Ave {

    @Override
    public void comer() {
        System.out.println("pato comer");
        
    }

    @Override
    public void dormir() {
        System.out.println("pato dormir");
        
    }

    @Override
    public void voar() {
        System.out.println("pato voar");
    }
    
}
