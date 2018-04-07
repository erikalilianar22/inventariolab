/*Autor: Erika Rodriguez*/
package inventariolab;
import java.util.Scanner;

public class Inventariolab {
    
    public class Admin{
        private String nombre,contra;
        
        public Admin (String nombre,String contra){
            this.nombre=nombre;
            this.contra=contra;
        }
        
        public String getNombre(){
            return nombre;
        }
        public String getContra(){
            return contra;
        }
        /**la persona no podra cambiar el usuario y contraseña preestablecidos, almenos que hable
        con el programador para que se la pueda cambiar**
        
        public void setNombre(String nombre){
            this.nombre=nombre;
        }
        public void setContra(String contra){
            this.contra=contra;
        }
        */
    }
    
    public class Proveedor{
        private String empresa,nombre,productos,direccion;
        private int telefono;
        
        public Proveedor(String empresa,String nombre, String productos, String direccion,int telefono){
            this.empresa=empresa;
            this.nombre=nombre;
            this.productos=productos;
            this.direccion=direccion;
            this.telefono=telefono;
        }
        
        public String getEmpresa(){
            return empresa;
        }
        public String getNombre(){
            return nombre;
        }
        public String getProductos(){
            return productos;
        }
        public String getDireccion(){
            return direccion;
        }
        public int getTelefono(){
            return telefono;
        }
        
        /*la persona podra modificar/quitar/añadir la informacion de las empresas que le proveen productos*/
        public void setEmpresa(String empresa){
            this.empresa=empresa;
        }
        public void setNombre(String nombre){
            this.nombre=nombre;
        }
        public void setProductos(String productos){
            this.productos=productos;
        }
        public void setDireccion(String direccion){
            this.direccion=direccion;
        }
        public void setTelefono(int telefono){
            this.telefono=telefono;
        }
        
    }
    
    
    public class Producto{
        private String tipo,nombre;
        private int cantidad;
        private double precio;
        
        public Producto(String tipo,String nombre,int cantidad, double precio){
            this.tipo=tipo;
            this.nombre=nombre;
            this.cantidad=cantidad;
            this.precio=precio;
        }
        
        public String getTipo(){
            return tipo;
        }
        public String getNombre(){
            return nombre;
        }
        public int getCantidad(){
            return cantidad;
        }
        public double getPrecio(){
            return precio;
        }
        
        public void setTipo(String tipo){
            this.tipo=tipo;
        }
        public void setNombre(String nombre){
            this.nombre=nombre;
        }
        public void setCantidad(int cantidad){
            this.cantidad=cantidad;
        }
        public void setPrecio(double precio){
            this.precio=precio;
        }
      
    }
    
    public class Factura{
        private String nombreneg,fecha,compras;
        private double totalcompra;
        
        public Factura(String nombreneg,String fecha,String compras, double totalcompra){
            this.nombreneg=nombreneg;
            this.fecha=fecha;
            this.compras=compras;
            this.totalcompra=totalcompra;
        }
        
        public String getNombreneg(){
            return nombreneg;
        }
        public String getFecha(){
            return fecha;
        }
        public String getCompras(){
            return compras;
        }
        public double getTotalcompra(){
            return totalcompra;
        }

        public void setCompras(String compras){
            this.compras=compras;
        }
        public void setTotalcompra(double totalcompra){
            this.totalcompra=totalcompra;
        }
        
    
    
    
}
    

    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
