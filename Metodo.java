import java.util.Scanner;
import java.util.Arrays;

public class Metodo {
    Scanner sc = new Scanner(System.in);

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
        int columna = matriz[0].length;
        

    }
    
}
