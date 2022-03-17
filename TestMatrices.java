
/**
 * Write a description of class TestMatrices here.
 * 
 * @author Roberto Salazar Marquez
 * @version 1.0
 */
public class TestMatrices
{
    // Variables de Instancia 
    private int matriz[][];
    private int matriz2[][] = { {1, 2, 3}, {4, 5}, {6, 7, 8, 9} };

    /**
     * Constructor para objetos de la clase TestMatrices
     */
    public TestMatrices()
    {
        int cont = 1;
        matriz = new int[3][3];
        
        for(int columna = 0; columna < matriz.length; columna++) 
            for(int renglon = 0; renglon < matriz[columna].length; renglon++)
                matriz[columna][renglon] = cont++;

    }
    
}



