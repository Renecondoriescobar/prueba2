
package arbol;

import javax.swing.JOptionPane;

public class main {


    public static void main(String[] args) {
        // Creamos el menu con las opciones
        int opcion=0,elemento;
        String nombre;
        // creamos nuestro arbol binario
        ArbolBinario arbolito=new ArbolBinario();
               
        do{
            try{
                
                opcion= Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Agregar un Nodo\n"
                        + "2. Recorrer el arbol y orden\n"
                        + "3. Salir\n"
                        +"Elige una opcion...","Arboles Binarios",
                        JOptionPane.QUESTION_MESSAGE));
                //evaluamos el menu
                switch(opcion){
                    case 1:
                        elemento=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el Numero del Nodo","Agregando Nodo",
                                JOptionPane.QUESTION_MESSAGE));
                        nombre= JOptionPane.showInputDialog(null,"Ingresa el Nombre del nodo","Agregando Nodo",
                                JOptionPane.QUESTION_MESSAGE);
                        
                        //llamamos al metodo
                        arbolito.agregarNodo(elemento,nombre);                        
                        break;
                    case 2:
                        if(!arbolito.estaVacio()){
                            arbolito.inOrden(arbolito.raiz);                        
                        }else{
                        
                          JOptionPane.showMessageDialog(null,"El Arbol esta vacio","Cuidado!",
                                JOptionPane.QUESTION_MESSAGE);
                        }
                        break;
                        
                        
                    case 3:
                        JOptionPane.showMessageDialog(null,"Aplicacion Finalizada","fin",
                                JOptionPane.QUESTION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,"Opcion Incorrecta","Cuidado!",
                                JOptionPane.QUESTION_MESSAGE);
                }
                
            }catch(NumberFormatException n){
               //
                JOptionPane.showMessageDialog(null,"Error" + n.getMessage());
            
            }
        }while(opcion!=3);
    }
    
}
    

