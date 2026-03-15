
import java.util.Scanner;


public class Ejemplo {

    public static void main(String[] args){

      int tope;

      float promedio, suma=0 , min=0, max=0;

      Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de notas a promediar: ");
        tope = teclado.nextInt();

        float vector[] = new float[tope];
        
        for ( int i=0 ; i<vector.length ; i++){
            System.out.println("Ingrese la nota " + (i+1) + ": ");
            vector[i] = teclado.nextFloat();
            if (vector[i] < min || min == 0){
                min = vector[i];
            }
            if (vector[i] > max){
                max = vector[i];
            }
            suma = suma + vector[i];
        }
        promedio = suma / tope;

        System.out.println("Promedio: " + promedio);
        System.out.println("Mínima: " + min);
        System.out.println("Máxima: " + max);

}
}