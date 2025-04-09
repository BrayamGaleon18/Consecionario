import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        List<Vehiculo> lisVehiculo = new ArrayList<>();

        int opc, anio, puertas, cilindraje, ops;
        String mar, mod;
        double precioBase;

        do {
            System.out.println("""
                    
                    \n**** BIENVENIDO ****\n
                    ¿QUE VEHICULO DESEA AGREGAR?
                  
                    1.AUTO.
                    2.MOTOCICLETA.
                    3.MOSTRAR INFORMACION.
                    4.SALIR.
                    --------------------------
                    """);
            opc = teclado.nextInt();
            teclado.nextLine();

            switch (opc) {
                case 1 -> {
                    System.out.println("DIGTE LA MARCA DEL AUTO: ");
                    mar = teclado.nextLine();
                    System.out.println("DIGITE EL MODELO DEL AUTO: ");
                    mod = teclado.nextLine();
                    System.out.println("DIGITE EL AÑO DEL AUTO: ");
                    anio = teclado.nextInt();
                    System.out.println("DIGITE EL PRECIO BASE DEL AUTO: ");
                    precioBase = teclado.nextDouble();
                    System.out.println("DIGITE EL NÚMERO DE PUERTAS DEL VEHICULO: ");
                    puertas = teclado.nextInt();
                    lisVehiculo.add(new Auto(mar, mod, anio, precioBase, puertas));
                }
                case 2 -> {
                    System.out.println("DIGTE LA MARCA DE LA MOTOCICLETA: ");
                    mar = teclado.nextLine();
                    System.out.println("DIGITE EL MODELO DE LA MOTOCICLETA: ");
                    mod = teclado.nextLine();
                    System.out.println("DIGITE EL AÑO DE LA MOTOCICLETA: ");
                    anio = teclado.nextInt();
                    System.out.println("DIGITE EL PRECIO BASE DE LA MOTOCICLETA: ");
                    precioBase = teclado.nextDouble();
                    System.out.println("DIGITE EL CILINDRAJE DE LA MOTOCICLETA: ");
                    cilindraje = teclado.nextInt();
                    lisVehiculo.add(new Motocicleta(mar, mod, anio, precioBase, cilindraje));
                }
                case 3 -> {

                    System.out.println("""
                            \n***** ¿QUE VEHICULO DESEAS VER? *****
                            1.AUTOS.
                            2.MOTOCICLETAS.
                            -----------------------------------------
                            """);
                    ops = teclado.nextInt();
                    teclado.nextLine();
                    switch (ops) {
                        case 1 -> {

                            for (Vehiculo e : lisVehiculo) {
                                if (e instanceof Auto) {
                                    System.out.println(e);
                                }
                                System.out.println("EL PRECIO FINAL DEL AUTO ES: "+e.calcularPrecioFinal());
                            }


                        }
                        case 2 -> {

                            for (Vehiculo e : lisVehiculo) {
                                if (e instanceof Motocicleta) {
                                    System.out.println(e);
                                }
                                System.out.println("EL PRECIO FINAL DE LA MOTOCICLETA ES: "+e.calcularPrecioFinal());
                            }

                        }
                    }
                }
            }
        }while (opc!=4);
        System.out.println("****** FUE UN PLACER ATENDERTE ******");

    }
}