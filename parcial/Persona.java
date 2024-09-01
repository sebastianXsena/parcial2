package com.mycompany.parcial;

public class Persona {

    private String nombre;
    private String apellido;
    private String direccion;
    private String Telefono;
    private int edad;
    private String Email;

    public Persona(String nombre, String apellido, String direccion, String Telefono, int edad, String Email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.Telefono = Telefono;
        this.edad = edad;
        this.Email = Email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
}