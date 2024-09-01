
package com.mycompany.parcial;

import java.util.Scanner;


class Empleado extends Persona {

    private String NombreCargo;
    private double salario;
    private String jefeInmediato;
    private int AñosDeExperiencia;

    public Empleado(String nombre, String apellido, String direccion, String Telefono, int edad, String Email, double salario, String jefeInmediato, int AñosDeExperiencia) {
        super(nombre, apellido, direccion, Telefono, edad, Email);
        this.salario = salario;
        this.jefeInmediato = jefeInmediato;
        this.AñosDeExperiencia = AñosDeExperiencia;
        this.NombreCargo = calcularCargo();
    }

    public String getNombreCargo() {
        return NombreCargo;
    }

    public void setNombreCargo(String NombreCargo) {
        this.NombreCargo = NombreCargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getJefeInmediato() {
        return jefeInmediato;
    }

    public void setJefeInmediato(String jefeInmediato) {
        this.jefeInmediato = jefeInmediato;
    }

    public int getAñosDeExperiencia() {
        return AñosDeExperiencia;
    }

    public void setAñosDeExperiencia(int AñosDeExperiencia) {
        this.AñosDeExperiencia = AñosDeExperiencia;
    }

    private String calcularCargo() {
        int Edad = getEdad();
        if (salario >= 5000000 && AñosDeExperiencia >= 5 && Edad >= 25 && Edad <= 45) {
            return "Senior";
        } else if (salario >= 900000 && salario <= 1200000 && AñosDeExperiencia >= 1 && AñosDeExperiencia <= 2 && Edad >= 18 && Edad <= 22) {
            return "Junior";
        } else {
            return "No hay cargo disponible";
        }
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese su primer nombre:");
        String nombre = entrada.nextLine();

        System.out.println("Ingrese su Primer apellido:");
        String apellido = entrada.nextLine();

        System.out.println("Ingrese su Direccion:");
        String direccion = entrada.nextLine();

        System.out.println("Ingrese su Numero Telefonico:");
        String Telefono = entrada.nextLine();

        System.out.println("Ingrese su Edad:");
        int Edad = entrada.nextInt();
        entrada.nextLine(); // Consumir la nueva línea pendiente

        System.out.println("Ingrese su Email:");
        String Email = entrada.nextLine();

        System.out.println("Ingrese su Salario:");
        double salario = entrada.nextDouble();
        entrada.nextLine(); // Consumir la nueva línea pendiente

        System.out.println("Ingrese el nombre de su Jefe:");
        String JefeInmediato = entrada.nextLine();

        System.out.println("Ingrese cuantos años tiene de experiencia");
        int AñosDeExperiencia = entrada.nextInt();

        Empleado empleado = new Empleado(nombre, apellido, direccion, Telefono, Edad, Email, salario, JefeInmediato, AñosDeExperiencia);

        System.out.println("Detalles del Empleado:");
        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("Apellido: " + empleado.getApellido());
        System.out.println("Direccion: " + empleado.getDireccion());
        System.out.println("Telefono: " + empleado.getTelefono());
        System.out.println("Edad: " + empleado.getEdad());
        System.out.println("Email: " + empleado.getEmail());
        System.out.println("Salario: " + empleado.getSalario());
        System.out.println("Jefe inmediato: " + empleado.getJefeInmediato());
        System.out.println("Años de experiencia: " + empleado.getAñosDeExperiencia());
        System.out.println("Cargo: " + empleado.getNombreCargo());
    }
}