package developers;

public class MiPrimerAplicacionJava {
    public static void main(String[] args) {
        String nombreCompleto, direccion, estadoCivil;
        String dir = "san salvador";
        int edad;
        double gastosDiarios;
        char genero;
        boolean poseeVehiculo;
        
        //Inicialización de variables
        nombreCompleto = "Camila Esperanza Rosales";
        direccion = "Calle de la armagura desvio la tristeza";
        estadoCivil = "Soltera";
        edad = 30;
        gastosDiarios = 34.45;
        genero = 'F';
        poseeVehiculo = false;
        
        System.out.println("Nombre completo: " + nombreCompleto);
        System.out.println("Dirección      : " + direccion);
        System.out.println("Estado civil   : " + estadoCivil);
        System.out.println("Edad           : " + edad);
        System.out.println("Gastos diarios : " + gastosDiarios);
        System.out.println("Genero         : " + genero);
        System.out.println("Posee vehículo : " + poseeVehiculo);
        
    }
}
