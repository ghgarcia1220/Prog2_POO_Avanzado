import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("\nIngrese el nombre del autor: ");
        String nombre = teclado.nextLine();

        System.out.print("Ingrese el e-mail del autor: ");
        String email = teclado.nextLine();

        System.out.print("Ingrese el genero del autor (m=masculino, f=femenino): ");
        char genero= teclado.next().charAt(0);

        Autor nAutor = new Autor(nombre, email, genero); // nAutor => nuevoAutor
        nAutor.setEmail(email);

        System.out.println("|------------------------------------------------");
        System.out.println("\nNombre del autor: " + nAutor.getNombre());
        System.out.println("Email del autor: " + nAutor.getEmail());
        
        if(nAutor.getGenero() == 'm'){
            System.out.println("Genero del autor: masculino\n");
        }else if(nAutor.getGenero() =='f'){
            System.out.println("Genero del autor: FEMENINO\n");
        }else{
            System.out.println("El valor ingresado no es valido.\n");
        }

        System.out.println("|------------------------------------------------");
    }
}
