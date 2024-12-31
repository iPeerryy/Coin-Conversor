import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultarMoneda consulta = new ConsultarMoneda();

        int opcion = 0;
        while (opcion != 10){
            System.out.println("***********************************\n" +
                    "Bienvenidos al conversor de monedas\n\n" +
                    "Ingresa la conversion que deseas realizar\n\n" +
                    "1. Dolar a Peso Argentino\n" +
                    "2. Peso Argentino a Dolar\n" +
                    "3. Dolar a Real Brasileiro\n" +
                    "4. Real Brasileiro a Dolar\n" +
                    "5. Dolar a Peso Colombiano\n" +
                    "6. Peso Colombiano a Dolar\n" +
                    "7. Peso Dominicano a Dolar\n" +
                    "8. Dolar a Peso Dominicano\n" +
                    "9. Convertir a otra moneda\n" +
                    "10. Salir");
            opcion = lectura.nextInt();
            lectura.nextLine();

            switch (opcion){
                case 1:
                    ConvertirMoneda.convertir("USD","ARS",consulta,lectura);
                    break;
                case 2:
                    ConvertirMoneda.convertir("ARS","USD",consulta,lectura);
                    break;
                case 3:
                    ConvertirMoneda.convertir("USD","BRL",consulta,lectura);
                    break;
                case 4:
                    ConvertirMoneda.convertir("BRL","USD",consulta,lectura);
                    break;
                case 5:
                    ConvertirMoneda.convertir("USD","COP",consulta,lectura);
                    break;
                case 6:
                    ConvertirMoneda.convertir("COP","USD",consulta,lectura);
                    break;
                case 7:
                    ConvertirMoneda.convertir("DOP","USD",consulta,lectura);
                    break;
                case 8:
                    ConvertirMoneda.convertir("USD","DOP",consulta,lectura);
                    break;
                case 9:
                    ConvertirMoneda.convertirOtraMoneda(consulta, lectura);
                    break;
                case 10:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }
}
