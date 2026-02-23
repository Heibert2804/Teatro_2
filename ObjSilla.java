public class ObjSilla{
    private int NumSilla;
    private int Posicion;
    private double Precio;
    
    public ObjSilla() {
    }

    public ObjSilla(int numSilla, int posicion, double precio) {
        NumSilla = numSilla;
        Posicion = posicion;
        Precio = precio;
    }

    public int getNumSilla() {
        return NumSilla;
    }

    public void setNumSilla(int numSilla) {
        NumSilla = numSilla;
    }

    public int getPosicion() {
        return Posicion;
    }

    public void setPosicion(int posicion) {
        Posicion = posicion;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    
    
}