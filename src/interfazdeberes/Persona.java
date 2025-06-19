/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfazdeberes;

public abstract class Persona implements Deberes {
    protected String nombre;
    protected int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //@Override
    public void mostrar() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }

    //@Override
    public abstract void guardar();
}
