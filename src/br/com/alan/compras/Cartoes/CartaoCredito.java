/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.alan.compras.Cartoes;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alan_
 */
public class CartaoCredito {
    
    private double saldo;
    private double limite = 1000.0;
    private String bandeira;
    private List<Compra> compra;
    public CartaoCredito(String bandeira, double saldo){
        this.bandeira = bandeira;
       
        this.saldo = saldo;
        this.limite = this.limite + this.saldo;
        this.compra = new ArrayList<>();
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getBandeira() {
        return bandeira;
    }

    public List<Compra> getCompras() {
        return compra;
    }
    
    public boolean lancaCompra(Compra item){
        if (this.limite > item.getValor()){
            this.limite -= item.getValor();
            System.out.println("Compra realizada com sucesso.");
            compra.add(item);
            return true;
        } else {
            return false;
        }
    }
    
}
