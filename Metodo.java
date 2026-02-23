import java.util.Scanner;
import java.util.Arrays;

public class Metodo {
    static Scanner sc = new Scanner(System.in);

    public static ObjSilla[][] LlenarRegistros(){
        ObjSilla[][] teatro = new ObjSilla[4][4];
        for(int i = 0; i < teatro.length; i++){
            for(int j = 0; j < teatro[i].length; j++){
                System.out.println("Registro Silla [" + i + "][" + j + "]");
                System.out.println("Numero de silla: ");
                int num = sc.nextInt();

                System.out.println("Fila: ");
                int fila = sc.nextInt();

                System.out.println("Precio: ");
                double precio = sc.nextDouble();
                
                teatro[i][j] = new ObjSilla(num, fila, precio);
            }
        }
        return teatro;
    }

    public static void OrdenarPorPrecio(ObjSilla[][] matriz){
        int filas = matriz.length;
        int columnas = matriz[0].length;
        
        ObjSilla[] aux = new ObjSilla[filas * columnas];

    int k = 0;

    // Convertir matriz a arreglo
    for (int i = 0; i < filas; i++) {
        for (int j = 0; j < columnas; j++) {
            aux[k++] = matriz[i][j];
        }
    }

    // Ordenar por precio (menor a mayor)
    Arrays.sort(aux, (s1, s2) ->
            Double.compare(s1.getPrecio(), s2.getPrecio())
    );

    // Regresar al formato matriz
    k = 0;
    for (int i = 0; i < filas; i++) {
        for (int j = 0; j < columnas; j++) {
            matriz[i][j] = aux[k++];
        }
    }
    }
    
}
