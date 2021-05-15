/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_josuedejesus;

/**
 *
 * @author josue
 */
public class Desarrollador {
    String nombre;
    String apellido;
    int id;
    String usuario;
    String contrasena;
    String nacionalidad;
    int proyectos;
    int experiencia;
    int contrato;
    String lenguaje;
    int horas;
    int sueldo;

    public Desarrollador() {
       
    }

    public Desarrollador(String nombre, String apellido, int id, String usuario, String contrasena, String nacionalidad, int proyectos, int experiencia, int contrato, String lenguaje, int horas, int sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.nacionalidad = nacionalidad;
        this.proyectos = proyectos;
        this.experiencia = experiencia;
        this.contrato = contrato;
        this.lenguaje = lenguaje;
        this.horas = horas;
        this.sueldo = sueldo;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getProyectos() {
        return proyectos;
    }

    public void setProyectos(int proyectos) {
        this.proyectos = proyectos;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getContrato() {
        return contrato;
    }

    public void setContrato(int contrato) {
        this.contrato = contrato;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Desarrollador{" + "nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", usuario=" + usuario + ", contrasena=" + contrasena + ", nacionalidad=" + nacionalidad + ", proyectos=" + proyectos + ", experiencia=" + experiencia + ", contrato=" + contrato + ", lenguaje=" + lenguaje + ", horas=" + horas + ", sueldo=" + sueldo + '}';
    }
    
    
}
