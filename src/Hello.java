public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

//        inputs : como poder "habar" con nuestra applicacion desde la terminal

//        arrays list: arrays que pueden crecer de tamaño

//        classes y methods: como crear objectos para modelar nuestro codigo hacia el mundo real


//        data types
        int numberOfStudents = 1;
        String courseName = "Java backend";
//        condicionales

        if (numberOfStudents > 2) {
            System.out.println("Empezamos la clase");
        } else {
            System.out.println("Esperamos");
        }
//        loops

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

//        arrays
        int[] numbers = {1,2,3,4,5};
        System.out.println(numbers[0]);
        System.out.println(numbers[numbers.length - 1]);

    }
}
