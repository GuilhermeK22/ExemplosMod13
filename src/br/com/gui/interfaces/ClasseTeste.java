package br.com.gui.interfaces;

import br.com.gui.interfaces.CanetaEsferografica;
import br.com.gui.interfaces.Giz;
import br.com.gui.interfaces.Lapis;
import br.com.gui.interfaces.ICaneta;
import java.util.List;

public class ClasseTeste {
    public static void main(String args[]) {
        ICaneta caneta = new CanetaEsferografica();
        caneta.escrever("Olá Guilherme");
        System.out.println(caneta.getCor());

        ICaneta giz = new Giz();
        giz.escrever("Olá Guilherme");
        System.out.println(giz.getCor());

        ICaneta lapis = new Lapis();
        lapis.escrever("Olá Guilherme");
        System.out.println(lapis.getCor());
    }
}
