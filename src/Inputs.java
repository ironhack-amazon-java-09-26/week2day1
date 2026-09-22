import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        System.out.println("INPUTS");

//        System.out.println("Como te llamas?");
////        String name = "Salva"; hardcodeado
////        String name = args[0];
        Scanner scanner = new Scanner(System.in);
//        String name = scanner.nextLine();
//        System.out.println("Hola " + name);
//
//        System.out.println("Contraseña?");
//        String password = scanner.nextLine();
//
//        if (password.equals("1234")) {
//            System.out.println("Bienvenido " + name);
//        } else {
//            System.out.println("Contraseña incorrecta");
//        }

//        int i = 0;
//        while (i < 3 ) {
//            System.out.println(i);
//            i++; // DANGER
//        }



        String input = "";
        while (!input.equals("exit")){
            System.out.println("Commands availables: [greet, order]. Type 'exit' to quit");
            input = scanner.nextLine();
            System.out.println("Tu input fue: " + input);
            if (input.equals("greet")){
                System.out.println("Hola!");
                System.out.println("Como te llamas?");
                String name = scanner.nextLine();
                System.out.println("Hola " + name);
            } else if (input.equals("order")){
                System.out.println("Que quieres ordenar?");
                String order = scanner.nextLine();
                System.out.println("Tu orden fue: " + order);
            }
        }
    }
}
