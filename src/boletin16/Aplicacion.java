
package boletin16;

import otro.Persoal;

public class Aplicacion {

    

   
    public static void main(String[] args) {
        Persoal alum= new Persoal(2,2);
        alum.imprimir();
        Academia a= new Academia(63298,20,"Jaime",alum);
        a.calcularNota(20);
        a.imprimir();
      // a.imprimir();
       
    }
    
}
//A CLASE APLICACIÓN QUE VERIFIQUE QUE O PROGRAMA SE EXECUTA PERFECTAMENTE
