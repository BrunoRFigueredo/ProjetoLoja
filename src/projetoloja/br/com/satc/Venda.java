/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoloja.br.com.satc;

import java.util.ArrayList;

/**
 *
 * @author bruno.149417
 */
public class Venda {
    
    private String Cliente;
    private ArrayList <Produto> produtos = new ArrayList <Produto>();
    private float totalAPagar;
    private char Status;
    private int id;

    public Venda(String Cliente, float totalAPagar, char Status, int id) {
        this.Cliente = Cliente;
        this.totalAPagar = totalAPagar;
        this.Status = Status;
        this.id = id;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public float getTotalAPagar() {
        return totalAPagar;
    }

    public void setTotalAPagar(float totalAPagar) {
        this.totalAPagar = totalAPagar;
    }

    public char getStatus() {
        return Status;
    }

    public void setStatus(char Status) {
        this.Status = Status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    
    @Override
    public String toString() {
        return "Venda{" + "Cliente=" + Cliente + ", produtos=" + produtos + ", totalAPagar=" + totalAPagar + ", Status=" + Status + ", id=" + id + '}';
    }
    
    
}
