package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Prodotto lampada = new Prodotto("Lampada",
                "Lampada che fa la luce ",
                new BigDecimal(13.89),
                new BigDecimal(0.22));

        System.out.println("prezzo base: " + lampada.getBasePrice());
        System.out.println("prezzo incluso di iva: " + lampada.getTaxInclusivePrive());
        System.out.println("nome esteso: " + lampada.getFullName());

        Prodotto sveglia = new Prodotto("Sveglia",
                "Sveglia per non fare tardi la mattina",
                new BigDecimal(7.5),
                new BigDecimal(0.22));
        System.out.println("prezzo base: " + sveglia.getBasePrice());
        System.out.println("prezzo incluso di iva: " + sveglia.getTaxInclusivePrive());
        System.out.println("nome esteso: " + sveglia.getFullName());

    }

}
