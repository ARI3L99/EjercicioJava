/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Alejandro
 */
public class caballo {
    private String nombre;
    private String colorPelo;
    private String raza;
    private Integer edad;

    public caballo() {
    }

    public caballo(String nombre, String colorPelo, String raza, Integer edad) {
        this.nombre = nombre;
        this.colorPelo = colorPelo;
        this.raza = raza;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "caballo{" + "nombre=" + nombre + ", colorPelo=" + colorPelo + ", raza=" + raza + ", edad=" + edad + '}';
    }
    
    
}
