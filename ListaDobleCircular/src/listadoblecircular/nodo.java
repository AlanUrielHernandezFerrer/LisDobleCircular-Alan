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
public class nodo {

    int dato;
    nodo next;
    nodo ant;

    nodo(int a) {
        dato = a;
        ant = null;
        next = null;
    }
}
