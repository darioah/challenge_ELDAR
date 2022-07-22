
package ejercicioeldar;


public class EjercicioELDAR {

    
    public static void main(String[] args) {

      Amex amex = new Amex("Dario", "Cardozo","312213", "04/12/21","900","1000");
        Visa visa = new Visa("Caroline", "Destrello","3122321213", "04/3/19","330","1000");
      Nara nara = new Nara("Hermaione", "Potter","22321313", "02/7/21","200","1500");


       System.out.println(visa.toString());
        System.out.println(nara.toString());
        System.out.println(amex.toString());
        
        
    }
    
}
