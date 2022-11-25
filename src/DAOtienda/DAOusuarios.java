/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOtienda;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Anderson Diaz
 */
public interface DAOusuarios {
    public boolean GuardarUsuario(String nomusuario, String apusuario, String idusuario, String sxusuario, String nmusuario, String corusuario, String pssusuario);
    public boolean GuardarUsuario(String[] usuario);
    public DefaultTableModel MostrarUsuarios();
    public boolean ActualizarUsuario(String[] usuario);
    public boolean EliminarUsuario(String[] usuario);
    public boolean IniciarUsuario(String corUsu, String psUsu);
}
