/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagit;

/**
 *
 * @author ariel
 */
public class Pato {
    private String color ;
    private Integer edad ;
    private Integer cantidadDePlumas ;
    private String raza ;
    private final Integer patas = 2 ;
    private final Integer alas = 2 ;
    private final String sonido = "cuak" ;

    public Pato() {
    }

    public Pato(String color, Integer edad, Integer cantidadDePlumas, String raza) {
        this.color = color;
        this.edad = edad;
        this.cantidadDePlumas = cantidadDePlumas;
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getCantidadDePlumas() {
        return cantidadDePlumas;
    }

    public void setCantidadDePlumas(Integer cantidadDePlumas) {
        this.cantidadDePlumas = cantidadDePlumas;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    
}
