/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata6;

public class Person1 {

    private final int id;
    private final String name;
    private final String genero;
    private final String fechaNacimiento;
    private final float peso;
    private final String mail;

    public Person1(int id, String name, String genero, String fechaNacimiento, float peso, String mail) {
        this.id = id;
        this.name = name;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.mail = mail;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGenero() {
        return genero;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public float getPeso() {
        return peso;
    }

    public String getMail() {
        return mail;
    }

   
    
    

}
