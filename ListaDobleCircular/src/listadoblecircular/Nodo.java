/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadoblecircular;

/**
 *
 * @author Alan
 */
public class Nodo {
    //variable en a cual se va a guardar el valor
    private int valor;
    // VARIABLE PARA ENLAZAR LOS NODOS
    private Nodo siguiente;
    
    //constructor que inicializamos el valor de las variables
    
    public void Nodo(){
    this.valor=0;
    this.siguiente = null;
    }
    
    //metodos get y set para los atributos

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
   
   
    
}
