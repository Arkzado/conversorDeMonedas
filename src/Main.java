import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        try {
            Scanner leer = new Scanner(System.in);
            int opcionConversion = 0;
            double precioMoneda = 0;
            String acronimoSeleccionado = "N/A";
            String acronimoAObtener = "N/A";

            System.out.println("""
                Bienvenido al conversor de monedas
             
                
                """);
            while (opcionConversion != 7){
                System.out.println("""
                    **********************************************************
                    1-) Dolar => Peso argentino
                    2-) Peso argentino => Dolar
                    3-) Dolar => Real brasileño
                    4-) Real brasileño => Dolar
                    5-) Dolar => Peso colombiano
                    6-) Peso colombiano => Dolar
                    7-) Salir
                    **********************************************************
                    Seleccione una conversión a realizar:
                    """);
                opcionConversion = leer.nextInt();

                switch (opcionConversion){
                    case 1:
                        acronimoSeleccionado = "USD";
                        acronimoAObtener = "ARS";
                        break;
                    case 2:
                        acronimoSeleccionado = "ARS";
                        acronimoAObtener = "USD";
                        break;
                    case 3:
                        acronimoSeleccionado = "USD";
                        acronimoAObtener = "BRL";
                        break;
                    case 4:
                        acronimoSeleccionado = "BRL";
                        acronimoAObtener = "USD";
                        break;
                    case 5:
                        acronimoSeleccionado = "USD";
                        acronimoAObtener = "COP";
                        break;
                    case 6:
                        acronimoSeleccionado = "COP";
                        acronimoAObtener = "USD";
                        break;
                    case 7:
                        System.out.println("Espero vuelva pronto");
                        break;
                    default:
                        System.out.println("Error al seleccionar conversión");
                        opcionConversion = 7;
                }
                Moneda divisaSeleccionada = new Moneda(acronimoSeleccionado);

                if(opcionConversion != 7){
                    System.out.println("Ingrese el valor de la moneda(" + divisaSeleccionada.getAcronimoDivisa() + "): ");
                    precioMoneda = leer.nextDouble();

                    divisaSeleccionada.setPrecioDivisa(precioMoneda);
                    divisaSeleccionada.setDivisaDestino(acronimoAObtener);
                }
            }
        }
        catch (InputMismatchException e){
            System.out.println("Error, solo se permiten numeros");
        }




    }
}
