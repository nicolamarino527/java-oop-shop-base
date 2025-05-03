package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Prodotto {
    // generiamo un codice di 5-cifre per i prodotti
    Random rand = new Random();

    // caratteristiche prodotto
    public int codice;
    public String nome;
    public String descrizione;
    public BigDecimal prezzo;
    public BigDecimal iva;

    // inizzializziamo l'istanza tramite costruttore
    public Prodotto(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva) {
        this.codice = rand.nextInt(99999);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    // metodi getter

    public int getCode() {
        return this.codice;
    }

    public BigDecimal getBasePrice() {
        return this.prezzo.setScale(2, RoundingMode.DOWN);
    }

    public BigDecimal getTaxInclusivePrive() {
        return this.prezzo.add(prezzo.multiply(iva).setScale(2, RoundingMode.DOWN));
    }

    public String getFullName() {
        return this.nome + "-" + this.codice;
    }
}
// creiamo il modello del prodotto
// - codice (numero intero)
// - nome
// - descrizione
// - prezzo
// - iva

// Usate opportunamente costruttori, attributi ed eventuali altri metodi di
// “utilità” per fare in modo che:
// - alla creazione di un nuovo prodotto il codice sia valorizzato con un numero
// random
// - il prodotto esponga un metodo per avere il prezzo base
// - il prodotto esponga un metodo per avere il prezzo comprensivo di iva
// - il prodotto esponga un metodo per avere il nome esteso, ottenuto
// concatenando codice-nome