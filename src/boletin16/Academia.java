
package boletin16;

import javax.swing.JOptionPane;
import otro.Persoal;

public class Academia {
    int nota,numReferencia;
    String nome;
    Persoal alum;
    
    public Academia() {
       
    }

    public Academia(int numReferencia, int nota, String nome, Persoal alum) {
        this.numReferencia = 2018;
        this.numReferencia = numReferencia;
        this.nota = nota;
        this.nome = nome;
        this.alum = alum;
    }

    

    
    public int getNumReferencia() {
        
        return numReferencia;
    }

    public void setNumReferencia(int numReferencia) {
       
        this.numReferencia = numReferencia++;
    }

    public int getNota() {
        
        return nota;
    }

    public void calcularNota(int nota) { 
        while (10>nota){
            while(nota>0){
        this.nota = nota;
        }}nota=-0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
              nome=JOptionPane.showInputDialog("Poña o nome");
       
        this.nome = nome;
    }

    public Persoal getAlum() {
        return alum;
    }

    public void setAlum(Persoal alum) {
        this.alum = alum;
    }


  

  
    public void imprimir() {
        System.out.println("Academia= " + " numReferencia=" + numReferencia + ", nota=" + nota + ", nome=" + nome + ", alum=" + alum);
    }

      
}
//A CLASE Academica  cos seguintes atributos :
//    *  numReferencia  variable  de clase correlativa ( a primeira referencia ten valor  2018 )
//    *   nome
//    *  nota  ( o valor debe estar entre 1 e 10 )   
//    *  Persoal  alum
//Métodos :* constructores
//                *   Acceso
//                *  metodo toString ();
//