/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mija2
 */
public class Pila {
    private Pila pila1;
    private Dato dato;
    private Pila siguiente;
    public Pila(){
        this.siguiente=null;
        this.pila1=null;
    }

    /**
     * @return the pila1
     */
    public Pila getPila1() {
        return pila1;
    }

    /**
     * @param pila1 the pila1 to set
     */
    public void setPila1(Pila pila1) {
        this.pila1 = pila1;
    }

    /**
     * @return the dato
     */
    public Dato getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(Dato dato) {
        this.dato = dato;
    }

    /**
     * @return the siguiente
     */
    public Pila getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Pila siguiente) {
        this.siguiente = siguiente;
    }
    
}
