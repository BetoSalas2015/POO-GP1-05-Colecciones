
/**
 * Write a description of class Factura here.
 * 
 * @author Roberto Salazar Marquez
 * @version 1.0
 */
import java.util.Vector;

public class Factura
{
    // Variables de Instancia 
    private String empresa;
    private String cliente;
    private static int folio;
    private Vector articulos;

    /**
     * Constructor para objetos de la clase Factura
     */
    public Factura(String nomCliente)
    {
        empresa = new String("Papelería Juanito");
        cliente = new String(nomCliente);
        folio++;
        articulos = new Vector(10);
    }
    
    public int getNumArticulos() {
        return articulos.size();
    }
    
    public void agregaArticulo(Articulo art) {
        articulos.add(art);
    }
    
    public Object getArticulo(int index) {
        return articulos.get(index);
    }
    
    public void setArticulo(int index, Articulo nuevo) {
        articulos.set(index, nuevo);
    }
    
    public double calculaTotalArticulos() {
        return 0.0;         //  aqui nos quedamos
    }
}




