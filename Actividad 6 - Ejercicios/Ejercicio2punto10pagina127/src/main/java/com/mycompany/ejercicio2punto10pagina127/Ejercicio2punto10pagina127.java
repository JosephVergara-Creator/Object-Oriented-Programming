/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2punto10pagina127;

/**
 *
 * @author Josep
 */
public class Ejercicio2punto10pagina127 {

    public static void main(String[] args) {
            Pedido pedido1 = new Pedido();
        pedido1.calcularPedido("Sancocho", 5000, "Gaseosa", 2000);
 
        Pedido pedido2 = new Pedido();
        pedido2.calcularPedido("Crema de verduras", 5000,
                "Churrasco", 6000, "Gaseosa", 2000);
 
        Pedido pedido3 = new Pedido();
        pedido3.calcularPedido("Crema de espinacas", 5000, "Salmón", 10000,
                "Tiramisú", 5000, "Gaseosa", 2000);
    }
}
