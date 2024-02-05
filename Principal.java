import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner patata = new Scanner(System.in);

        System.out.print("Ingrese el número de usuarios: ");
        int numUsuarios = Integer.parseInt(patata.nextLine().trim());

        Usuario[] usuarios = new Usuario[numUsuarios];

        for (int i = 0; i < numUsuarios; i++) {
            usuarios[i] = new Usuario();
            System.out.println("Ingrese información para el Usuario " + (i + 1));
            System.out.print("Nombre: ");
            usuarios[i].nombre = patata.nextLine().trim();
            System.out.print("Apellidos: ");
            usuarios[i].apellidos = patata.nextLine();
            System.out.print("Email: ");
            usuarios[i].email = patata.nextLine().trim();
            System.out.println();
        }

        System.out.println("\nInformación de Usuarios:");
        for (Usuario usuario : usuarios) {
            System.out.println("Nombre: " + usuario.nombre);
            System.out.println("Apellidos: " + usuario.apellidos);
            System.out.println("Email: " + usuario.email);
            System.out.println();
        }
    }
}
