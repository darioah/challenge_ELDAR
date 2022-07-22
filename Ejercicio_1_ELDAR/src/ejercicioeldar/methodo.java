
package ejercicioeldar;

import java.util.Date;


public interface methodo   {

     public abstract boolean operacionValida(double limite);

    public abstract boolean tarjetaValidaporFechadeVencimiento();

    public abstract double calculoTasa();

    public abstract String informarOperacion(double importe);
        
}
