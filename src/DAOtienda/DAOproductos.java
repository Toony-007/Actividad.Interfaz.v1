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
public interface DAOproductos {
    public boolean GuardarProducto(String nproducto, String prproducto, String codproducto, String dproducto, String vproducto, String tipproducto);
    public boolean GuardarProducto(String[] producto);
    public DefaultTableModel MostrarProductos();
    public String[][] MostrarCatalogo(int Tipo, int cProd);
    public boolean ActualizarProducto(String[] producto);
    public boolean EliminarProducto(String[] producto);
}
