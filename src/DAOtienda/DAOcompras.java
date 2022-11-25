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
public interface DAOcompras {
    public boolean GuardarCompra(String usuario, String producto);
    public boolean GuardarCompra(String[] compra);
    public DefaultTableModel GuardarCompras();
    public void ActualizarCompra(int codigo);
    public void EliminarCompra(int codigo);
}
