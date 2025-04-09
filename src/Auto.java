public class Auto extends Vehiculo{

    private int numeroPuertas;

    public Auto() {
    }

    public Auto(String marca, String modelo, int anio, double precioBase, int numeroPuertas) {
        super(marca, modelo, anio, precioBase);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String toString() {
        return super.toString()+ ", El auto tiene: "
                 + numeroPuertas + " Puertas"
               ;
    }

    public void mostrarInformacion(){

    }
}
