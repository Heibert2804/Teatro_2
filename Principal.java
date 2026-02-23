public class Principal {

    public static void main(String[] args) {

        // llenar matriz
        ObjSilla[][] teatro = Metodo.LlenarRegistros();

        System.out.println("\n--- ANTES DE ORDENAR ---");
        mostrar(teatro);

        //ordenar por precio
        Metodo.OrdenarPorPrecio(teatro);

        System.out.println("\n--- DESPUÉS DE ORDENAR POR PRECIO ---");
        mostrar(teatro);
    }

    //mostrar la matriz
    public static void mostrar(ObjSilla[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println(matriz[i][j]);
            }
        }
    }
}