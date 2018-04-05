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
public enum CadasConsu {
    CadastrarCliente(1),
    CadastrarProduto(2),
    CadastrarVenda(3),
    ConsultarCliente(4),
    ConsultarVenda(5),
    ConsultarProduto(6);

    
    
    
    private int cadast;
    



private CadasConsu(int cadast) {
        this.cadast = cadast;
    }

    

    public static CadasConsu getCadastrarCliente() {
        return CadastrarCliente;
    }

    public static CadasConsu getCadastrarProduto() {
        return CadastrarProduto;
    }

    public static CadasConsu getCadastrarVenda() {
        return CadastrarVenda;
    }

    public static CadasConsu getConsultarCliente() {
        return ConsultarCliente;
    }

    public static CadasConsu getConsultarVenda() {
        return ConsultarVenda;
    }

    public static CadasConsu getConsultarProduto() {
        return ConsultarProduto;
    }

    public int getCadast() {
        return cadast;
    }

    @Override
    public String toString() {
        return "CadasConsu{" + "cadast=" + cadast + '}';
    }
    
   
    
}

