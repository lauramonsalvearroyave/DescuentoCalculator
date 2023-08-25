
package com.mycompany.descuentocalculator;

import javax.swing.JOptionPane;

/**
 *
 * @author Laura Monsalve
 */
public class DescuentoCalculator {

    public static void main(String[] args) {
        double porcent;
        int fullPrice;
        double discountApply;
        double finalPrice;
        
        fullPrice= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor sin descuento del producto: "));
        porcent= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el descuento entregado: "));
        discountApply= (porcent/100)* fullPrice;
        finalPrice= fullPrice - discountApply;
        
        JOptionPane.showMessageDialog(null, "El precio de su producto con descuento aplicado es de " + finalPrice);
        
    }
}
