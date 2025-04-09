public class Vehiculo {

    protected String marca;
    protected String modelo;
    protected int anio;
    protected double precioBase;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int anio, double precioBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precioBase = precioBase;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    @Override
    public String toString() {
        return "LAS CARACTERISTICAS DEL VEHICULO SON: " +
                "Marca= " + marca +
                ", Modelo = " + modelo  +
                ", Año= " + anio +
                ", Precio Base= " + precioBase
                ;
    }

    public double calcularPrecioFinal() {

        return precioBase+= precioBase* 0.10;
    }

    public void mostrarInformacion(){

}

}
