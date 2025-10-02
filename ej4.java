import java.util.Scanner;
public class ej4 {
    public static void main(String[] args){
        System.out.println("¿Qué numeros enteros quieres sumar?");
        System.out.print("Primer numero: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Segundo mumero: ");
        int num2 = sc.nextInt();
        System.out.println("La suma es " + (num1+num2));
    }
}
