
package ejercicioeldar;

import java.util.Date;


public class Nara  extends Card implements methodo {

    protected String importe;
    protected String limite;


    public Nara(String name, String lastName, String number, String expirationDate, String importe, String limite) {
        super(name, lastName, number, expirationDate);
        this.importe = importe;
        this.limite = limite;
    }

    @Override
    public boolean operacionValida(double limite) {
       if(limite > 1000){
            return false;
       }else{
           return true;
       }  
        
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

    
  
    public void validacion( String name, String lastName, Long number, Date expirationDate ) throws Exception {
        if (name == null || name.isEmpty()) {
            throw new Exception("debe ingresar su nombre");
        }
        if (lastName == null || lastName.isEmpty()) {
            throw new Exception("debe ingresar su apellido");
        }

        if (number == null ) {
            throw new Exception("ingrese un valor");
        }

        if (expirationDate == null ) {
            throw new Exception("ingrese un valor");
        }
     
        
    }



   

  
    
    
}
