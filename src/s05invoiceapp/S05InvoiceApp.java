
package s05invoiceapp;

import java.util.Scanner ; 

public class S05InvoiceApp {
 public static void main (String[] arg){
    System.out.println ("Bienvenido a la aplicación Total Factura") ;
    System.out.println() ;
    Scanner sc = new Scanner (System.in) ;
    
    System.out.print ("Ingrese Subtotal:    ") ; 
    double subtotal = sc.nextDouble () ; 
    double impuesto = subtotal  * 0.18 ;
    double total = subtotal + impuesto ; 
    
    String mensaje = "Total Factura:   " + total + "\n" ; 
    System.out.println (mensaje) ; 
   
    }
    
}
