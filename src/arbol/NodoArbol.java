/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol;

/**
 *
 * @author Jesus
 */
public class NodoArbol {
    //Agregamos los Atributos
    int dato;
    String nombre;
    NodoArbol hijoIzquierdo, hijoDerecho; //dos punteros
    // creamos el constructor
    // encargado de construir al nodo y recibe los parametros 
    public NodoArbol(int d, String nom){
    //
        
    this.dato=d;
    this.nombre=nom;
    this.hijoDerecho=null; // para apuntar los nodos
    this.hijoIzquierdo=null; // para apuntar los nodos
       
    }
    // Implementamos un metodo
    // para mostrar la informacion completo de Nuestros Objetos
    // Muestra el valor de todos los atributos
    public String toString(){
    return nombre + "Sus Datos es: " + dato;
    
    }   
    
}
