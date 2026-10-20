import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, World!");
        System.out.println("Introduce tu nombre y apellido");
        String nombre = sc.nextLine();
        System.out.println("Hola " + nombre);
        

        System.out.println("Dime tu año de nacimento y te dire tu edad, estando en el 2026"); 
        int edad = sc.nextInt();
        edad = 2026 - edad;
        System.out.println("Tu edad actual es " + edad);


        sc.close();

    }
}
