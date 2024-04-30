import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        System.out.println("Hola Mundo!");
        System.out.println("Pelicula Matrix");
         */

        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        String nombre = "Matrix";
        String sinopsis = """
                Matrix la mejor pelicular del fin del milenio.
                """;

        double mediaEvaluacionUsuario = 0;

        System.out.println("Pelicula: "+ nombre);
        System.out.println("Fecha de Lanzamiento: "+ fechaDeLanzamiento);
        System.out.println("Rating: "+ evaluacion);
        System.out.println("Disponible: " + incluidoEnElPlanBasico);

        double mediaEvaluacion = (4.5 + 4.8 + 3.0) / 3;
        System.out.printf("Media de Rating: %.2f%n", mediaEvaluacion );

        if(fechaDeLanzamiento >= 2023){
            System.out.println("Pelicula popular en el momento");
        } else {
            System.out.println("Pelicula retro que vale la pena ver!");
        }

        /*
        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner (System.in);
            System.out.println("Ingresa la evaluacion que le darias a Matrix: ");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
        }
        */

        int i = 0;
        Scanner teclado = new Scanner(System.in);
        while (i < 3) {
            System.out.println("Ingresa la evaluacion que le darias a Matrix: ");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
            i++;
        }

        System.out.printf("La media de la pelicula Matrix calculada por el usuario es %.2f%n", mediaEvaluacionUsuario / 3);
    }
}