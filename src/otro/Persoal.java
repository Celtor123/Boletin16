
package otro;

public class Persoal {
    int telefono,correo;

    public Persoal(int telefono, int correo) {
        this.telefono = telefono;
        this.correo = correo;
    }

    

  

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getCorreo() {
        return correo;
    }

    public void setCorreo(int correo) {
        this.correo = correo;
    }
      
    public void imprimir() {
        System.out.println("Persoal=" + "telefono=" + telefono + ", correo=" + correo);
    }
}
//*Teléfono
//*Correo
//Métodos :
//           *  Constructores
//           *  Acceso
//           *  toString()