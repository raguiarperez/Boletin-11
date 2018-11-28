/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author rafaguiarp
 */
public class Instancia {

    public Instancia() {
    }

    public void Programa() {
        long inicio, fin;
        String frase = "A documentación é todo aquel conxunto de manuais impresos ou en formato dixital que explique unha aplicación informática.";
        inicio = System.nanoTime();
        JOptionPane.showInputDialog(frase, "ESCRIBE LA SIGUIENTE FRASE" + "\n A documentación é todo aquel conxunto de manuais impresos ou en formato dixital que explique unha aplicación informática.");
        fin = System.nanoTime();
        float total = fin - inicio;
        DecimalFormat df = new DecimalFormat("#.00");
        JOptionPane.showMessageDialog(null, "Tardaches " + (df.format(total / 1e9)) + " segundos en escribir a frase");

    }
}
