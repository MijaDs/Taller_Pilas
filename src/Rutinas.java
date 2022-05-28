
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mija2
 */
public class Rutinas {

    private Pila superior;

    public Rutinas() {
        this.superior = null;
    }

    public boolean vacio() {
        if (superior == null) {
            return true;
        } else {
            return false;
        }
    }
    //Push --- agregar datos 
    public void agregar() {
        Dato n = new Dato();
        n.setNum(Integer.parseInt(String.join(null, "Ingrese valor")));
        Pila nuevaPila = new Pila();
        nuevaPila.setDato(n);
        if (vacio()) {
            superior = nuevaPila;
        } else {
            nuevaPila.setSiguiente(superior);
            superior = nuevaPila;
        }
    }
    //compara el valor de la pila para avisar si el valor se encuentra o no
    public boolean buscarNum(int num){
        Pila aux = superior;
        int n =0;
        boolean res=false;
        if(!vacio()){
            while(aux!=null){
                n=aux.getDato().getNum();
                if(num==n){
                    res =  true;
                    JOptionPane.showMessageDialog(null, "EL valor " + num+ " si se encuentra en la pila ",
                            "Contenido de la pila",JOptionPane.PLAIN_MESSAGE);
                }
                else{
                    res = false;
                    JOptionPane.showMessageDialog(null, "El valor "+num+" no se encuentra en la pula",
                            "Contenido de la pila", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        return res;
       
    }
    
}
