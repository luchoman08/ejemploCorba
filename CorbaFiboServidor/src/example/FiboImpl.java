/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

/**
 *
 * @author invitado
 */
public class FiboImpl extends fibonacciPOA {

    @Override
    public String generar(int numero) {
	String cadena = "";
        for (int i = 1; i <= numero; i++) {
            double raiz = Math.sqrt(5);
            int rta = (int) ((1 / raiz) * (Math.pow((1 + raiz) / 2, i)) - (1 / raiz) * (Math.pow((1 - raiz) / 2, i)));            
            cadena += Math.round(rta) + " ";
        }
        return cadena;
    }

}