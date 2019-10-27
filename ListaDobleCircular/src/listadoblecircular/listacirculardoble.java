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

public class listacirculardoble
{
 nodo primero;
 nodo ultimo;
 
 listacirculardoble()
 {
  primero=null;
  ultimo=null;
 }
 
 public boolean estavacio()
 {
  if(primero==null) return true;
  else return false;
 }
 
    public listacirculardoble alta(int dat)
    {
     if(estavacio())
     {
      nodo nuevo=new nodo(dat);
      primero=nuevo;
      ultimo=nuevo;
      nuevo.next=nuevo;
      nuevo.ant=nuevo;
     }
     else
     {
      nodo nuevo=new nodo(dat);
      ultimo.next=nuevo;
      nuevo.ant=ultimo;
      primero.ant=nuevo;
      nuevo.next=primero;
      ultimo=nuevo;
     }
     return this;
    }
    
    public boolean bajaxposicion(int dat)
    {
     nodo actual=primero;
     nodo anterior;
     nodo siguiente;
     for(int i=0;i<=dat;i++)
     {
      if(actual==ultimo)
      {
       if(i<dat) return false;
       else
       {
        if(i==dat)
        {
         anterior=actual.ant;
         anterior.next=primero;
         primero.ant=anterior;
         ultimo=anterior;
         return true;
        }
        
       }
      
      }
      else
      {
       if(dat==0)
       {
        siguiente=actual.next;
        siguiente.ant=ultimo;
        ultimo.next=siguiente;
        primero=siguiente;
        return true;
       }
       if(dat==i)
       {
        anterior=actual.ant;
        siguiente=actual.next;
        anterior.next=siguiente;
        siguiente.ant=anterior;
        return true;
       }
      }
      actual=actual.next;
     }
     return false;
    }
    
    
    public void imprimir()
 {
  nodo actual;
  actual=primero;
  while(actual!=ultimo)
  {
   System.out.println(actual.dato);
   actual=actual.next;
  }
        System.out.println(actual.dato);
                
 }
    
}