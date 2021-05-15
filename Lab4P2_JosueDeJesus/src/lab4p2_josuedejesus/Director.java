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
public class Director {
    String nombre;
    String apellido;
    int id;
    String usuario;
    String contrasena;
    String nacionalidad;
    int anos;
    int contrato;
    int desarrolladores;
    int proyectos;
    int sueldo;

    public Director() {
    }

    public Director(String nombre, String apellido, int id, String usuario, String contrasena, String nacionalidad, int anos, int contrato, int desarrolladores, int proyectos, int sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.nacionalidad = nacionalidad;
        this.anos = anos;
        this.contrato = contrato;
        this.desarrolladores = desarrolladores;
        this.proyectos = proyectos;
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

    public int getAnos() {
        return anos;
    }

    public void setAnos(int anos) {
        this.anos = anos;
    }

    public int getContrato() {
        return contrato;
    }

    public void setContrato(int contrato) {
        this.contrato = contrato;
    }

    public int getDesarrolladores() {
        return desarrolladores;
    }

    public void setDesarrolladores(int desarrolladores) {
        this.desarrolladores = desarrolladores;
    }

    public int getProyectos() {
        return proyectos;
    }

    public void setProyectos(int proyectos) {
        this.proyectos = proyectos;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Director{" + "nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", usuario=" + usuario + ", contrasena=" + contrasena + ", nacionalidad=" + nacionalidad + ", anos=" + anos + ", contrato=" + contrato + ", desarrolladores=" + desarrolladores + ", proyectos=" + proyectos + ", sueldo=" + sueldo + '}';
    }
    
    
}
