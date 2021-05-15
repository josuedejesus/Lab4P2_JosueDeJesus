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
public class Consultor {
    String nombre;
    String apellido;
    int id;
    String usuario;
    String contrasena;
    String nacionalidad;
    int proyectos;
    int contrato;
    String campo;
    int tiempo;

    public Consultor() {
    }

    public Consultor(String nombre, String apellido, int id, String usuario, String contrasena, String nacionalidad, int proyectos, int contrato, String campo, int tiempo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.nacionalidad = nacionalidad;
        this.proyectos = proyectos;
        this.contrato = contrato;
        this.campo = campo;
        this.tiempo = tiempo;
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

    public int getContrato() {
        return contrato;
    }

    public void setContrato(int contrato) {
        this.contrato = contrato;
    }

    public String getCampo() {
        return campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "Consultor{" + "nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", usuario=" + usuario + ", contrasena=" + contrasena + ", nacionalidad=" + nacionalidad + ", proyectos=" + proyectos + ", contrato=" + contrato + ", campo=" + campo + ", tiempo=" + tiempo + '}';
    }
    
    
}
