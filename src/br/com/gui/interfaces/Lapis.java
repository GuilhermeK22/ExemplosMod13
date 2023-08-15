package br.com.gui.interfaces;

public class Lapis implements ICaneta{
    @Override
    public void escrever(String texto) {
        System.out.println("Escrevendo o valor" + texto + "na clase" + getClass().getSimpleName());
    }

    @Override
    public String getCor() {
        return "Preto";
    }
}
