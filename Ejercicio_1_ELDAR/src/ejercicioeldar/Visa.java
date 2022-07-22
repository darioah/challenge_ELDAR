
package ejercicioeldar;

import java.util.Date;


public class Visa extends Card  implements methodo{

    protected String importe;
    protected String limite;


    public Visa() {
    }

    public Visa(String name, String lastName, String number, String expirationDate, String importe, String limite) {
        super(name, lastName, number, expirationDate);
        this.importe = importe;
        this.limite = limite;
    }

    public Visa(String importe, String limite) {
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

    

  
    
  
   
   
    
}
