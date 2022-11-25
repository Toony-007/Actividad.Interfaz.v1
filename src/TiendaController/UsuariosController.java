/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiendaController;

import DAOtienda.DAOusuarios;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Anderson Diaz
 */
public class UsuariosController implements DAOusuarios{
    
    private static UsuariosController instancia;
    private String usuarios[][];
    private int cUsuario;
    
    public static UsuariosController getInstance(){
        if(instancia == null)
            instancia = new UsuariosController();
        return instancia;
    }
    
    private UsuariosController(){
        this.usuarios = new String[7][100];
        this.cUsuario = 0;
    }

    @Override
    public boolean GuardarUsuario(String nomusuario, String apusuario, String idusuario, String sxusuario, String nmusuario, String corrusuario, String pssusuario){
        usuarios[0][cUsuario] = nomusuario;
        usuarios[1][cUsuario] = apusuario;
        usuarios[2][cUsuario] = idusuario;
        usuarios[3][cUsuario] = sxusuario;
        usuarios[4][cUsuario] = nmusuario;
        usuarios[5][cUsuario] = corrusuario;
        usuarios[6][cUsuario] = pssusuario;
        cUsuario++;
        
        return true;
    }

    @Override
    public boolean GuardarUsuario(String[] usuario) {
        usuarios[0][cUsuario] = usuario[0];
        usuarios[1][cUsuario] = usuario[1];
        usuarios[2][cUsuario] = usuario[2];
        usuarios[3][cUsuario] = usuario[3];
        usuarios[4][cUsuario] = usuario[4];
        usuarios[5][cUsuario] = usuario[5];
        usuarios[6][cUsuario] = usuario[6];
        cUsuario++;
        
        return true;
    }

    @Override
    public DefaultTableModel MostrarUsuarios() {
        DefaultTableModel modeloUsuario = new DefaultTableModel();
        
        //Encabezado de la tabla
        modeloUsuario.addColumn("Nombres");
        modeloUsuario.addColumn("Apellidos");
        modeloUsuario.addColumn("Identificación");
        modeloUsuario.addColumn("Sexo");
        modeloUsuario.addColumn("Número de Contacto");
        modeloUsuario.addColumn("Correo Electrónico");
        
        //Filas de la tabla
        
        for(int i = 0; i < 100; i++){
            String[] usuario = new String[6];
            for(int j = 0;j < 5;j++){
                if(usuarios[j][i] != null)
                    usuario[j] = usuarios [j][i];
            }
            modeloUsuario.addColumn(usuario);
        }
        return modeloUsuario;
    }

    @Override
    public boolean ActualizarUsuario(String[] usuario) {
        int fila=0;
        for(int i=0;i<cUsuario;i++){
            if(usuarios[0][i]==usuario[0]){
                fila=i;
                break;
            }
        }
        usuarios[0][fila]=usuario[0];
        usuarios[1][fila]=usuario[1];
        usuarios[2][fila]=usuario[2];
        usuarios[3][fila]=usuario[3];
        usuarios[4][fila]=usuario[4];
        usuarios[5][fila]=usuario[5];
        return true;
    }

    @Override
    public boolean EliminarUsuario(String[] usuario) {
        for(int i=0;i<cUsuario;i++){
            if(usuarios[0][i]==usuario[0]){
                for (int j = i; j<cUsuario+1;j++){
                    usuarios[0][j]=usuarios[0][j+1];
                    usuarios[1][j]=usuarios[1][j+1];
                    usuarios[2][j]=usuarios[2][j+1];
                    usuarios[3][j]=usuarios[3][j+1];
                    usuarios[4][j]=usuarios[4][j+1];
                    usuarios[5][j]=usuarios[5][j+1];
                }
                cUsuario--;
                return true;
            }
        }
        return false; 
    }   
    
    @Override
    public boolean IniciarUsuario(String corUsu, String psUsu){
        
        return true;
    }
}
