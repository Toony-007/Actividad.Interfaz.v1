/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiendaController;

import DAOtienda.DAOproductos;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Anderson Diaz
 */
public class ProductosController implements DAOproductos{
    
    private static ProductosController instancia;
    private String productos[][][];
    private int cProducto[];
    private int cControl;
    
    public static ProductosController getInstance(){
        if(instancia == null)
            instancia = new ProductosController();
        return instancia;
    }
    
    private ProductosController(){
        this.productos = new String[6][100][3];
        this.cProducto = new int [3];
    }
    
    @Override
    public boolean GuardarProducto(String nproducto, String prproducto, String codproducto, String dproducto, String vproducto, String tipproducto) { 
        if (tipproducto.equals("Ropa")){
            cControl = 0;
        }else if (tipproducto.equals("Cocina")){
            cControl = 1;
        }else if (tipproducto.equals("Juguetes")){
            cControl = 2;
        }else if (tipproducto.equals("Tecnología")){
            cControl = 3;
        }
        productos[0][cProducto[cControl]][cControl] = nproducto;
        productos[1][cProducto[cControl]][cControl] = prproducto;
        productos[2][cProducto[cControl]][cControl] = codproducto;
        productos[3][cProducto[cControl]][cControl] = dproducto;
        productos[4][cProducto[cControl]][cControl] = vproducto;
        productos[5][cProducto[cControl]][cControl] = tipproducto;
        cProducto[cControl]++;
        
        return true;
    }

    @Override
    public boolean GuardarProducto(String[] producto) {
        
        productos[0][cProducto[cControl]][cControl] = producto[0];
        productos[1][cProducto[cControl]][cControl] = producto[1];
        productos[2][cProducto[cControl]][cControl] = producto[2];
        productos[3][cProducto[cControl]][cControl] = producto[3];
        productos[4][cProducto[cControl]][cControl] = producto[4];
        productos[5][cProducto[cControl]][cControl] = producto[5];
        cProducto[cControl]++; 
        
        return true;
    }

    @Override
    public DefaultTableModel MostrarProductos() {
        DefaultTableModel modeloProducto = new DefaultTableModel();
        
        //Encabezado de la tabla
        modeloProducto.addColumn("Nombre");
        modeloProducto.addColumn("Precio");
        modeloProducto.addColumn("Código");
        modeloProducto.addColumn("Descripción");
        modeloProducto.addColumn("Valoración");
        modeloProducto.addColumn("Categoría");
        
        //Filas de la tabla
        for(int i = 0; i <3;i++)
            for(int j = 0; j < 100; j++){
                String[] producto = new String[6];
                for(int k = 0;k < 5;k++){
                    if(productos[k][j][i] != null)
                        producto[j] = productos [k][j][i];
                }
            modeloProducto.addColumn(producto);
            }
        return modeloProducto;
    }

    @Override
    public boolean ActualizarProducto(String[] producto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean EliminarProducto(String[] producto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String[][] MostrarCatalogo(int Tipo, int cProd) {
        String[][] catalogo = null;
        for (int i = cProd; i<4 && i<cProducto[Tipo]; i++ ){
           
        }
        return catalogo;
    }

}
