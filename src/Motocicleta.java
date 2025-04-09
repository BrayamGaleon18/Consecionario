public class Motocicleta extends Vehiculo {

    private int clilindraje;

    public Motocicleta() {
    }

    public Motocicleta(String marca, String modelo, int anio, double precioBase, int clilindraje) {
        super(marca, modelo, anio, precioBase);
        this.clilindraje = clilindraje;
    }

    public int getClilindraje() {
        return clilindraje;
    }

    public void setClilindraje(int clilindraje) {
        this.clilindraje = clilindraje;
    }

    @Override
    public String toString() {
        return super.toString() + " El cilindraje de la motocicleta es: " +
                clilindraje;
    }
    public void mostrarInformacion(){

    }
}
