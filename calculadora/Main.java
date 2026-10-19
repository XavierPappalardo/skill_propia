package calculadora;

import java.util.Scanner;

public class Main {

    // Método main (Punto de entrada del programa) 

    public static void main(String[] args) { 

        // Instanciamos Calculadora 

        Calculadora calculadora = new Calculadora();

        // Instanciamos Scanner para leer entrada del usuario 

        Scanner scanner = new Scanner(System.in);

        // Declaramos variables para almacenar los números 

        double numero1 = 0.0;
        double numero2 = 0.0;
        int opcion = 0;

        // Mostramos el menú de opciones 

        System.out.println("Calculadora");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Potenciación");
        System.out.println("6. Salir");

        // Leemos la opción elegida 

        System.out.print("Ingrese una opción: ");
        opcion = scanner.nextInt();

        // Procesamos la opción seleccionada 

        if (opcion >= 1 && opcion <= 5) { 

            // Leemos el primer número 

            System.out.print("Ingrese el primer número: ");
            numero1 = scanner.nextDouble();

            // Leemos el segundo número 

            System.out.print("Ingrese el segundo número: ");
            numero2 = scanner.nextDouble();

            // Ejecutamos la operación correspondiente 

            switch (opcion) { 

                case 1: 
                    // Realizamos la suma 

                    System.out.println("Resultado: " + calculadora.sumar(numero1, numero2));
                    break;

                case 2: 
                    // Realizamos la resta 

                    System.out.println("Resultado: " + calculadora.restar(numero1, numero2));
                    break;

                case 3: 
                    // Realizamos la multiplicación 

                    System.out.println("Resultado: " + calculadora.multiplicar(numero1, numero2));
                    break;

                case 4: 
                    // Realizamos la división 

                    if (numero2 == 0) { 

                        // Informamos que no es posible dividir por cero 

                        System.out.println("Error: No es posible dividir por cero");

                    } else { 

                        // Realizamos la división 

                        System.out.println("Resultado: " + calculadora.dividir(numero1, numero2));

                    }
                    break;

                case 5: 
                    // Realizamos la potenciación 

                    System.out.println("Resultado: " + calculadora.potenciar(numero1, numero2));
                    break;

                default: 
                    // Opción no válida 

                    System.out.println("Opción no válida");
                    break;

            }

        } else if (opcion == 6) { 

            // Salimos del programa 

            System.out.println("Hasta luego");

        } else { 

            // Opción no válida 

            System.out.println("Opción no válida");

        }

        // Cerramos el Scanner 

        scanner.close();

    }

}