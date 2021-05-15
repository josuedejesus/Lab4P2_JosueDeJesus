/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_josuedejesus;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author josue
 */
public class Lab4P2_JosueDeJesus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion, id;
        String user = "admin";
        String password = "1234";

        int identidad, proyectos, experiencia, contrato, horas, sueldo, tiempo, anos, desarrolladores;
        String nombre, apellido, usuario, contrasena, nacionalidad, lenguaje, campo;

        boolean yaExiste = false;

        ArrayList lista = new ArrayList();
        lista.add(new Desarrollador());

        ArrayList<Usuario> usuarios = new ArrayList();
        usuarios.add(new Usuario(user, password));

        ArrayList<Desarrollador> desarrollador = new ArrayList();
        ArrayList<Consultor> consultor = new ArrayList();
        ArrayList<Director> director = new ArrayList();

        try {
            do {
                opcion = Integer.parseInt(JOptionPane.showInputDialog("1 - Admin\n"
                        + "2 - Desarrolladores\n"
                        + "3 - Consultores\n"
                        + "4 - Directores\n"
                        + "5 - Salir"));

                switch (opcion) {
                    case 1:
                        String obtenerNombre = "";
                        String obtenerApellido = "";
                        String usuarioInput = "";
                        String passwordInput = "";
                        String obtenerUsuario = "";
                        String obtenerContrasena = "";
                        usuarioInput = JOptionPane.showInputDialog("Ingrese el usuario");
                        for (Usuario userN : usuarios) {
                            if (userN.getUsuario().contains(usuarioInput)) {
                                obtenerUsuario = userN.getUsuario();
                            }
                        }
                        if (obtenerUsuario.contains(usuarioInput) == false || usuarioInput.isBlank()) {
                            String uIncorrecto = "Usuario no existe!";
                            JOptionPane.showMessageDialog(null, uIncorrecto);
                        } else {
                            passwordInput = JOptionPane.showInputDialog("Ingrese la contrasena");
                            for (Usuario userN : usuarios) {
                                if (userN.getContrasena().contains(passwordInput)) {
                                    obtenerContrasena = userN.getContrasena();
                                }
                            }
                            if (obtenerContrasena.contains(passwordInput) == false || passwordInput.isBlank()) {
                                String uIncorrecto = "Contrasena Incorrecta!";
                                JOptionPane.showMessageDialog(null, uIncorrecto);
                            } else {
                                do {
                                    opcion = Integer.parseInt(JOptionPane.showInputDialog("1 - Desarrolladores\n"
                                            + "2 - Consultores\n"
                                            + "3 - Directores\n"
                                            + "4 - Usuarios\n"
                                            + "5 - Cerrar sesion"));
                                    if (opcion == 1) {
                                        opcion = Integer.parseInt(JOptionPane.showInputDialog("1 - Nuevo desarrollador\n"
                                                + "2 - Modificar desarrollador\n"
                                                + "3 - Eliminar desarrollador"));

                                        if (opcion == 1) {

                                            nombre = JOptionPane.showInputDialog("Ingrese el nombre");
                                            apellido = JOptionPane.showInputDialog("Ingrese el apellido");
                                            identidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID"));
                                            usuario = JOptionPane.showInputDialog("Ingrese el usuario");
                                            contrasena = JOptionPane.showInputDialog("Ingrese la contrasena");
                                            nacionalidad = JOptionPane.showInputDialog("Ingrese la nacionalidad");
                                            proyectos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de proyectos realizados"));
                                            experiencia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de anos de experiencia"));
                                            contrato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de anos del contrato"));
                                            lenguaje = JOptionPane.showInputDialog("Ingrese el lenguaje de programacion preferido");
                                            horas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de horas de trabajo diarias"));
                                            sueldo = 0;
                                            desarrollador.add(new Desarrollador(nombre, apellido, identidad, usuario, contrasena, nacionalidad, proyectos, experiencia, contrato, lenguaje, horas, sueldo));
                                        }

                                        if (opcion == 2) {
                                            int obtenerId;
                                            id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del usuario que desea modificar"));
                                            for (Desarrollador userN : desarrollador) {
                                                if (userN.getId() == id) {
                                                    obtenerId = userN.getId();
                                                    yaExiste = true;
                                                    System.out.println(obtenerId);
                                                }
                                            }
                                            if (yaExiste == false) {
                                                String uIncorrecto = "Usuario no existe!";
                                                JOptionPane.showMessageDialog(null, uIncorrecto);
                                            } else {
                                                opcion = Integer.parseInt(JOptionPane.showInputDialog("Selecciones la opcion que desea modificar \n"
                                                        + "1 - Nombre\n"
                                                        + "2 - Apellido\n"
                                                        + "3 - ID\n"
                                                        + "4 - Nacionalidad\n"
                                                        + "5 - Cantidad de proyectos realizados\n"
                                                        + "6 - Anos de experiencia\n"
                                                        + "7 - Anos del contrato\n"
                                                        + "8 - lenguaje de programación preferido\n"
                                                        + "9 - Horas de trabajo diarias/n"
                                                        + "10 - Sueldo mensual"));
                                                if (opcion == 1) {
                                                    nombre = JOptionPane.showInputDialog("Ïngrese el nuevo nombre");
                                                    ((Desarrollador) desarrollador.get(id)).setNombre(nombre);
                                                    JOptionPane.showMessageDialog(null, "Usuario modificado exitosamente!");
                                                }
                                                if (opcion == 2) {
                                                    apellido = JOptionPane.showInputDialog("Ingrese el nuevo apellido");
                                                    ((Desarrollador) desarrollador.get(id)).setApellido(apellido);
                                                    JOptionPane.showMessageDialog(null, "Usuario modificado exitosamente!");
                                                }

                                                if (opcion == 3) {
                                                    identidad = Integer.parseInt(JOptionPane.showInputDialog("Ïngrese el nuevo ID"));
                                                    ((Desarrollador) desarrollador.get(id)).setId(identidad);
                                                    JOptionPane.showMessageDialog(null, "Usuario modificado exitosamente!");
                                                }
                                                if (opcion == 4) {
                                                    nacionalidad = JOptionPane.showInputDialog("Ingrese la nueva nacionalidad");
                                                    ((Desarrollador) desarrollador.get(id)).setNacionalidad(nacionalidad);
                                                    JOptionPane.showMessageDialog(null, "Usuario modificado exitosamente!");
                                                }

                                                if (opcion == 5) {
                                                    proyectos = Integer.parseInt(JOptionPane.showInputDialog("Ïngrese la nueva cantidad de proyectos realizados"));
                                                    ((Desarrollador) desarrollador.get(id)).setProyectos(proyectos);
                                                    JOptionPane.showMessageDialog(null, "Usuario modificado exitosamente!");
                                                }
                                                if (opcion == 6) {
                                                    experiencia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva cantidad de anos de experiencia"));
                                                    ((Desarrollador) desarrollador.get(id)).setExperiencia(experiencia);
                                                    JOptionPane.showMessageDialog(null, "Usuario modificado exitosamente!");
                                                }

                                                if (opcion == 7) {
                                                    contrato = Integer.parseInt(JOptionPane.showInputDialog("Ïngrese la nueva cantidad de anos del contrato"));
                                                    ((Desarrollador) desarrollador.get(id)).setContrato(contrato);
                                                    JOptionPane.showMessageDialog(null, "Usuario modificado exitosamente!");
                                                }
                                                if (opcion == 8) {
                                                    lenguaje = JOptionPane.showInputDialog("Ingrese el nuevo lenguaje de programacion preferido");
                                                    ((Desarrollador) desarrollador.get(id)).setContrasena(lenguaje);
                                                    JOptionPane.showMessageDialog(null, "Usuario modificado exitosamente!");
                                                }

                                                if (opcion == 9) {
                                                    horas = Integer.parseInt(JOptionPane.showInputDialog("Ïngrese la nueva cantidad de horas de trabajo diarias"));
                                                    ((Desarrollador) desarrollador.get(id)).setHoras(horas);
                                                    JOptionPane.showMessageDialog(null, "Usuario modificado exitosamente!");
                                                }
                                                if (opcion == 10) {
                                                    sueldo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo sueldo"));
                                                    ((Desarrollador) desarrollador.get(id)).setSueldo(sueldo);
                                                    JOptionPane.showMessageDialog(null, "Usuario modificado exitosamente!");
                                                }
                                            }
                                        }

                                        if (opcion == 3) {
                                            id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del usuario que desea eliminar"));
                                            if (desarrollador.size() < id || (desarrollador.get(id) instanceof Desarrollador) == false) {
                                                JOptionPane.showMessageDialog(null, "El usuario no existe");
                                            } else {
                                                desarrollador.remove(id);
                                                JOptionPane.showMessageDialog(null, "Usuario eliminado exitosamente!");
                                            }
                                        }
                                    }

                                    if (opcion == 2) {
                                        opcion = Integer.parseInt(JOptionPane.showInputDialog("1 - Nuevo consultor\n"
                                                + "2 - Modificar consultor\n"
                                                + "3 - Eliminar consultor"));

                                        if (opcion == 1) {
                                            nombre = JOptionPane.showInputDialog("Ingrese el nombre");
                                            apellido = JOptionPane.showInputDialog("Ingrese el apellido");
                                            identidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID"));
                                            usuario = JOptionPane.showInputDialog("Ingrese el usuario");
                                            contrasena = JOptionPane.showInputDialog("Ingrese la contrasena");
                                            nacionalidad = JOptionPane.showInputDialog("Ingrese la nacionalidad");
                                            proyectos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de proyectos realizados"));
                                            contrato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de anos del contrato"));
                                            campo = JOptionPane.showInputDialog("Ingrese el principal campo de experiencia");
                                            tiempo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tiempo de duracion de la consultoria"));
                                            consultor.add(new Consultor(nombre, apellido, identidad, usuario, contrasena, nacionalidad, proyectos, contrato, campo, tiempo));
                                        }
                                    }

                                    if (opcion == 3) {
                                        opcion = Integer.parseInt(JOptionPane.showInputDialog("1 - Nuevo director\n"
                                                + "2 - Modificar director\n"
                                                + "3 - Eliminar director"));

                                        if (opcion == 1) {
                                            nombre = JOptionPane.showInputDialog("Ingrese el nombre");
                                            apellido = JOptionPane.showInputDialog("Ingrese el apellido");
                                            identidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID"));
                                            usuario = JOptionPane.showInputDialog("Ingrese el usuario");
                                            contrasena = JOptionPane.showInputDialog("Ingrese la contrasena");
                                            nacionalidad = JOptionPane.showInputDialog("Ingrese la nacionalidad");
                                            anos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de anos durante su puesto"));
                                            contrato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de anos del contrato"));
                                            desarrolladores = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de desarrolladores asignador"));
                                            proyectos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de proyectos realizados"));
                                            sueldo = 0;
                                            director.add(new Director(nombre, apellido, identidad, usuario, contrasena, nacionalidad, anos, contrato, desarrolladores, proyectos, sueldo));
                                        }
                                    }
                                } while (opcion != 5);
                            }
                        }
                        break;

                    case 2:
                        do {
                            obtenerNombre = "";
                            usuarioInput = "";
                            passwordInput = "";
                            obtenerUsuario = "";
                            obtenerContrasena = "";
                            obtenerApellido = "";
                            yaExiste = false;
                            usuarioInput = JOptionPane.showInputDialog("Ingrese el usuario");
                            for (Desarrollador userA : desarrollador) {
                                if (userA.getUsuario().contains(usuarioInput)) {
                                    obtenerUsuario = userA.getUsuario();
                                }
                            }
                            if (obtenerUsuario.contains(usuarioInput) == false || usuarioInput.isBlank()) {
                                String uIncorrecto = "Usuario no existe!";
                                JOptionPane.showMessageDialog(null, uIncorrecto);
                            } else {
                                passwordInput = JOptionPane.showInputDialog("Ingrese la contrasena");
                                for (Desarrollador userA : desarrollador) {
                                    if (userA.getContrasena().contains(passwordInput)) {
                                        obtenerContrasena = userA.getContrasena();
                                        obtenerNombre = userA.getNombre();
                                        obtenerApellido = userA.getApellido();
                                    }
                                }
                                if (obtenerContrasena.contains(passwordInput) == false || passwordInput.isBlank()) {
                                    String uIncorrecto = "Contrasena Incorrecta!";
                                    JOptionPane.showMessageDialog(null, uIncorrecto);
                                } else {
                                    opcion = Integer.parseInt(JOptionPane.showInputDialog(obtenerNombre + " " + obtenerApellido + "\n" + "1 - Informacion\n"
                                            + "2 - Eliminar cuenta\n"
                                            + "3 - Proyectos\n"
                                            + "4 - Cerrar sesion"));

                                    if (opcion == 1) {
                                        String salida = "";
                                        for (Desarrollador userA : desarrollador) {
                                            if (obtenerUsuario.contains(usuarioInput) == true || usuarioInput.isBlank()) {
                                                salida += desarrollador.indexOf(userA) + "- " + userA + "\n";
                                            }
                                        }
                                        JOptionPane.showMessageDialog(null, salida);
                                    }
                                }
                            }
                        } while (opcion != 4);
                        break;

                    case 3:
                        obtenerNombre = "";
                        usuarioInput = "";
                        passwordInput = "";
                        obtenerUsuario = "";
                        obtenerContrasena = "";
                        obtenerApellido = "";
                        yaExiste = false;
                        usuarioInput = JOptionPane.showInputDialog("Ingrese el usuario");
                        for (Consultor userA : consultor) {
                            if (userA.getUsuario().contains(usuarioInput)) {
                                obtenerUsuario = userA.getUsuario();
                            }
                        }
                        if (obtenerUsuario.contains(usuarioInput) == false || usuarioInput.isBlank()) {
                            String uIncorrecto = "Usuario no existe!";
                            JOptionPane.showMessageDialog(null, uIncorrecto);
                        } else {
                            passwordInput = JOptionPane.showInputDialog("Ingrese la contrasena");
                            for (Consultor userA : consultor) {
                                if (userA.getContrasena().contains(passwordInput)) {
                                    obtenerContrasena = userA.getContrasena();
                                    obtenerNombre = userA.getNombre();
                                    obtenerApellido = userA.getApellido();
                                }
                            }
                            if (obtenerContrasena.contains(passwordInput) == false || passwordInput.isBlank()) {
                                String uIncorrecto = "Contrasena Incorrecta!";
                                JOptionPane.showMessageDialog(null, uIncorrecto);
                            } else {
                                JOptionPane.showInputDialog(obtenerNombre + obtenerApellido + "\n" + "1 - Informacion\n"
                                        + "2 - Modificar cuenta\n"
                                        + "3 - Eliminar cuenta"
                                        + "4 - Proyectos"
                                        + "2 - Cerrar sesion");

                            }
                        }
                        break;

                    case 4:
                        obtenerNombre = "";
                        usuarioInput = "";
                        passwordInput = "";
                        obtenerUsuario = "";
                        obtenerContrasena = "";
                        obtenerApellido = "";
                        yaExiste = false;
                        usuarioInput = JOptionPane.showInputDialog("Ingrese el usuario");
                        for (Consultor userA : consultor) {
                            if (userA.getUsuario().contains(usuarioInput)) {
                                obtenerUsuario = userA.getUsuario();
                            }
                        }
                        if (obtenerUsuario.contains(usuarioInput) == false || usuarioInput.isBlank()) {
                            String uIncorrecto = "Usuario no existe!";
                            JOptionPane.showMessageDialog(null, uIncorrecto);
                        } else {
                            passwordInput = JOptionPane.showInputDialog("Ingrese la contrasena");
                            for (Consultor userA : consultor) {
                                if (userA.getContrasena().contains(passwordInput)) {
                                    obtenerContrasena = userA.getContrasena();
                                    obtenerNombre = userA.getNombre();
                                    obtenerApellido = userA.getApellido();
                                }
                            }
                            if (obtenerContrasena.contains(passwordInput) == false || passwordInput.isBlank()) {
                                String uIncorrecto = "Contrasena Incorrecta!";
                                JOptionPane.showMessageDialog(null, uIncorrecto);
                            } else {
                                JOptionPane.showInputDialog(obtenerNombre + obtenerApellido + "\n" + "1 - Informacion\n"
                                        + "2 - Modificar cuenta\n"
                                        + "3 - Eliminar cuenta"
                                        + "4 - Proyectos"
                                        + "2 - Cerrar sesion");

                            }
                        }
                        break;

                    case 5:
                        opcion = 0;
                        break;
                }
            } while (opcion > 0 && opcion <= 7);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Seleccione una opcion valida");
        }
    }

}
