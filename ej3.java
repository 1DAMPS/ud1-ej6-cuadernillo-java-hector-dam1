import java.util.Scanner;
public class ej3 {
    public static void main(String[] args){
        System.out.println("¿Qué edad tienes?");
        Scanner sc = new Scanner(System.in);
        int edad = sc.nextInt();
        System.out.println("Tienes " +edad+ " años");
    }
}
