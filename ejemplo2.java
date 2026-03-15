import java.util.Scanner;

public class ejemplo2 {

    public static void main(String args[]){

        float matriz[][] = new float[3][3];
        for (int i=0 ; i<matriz.length ; i++){
            for (int j=0 ; j<matriz[i].length ; j++){
                System.out.println("Ingrese el valor para la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = new Scanner(System.in).nextFloat();
            }
        }
        for (int i=0 ; i<matriz.length ; i++){
            for (int j=0 ; j<matriz.length ; j++){
                System.out.println("el valor en la posición [" + i + "][" + j + "] es: " + matriz[i][j]);
            }
            
        }

    }
    
}
