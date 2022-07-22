/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioeldar;

import java.util.Date;


public class Amex extends Card implements methodo  {


    protected String importe;
    protected String limite;

    public Amex(String name, String lastName, String number, String expirationDate, String importe, String limite) {
        super(name, lastName, number, expirationDate);
        this.importe = importe;
        this.limite = limite;
    }

    public Amex() {
    }

    @Override
    public void operacionValida(String limite) {

        if(limite > 1000){
            return "Operacion valida";
        }else{
            return "operacion invalidad";
        }
    }

    @Override
    public boolean operacionValida(double limite) {
        return false;
    }

    @Override
    public boolean tarjetaValidaporFechadeVencimiento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double calculoTasa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String informarOperacion(double importe) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  

    
  
     
}
