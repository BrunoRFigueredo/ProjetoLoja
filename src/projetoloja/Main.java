/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoloja;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;
import projetoloja.br.com.satc.Cliente;
import projetoloja.br.com.satc.Produto;
import projetoloja.br.com.satc.Venda;
import projetoloja.br.com.satc.menu.CadasConsu;

/**
 *
 * @author bruno.149417
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        /*int menu = 0;
        SimpleDateFormat bru = new SimpleDateFormat("dd/MM/yyyy");
        ArrayList <Cliente> clientelist = new ArrayList <Cliente>();
        ArrayList <Produto> produtlist = new ArrayList <Produto>();
        ArrayList <Venda> vendalist = new ArrayList <Venda>();
        
        do{
        menu = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das opções:"
                + "1.Sair\n"
                + "2.Cadastro de Cliente\n"
                + "3.Cadastro de Produto\n"
                + "4.Cadastro de Vendas\n"
                + "5.Consultar Cliente\n"
                + "6.Consultar Produto\n"
                + "7.Consultar Venda"));
       
        
        
        
        switch(menu){
        
            case 2:{
             do{
        
        
            String nomeCliente = JOptionPane.showInputDialog("Qual o nome do Cliente?");
            String rgCliente = JOptionPane.showInputDialog("Qual o RG do Cliente?");
            String cpfCliente = JOptionPane.showInputDialog("Qual o CPF do Cliente?");
            Date dataNasc = bru.parse(JOptionPane.showInputDialog("Qual a data de nascimento do Cliente?"));
            Date dataCadas = bru.parse(JOptionPane.showInputDialog("Qual a data de cadastro do Cliente?"));
            int idClient = Integer.parseInt(JOptionPane.showInputDialog("Qual o ID do Cliente?"));
            char statusClient = JOptionPane.showInputDialog("Qual o status do Cliente?").charAt(0);
                 Menus.CadastrarCliente.getCadast();
             
             }while(JOptionPane.showConfirmDialog(null, "Deseja continuar?")==0);
            break;
            }
        
        
            case 3:{
            do{
            int id = Integer.parseInt(JOptionPane.showInputDialog("Qual o ID do produto?"));
            String nomeProduto = JOptionPane.showInputDialog("Qual o nome do produto?");
            String descricao = JOptionPane.showInputDialog("Qual a descrição do produto?");
            float valor = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor do produto??"));
            char statusProduto = JOptionPane.showInputDialog("Qual o status do produto?").charAt(0);
            
            
            
            }while(JOptionPane.showConfirmDialog(null, "Deseja continuar?")==0);
            
            break;
            
            }
       
            case 4:{
            
            do{
            String Cliente = JOptionPane.showInputDialog("Qual o nome do cliente?");
            float totalAPagar = Integer.parseInt(JOptionPane.showInputDialog("Quantos o cliente vai ter que pagar?"));
            char statusVenda = JOptionPane.showInputDialog("Qual o status da venda?").charAt(0);
            int idVenda = Integer.parseInt(JOptionPane.showInputDialog("Qual o id da venda?"));
            
            
            
            }while(JOptionPane.showConfirmDialog(null, "Deseja continuar?")==0);
            
            
            }
        
        
        }
        
        
        
        
        
        
        }while(menu != 1);*/
        
        
        
        
    }
    
}
