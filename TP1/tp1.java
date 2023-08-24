package INFO3.TP1;
import java.util.Scanner;

class tp1 {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);

        int opcion;
        int base, exponente;
        boolean b=true;

        do {
            System.out.println("\n1- Factorial de n.");
            System.out.println("2- Suma de los primeros n enteros.");
            System.out.println("3- Multiplicación.");
            System.out.println("4- División.");
            System.out.println("5- Mostrar Historial.");
            System.out.println("0- Salir.");
            System.out.print("\nIngrese la opción: ");
            opcion = var.nextInt();
            int n1 = 0;
            switch (opcion) {
                case 1:
                    n1 = pedirEntero();
                    System.out.println();
                    int factorial = calcfactorial(n1);
                    System.out.println(" = "+ factorial);
                    break;
                case 2:
                    n1 = pedirEntero();
                    System.out.println();
                    int suma = sumarecursiva(n1);   
                    System.out.println(" = "+suma);
                    break;
                /*case 3:
                        resultado = multiplicar(n1, n2);
                        System.out.println("La multiplicación es: " + resultado);
                        agregarResultado(resultado);
                        break;
                    case 4:
                        resultado = dividir(n1, n2);
                        System.out.println("El resultado de la división es: " + resultado);
                        agregarResultado(resultado);
                        break;
                    case 5:1
                        if (historial.isEmpty()) {
                            System.out.println("NO HAY NADA");
                        } else {
                            mostrarHistorial();
                        }
                        break;*/ 
                }
            } while (opcion != 0);
    }

    public static int calcfactorial (int n1) {
        if (n1 == 1){
            System.out.print(n1);
            return 1;
        } else {
            int prod = calcfactorial(n1-1);
            System.out.print(" * "+n1);
            return prod * n1;
        }
    }

    public static int sumarecursiva (int n1) {
        if (n1 == 1){
            System.out.print(n1);
            return 1;
        } else {
            int sum = sumarecursiva(n1-1);
            System.out.print(" + "+n1);
            return sum + n1;
            
        }
    }

    public static int pedirEntero (){
        boolean a = true;
        int n1=0;
        Scanner var = new Scanner(System.in);
        do {
            System.out.print("Ingrese el número entero: ");
            try {
                String n1a;
                n1a = var.nextLine();
                n1 = Integer.parseInt(n1a);
                a = false;
                break; // Sale del bucle si se ingresa un valor válido
            } catch (NumberFormatException  e) {
                System.out.println("Error: Ingrese un valor numérico válido.");
            }
        } while (a == true);
        return n1;
    }
    /*public static void potencia() {
        do {
            System.out.print("Ingrese el número 1: ");
            try {
                String baseaux;
                baseaux = var.nextLine();
                base = Integer.parseInt(baseaux);
                b = false;
                break; // Sale del bucle si se ingresa un valor válido
            } catch (NumberFormatException  e) {
                System.out.println("Error: Ingrese un valor numérico válido.");
            }
        } while (b == true);
        b=true;
        do {
            System.out.print("Ingrese el número 2: ");
            try {
                String exponenteaux;
                exponenteaux = var.nextLine();
                exponente = Integer.parseInt(exponenteaux);
                b = false;
                break; // Sale del bucle si se ingresa un valor válido
            } catch (NumberFormatException  e) {
                System.out.println("Error: Ingrese un valor numérico válido.");
            }
        } while (b == true);
    }*/
    /*public static int conteorecursivo (int n1) {


        for(int n;;){

        }
        if (n1 == 0){
            return 1;
        } else {
            return n1 + calcfactorial(n1-1);
        }
    }*/

}