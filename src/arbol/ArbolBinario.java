package arbol;

public class ArbolBinario {

    NodoArbol raiz;

    public ArbolBinario(){
    raiz=null;
    }
    public void agregarNodo(int d, String nom){
    NodoArbol nuevo = new NodoArbol(d,nom);
    if(raiz==null){
    raiz=nuevo;    
            }else{
                // creamos nuevos punteros
            NodoArbol auxiliar =raiz;
            NodoArbol padre;
                while(true){// Mientras sea verdadero el padre apunta a la Raiz
                padre=auxiliar;
                        if(d<auxiliar.dato){// si el dato ingresado en menor a 
                                            //auxiliar debe irse a la IZQUIERDA
                        auxiliar=auxiliar.hijoIzquierdo;
                                    if(auxiliar==null){
                                    padre.hijoIzquierdo=nuevo;    
                                    //finalizamos el metodo
                                    return;
                                    }
                        }else{
                            auxiliar=auxiliar.hijoDerecho;
                            if(auxiliar==null){
                            padre.hijoDerecho=nuevo;
                            return;
                            }
                        }
                }
            }    
    }   


    //Creamos un Metodo cuando el arbol esta vacio
    public boolean estaVacio(){
    return raiz==null;
    }
    //metodo para recorrer el arbol en Orden y mostramos en impresion
    //RECURSIVIDAD
    public void inOrden(NodoArbol r){
            if(r!=null){
                inOrden(r.hijoIzquierdo);//
                System.out.println(r.dato);
                inOrden(r.hijoDerecho);
            }
    }
    }