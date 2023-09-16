package poo.generica;

public class Caixa<T> {
    private T item;
    private Class<T> tipo;

    public Caixa(Class<T> tipo) {
        this.tipo = tipo;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public Class<T> getTipo() {
        return tipo;
    }
}
