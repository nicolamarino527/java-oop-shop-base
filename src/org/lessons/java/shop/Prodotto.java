package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Prodotto {
    // generiamo un codice di 5-cifre per i prodotti
    Random rand = new Random();

    // caratteristiche prodotto
    private int codice;
    private String nome;
    private String marca;
    private BigDecimal prezzo;
    private BigDecimal iva;
    private String descrizione;

    // inizzializziamo l'istanza tramite costruttore
    public Prodotto(String nome, BigDecimal prezzo, BigDecimal iva, String descrizione) {
        this.codice = rand.nextInt(99999);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;

    }

    // creiamo un secondo costruttore
    public Prodotto(String nome, String marca, BigDecimal prezzo, BigDecimal iva) {
        this.codice = rand.nextInt(99999);
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = iva;

    }

    // metodi getter

    public int getCode() {
        return this.codice;
    }

    public String getName() {
        return this.nome.toLowerCase();
    }

    public String getBrand() {
        return this.marca;
    }

    public BigDecimal getBasePrice() {
        return this.prezzo.setScale(2, RoundingMode.DOWN);
    }

    public BigDecimal getTaxes() {
        return this.iva;
    }

    public String getDescription() {
        return this.descrizione;
    }

    public BigDecimal getTaxInclusivePrive() {
        return this.prezzo.add(prezzo.multiply(iva).setScale(2, RoundingMode.DOWN));
    }

    public String getFullName() {
        return this.nome + "-" + this.codice;
    }

    // metodi setter

    public void setName(String nuovoNome) {
        this.nome = nuovoNome;
    }

    public void setBrand(String nuavaMarca) {
        this.marca = nuavaMarca;
    }

    public void setPrice(BigDecimal nuovoPrezzo) {
        this.prezzo = nuovoPrezzo.setScale(2, RoundingMode.DOWN);
    }

    public void setTax(BigDecimal nuovaIva) {
        this.iva = nuovaIva.setScale(2, RoundingMode.DOWN);
    }

    public void setDescription(String nuovaDescrizione) {
        this.descrizione = nuovaDescrizione;
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