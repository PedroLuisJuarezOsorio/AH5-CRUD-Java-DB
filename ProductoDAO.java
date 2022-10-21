//    private int codigo;
//    private String desc_producto;
//    private int cantidad;
//    private String fabri_origen;
//    private String fechaingreso;

package AH5;
import java.sql.*;
import java.util.*;



public class ProductoDAO {
    
    PreparedStatement ps;
    ResultSet rs;
    Connection con;    
    Conexiondb acceso = new Conexiondb();
 
//REF#(1) READ - LISTAR PRODUCTOS DE TABLA DB
    public ArrayList listar(){
        String sql = "SELECT * FROM producto";
        try{
            //inicializa la base de datos
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            ArrayList<Productodb> datoProducto = new ArrayList<Productodb>();//el array contien solo alumnos 
            
            //LISTAR DATOS DE LA TABLA
            while(rs.next()){
                Productodb AL = new Productodb();                
                AL.setCodigo(rs.getInt(1));
//                    System.out.println(rs.getInt(1));
                
                AL.setDesc_producto(rs.getString(2));
                    System.out.println(rs.getString(2));
                    
                AL.setCantidad(rs.getInt(3));
//                    System.out.println(rs.getString(3));
                    
                AL.setFabri_origen(rs.getString(4));
//                    System.out.println(rs.getString(4));
                    
                AL.setFechaingreso(rs.getString(5));
//                    System.out.println(rs.getString(5));                
                    
                datoProducto.add(AL);//agregamos datos al arreglo
            }
            return datoProducto;
            
        }catch(Exception e){
            System.out.println(e);
        }
    return null;    
    }
    
//REF#(2) CREATE - CREAR UN REGISTRO EN LA TABLA BD
    
    public void crear(int codigo, String producto, int cantidad, String fabricacion, String fecha){
        String sql = "insert into producto (codigo, desc_producto, cantidad, fabri_origen, fechaingreso) value (?,?,?,?,?)";
        try{
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);            
            ps.setInt(1, codigo);
            ps.setString(2, producto);
            ps.setInt(3, cantidad);
            ps.setString(4, fabricacion);
            ps.setString(5, fecha);
            ps.executeUpdate();
            
            
        }catch(Exception e){
        }        
    } 
//REF#(3) UPDATE - MODIFICAR UN REGISTRO DE LA TABLA BD
     public void modificar(int codigo, String producto, int cantidad, String fabricacion, String fecha) {
        String sql = "update producto set desc_producto=?, cantidad=?, fabri_origen=?, fechaingreso=? where codigo=?;";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, producto);
            ps.setInt(2, cantidad);
            ps.setString(3, fabricacion);
            ps.setString(4, fecha);
            ps.setInt(5, codigo);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

     
//REF#(4) DELETE - ELIMINAR UN REGISTRO DE LA TABLA BD
    public void eliminar(int codigo) {
        String sql = "delete from producto where codigo=?";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
 
//REF#(5) BUSCAR UN REGISTRO DE LA TABLA BD
    public void buscar(int codigo){
    //SELECT * FROM `alumnos` WHERE carnet=201800555; ejemplo
    String sql = "select * from producto where codigo ="+codigo;
        try {
            con = acceso.Conectar();    
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
            //REF#(6)
                MenuProducto mv = new MenuProducto();
                mv.mostrarmenu(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5));
                mv.setVisible(true);
            }else{
                System.out.println("Codigo invalido");
            }
        } catch (Exception e) {            
        }
        
    }
    
    
    public static void main(String[] args) {
        
        ProductoDAO testproductodao = new ProductoDAO();
        testproductodao.listar();
    }      
}
