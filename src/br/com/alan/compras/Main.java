/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.com.alan.compras;

import br.com.alan.compras.Cartoes.CartaoCredito;
import br.com.alan.compras.Cartoes.Compra;
import java.util.Collections;
import java.util.Scanner;
/**
 *
 * @author alan_
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Menu: Instanciando classe Scanner.
        Scanner leitura = new Scanner(System.in);
        CartaoCredito cartao = new CartaoCredito("Visa", 500.0);
        
        int sair = 1;
        while(sair != 0){
            System.out.println("Digite o nome do produto: ");
            String nome = leitura.next();
            
            System.out.println("Digite o valor do produto: ");
            double preco = leitura.nextDouble();
            
            // Incluindo itens na lista.
            Compra compra = new Compra(nome, preco);
            boolean compraRealizada = cartao.lancaCompra(compra);
            
            if(compraRealizada){
                
                System.out.println("Digite 0 para sair ou 1 para continuar.");
                sair = leitura.nextInt();
            } else {
                System.out.println("Saldo insuficiente.");
                System.out.println("Saindo do programa");
                sair = 0;
            }
           
        }
        
           // Imprimindo a lista:
        Collections.sort(cartao.getCompras());
        System.out.println("***************************");
        System.out.println("LISTA DE PRODUTOS COMPRADOS");
        System.out.println("***************************");

        for(Compra i : cartao.getCompras()){
        System.out.println(i.getProduto()+" = " + i.getValor());}
        
        System.out.println("Seu saldo: " + cartao.getLimite());
    }
    
}
