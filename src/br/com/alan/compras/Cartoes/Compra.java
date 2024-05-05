/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.alan.compras.Cartoes;

/**
 *
 * @author alan_
 */
public class Compra implements Comparable<Compra>{
    
    
    private String produto;
    private double valor;
    
    public Compra(String produto, double valor){
        this.produto = produto;
        this.valor = valor;
    }

    public String getProduto() {
        return produto;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Compras{" + "Produto = " + produto + ", valor = " + valor + '}';
    }

    @Override
    public int compareTo(Compra o) {
        return Double.valueOf(this.valor).compareTo(o.getValor());
        
    }
    
}
