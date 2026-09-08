import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        double a, b, resultado;

        do {
            System.out.println("======================================");
            System.out.println("        CALCULADORA BASICA");
            System.out.println("======================================");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("--------------------------------------");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingrese el primer numero: ");
                a = entrada.nextDouble();
                System.out.print("Ingrese el segundo numero: ");
                b = entrada.nextDouble();

                switch (opcion) {
                    case 1:
                        resultado = a + b;
                        System.out.println("Resultado de la suma: " + resultado);
                        break;
                    case 2:
                        resultado = a - b;
                        System.out.println("Resultado de la resta: " + resultado);
                        break;
                    case 3:
                        resultado = a * b;
                        System.out.println("Resultado de la multiplicacion: " + resultado);
                        break;
                    case 4:
                        if (b != 0) {
                            resultado = a / b;
                            System.out.println("Resultado de la division: " + resultado);
                        } else {
                            System.out.println("Error: no se puede dividir entre cero.");
                        }
                        break;
                }
            } else if (opcion == 5) {
                System.out.println("Saliendo del programa...");
            } else {
                System.out.println("Opcion no valida, intente de nuevo.");
            }
        } while (opcion != 5);

        entrada.close();
    }
}