/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoloja.br.com.satc.menu;

/**
 *
 * @author bruno.149417
 */
public enum Menu {
    
    Maça("Maça 1 Unidade ",2.00),
    Banana("Banana 1 Unidade ",1.00),
    Refrigerante("Guarana,Pepsi 500ml ",6.00),
    Tomate("Tomate 1 Unidade ",2.00),
    Absolut("Vodka 1000ml ",30.00),
    Salgadinho("Doritos 500g ",10.00),
    Laranja("Laranja 1 Unidade ",1.00),
    Alface("Alface 1 Unidade ",4.00),
    Amaciante("Amaciante Unidade ",3.00),
    Suco("Suco de uva 300ml ",4.00);
    
    private String nome;
    private double preco;

    private Menu(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public static Menu getMaça() {
        return Maça;
    }

    public static Menu getBanana() {
        return Banana;
    }

    public static Menu getRefrigerante() {
        return Refrigerante;
    }

    public static Menu getTomate() {
        return Tomate;
    }

    public static Menu getAbsolut() {
        return Absolut;
    }

    public static Menu getSalgadinho() {
        return Salgadinho;
    }

    public static Menu getLaranja() {
        return Laranja;
    }

    public static Menu getAlface() {
        return Alface;
    }

    public static Menu getAmaciante() {
        return Amaciante;
    }

    public static Menu getSuco() {
        return Suco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Menu{" + "nome=" + nome + ", preco=" + preco + '}';
    }
    
    
    
   
}
