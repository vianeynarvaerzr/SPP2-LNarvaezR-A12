/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.lnarvaezr.a12;
import javax.swing.JOptionPane;
/**
 *
 * @author Vianey_Narváez
 */
public class SPP2LNarvaezRA12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double estatura;
    double peso;
    double imc;
    double e=metodo("Introduce tu estatura");
    double p=metodo("Introduce el peso");
    imc=p/Math.pow(e,2);
    JOptionPane.showMessageDialog(null,"Tu imc es"+imc);
    }
    public static double metodo(String mensaje){
        boolean band;
        double dato=0;
        do{
            try{
                String usuario =JOptionPane.showInputDialog(null,mensaje);
                dato=Double.parseDouble(usuario);
                band=false;
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Error");
                band=true;
            }
        
    }while(band);
    return dato;
}
}
