package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        // utilizziamo il primo costruttore
        Prodotto lampada = new Prodotto("lampada",
                new BigDecimal(13.99),
                new BigDecimal(0.22),
                "se l'accendi puoi vedere al buio");

        Prodotto sveglia = new Prodotto("Sveglia",
                new BigDecimal(7.5),
                new BigDecimal(0.22),
                "Sveglia per non fare tardi la mattina");
        // utilizziamo in secondo costruttore
        Prodotto portafoglio = new Prodotto("portafoglio",
                "leather foil",
                new BigDecimal(25.99),
                new BigDecimal(0.22));

        // System.out.println("prezzo base: " + lampada.getBasePrice());
        // System.out.println("prezzo incluso di iva: " +
        // lampada.getTaxInclusivePrive());
        // System.out.println("nome esteso: " + lampada.getFullName());

        // System.out.println("prezzo base: " + sveglia.getBasePrice());
        // System.out.println("prezzo incluso di iva: " +
        // sveglia.getTaxInclusivePrive());
        // System.out.println("nome esteso: " + sveglia.getFullName());

        portafoglio.setName("portafoglio in pelle");
        portafoglio.setBrand("safe money");
        portafoglio.setDescription("portafoglio ad alta sicurezza");
        portafoglio.setPrice(new BigDecimal(35.99));
        portafoglio.setTax(new BigDecimal(0.21));

        System.out.println(portafoglio.getName());
        System.out.println(portafoglio.getBrand());
        System.out.println(portafoglio.getDescription());
        System.out.println(portafoglio.getBasePrice());
        System.out.println(portafoglio.getTaxes());
        System.out.println(portafoglio.getTaxInclusivePrive());
    }

}
