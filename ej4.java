import java.util.Scanner;
public class ej4 {
    public static void main(String[] args){
        System.out.println("¿Qué numeros enteros quieres sumar?");
        System.out.print("Primer numero: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        if (num1 instanceof Integer) {
            sc.nextLine();
            System.out.print("Segundo mumero: ");
            int num2 = sc.nextInt();
            if (num2 instanceof Integer) {
                System.out.println("La suma es " + (num1+num2));
            } else {
                System.out.println("No es un numero entero.");
            }
        } else {
            System.out.println("No es un numero entero.");
        }
    }
}
