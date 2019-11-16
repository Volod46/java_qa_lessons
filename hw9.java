import java.util.Random;

public class hw9 {

//1. Дан двумерный массив
//2. Заполнить двумерный массив рандомными значениями
//3. Выполнить поиск минимум и максимум в заполненом массиве

    public static void main(String[] args) {
        int[][] twoMass = new int[ 8 ][ 8 ];
        Random random = new Random();
        int max = twoMass[ 0 ][ 0 ];
        int min = twoMass[ 0 ][ 0 ];

        for (int i = 0; i < twoMass[ 0 ].length; i++) {
            for (int j = 0; j < twoMass.length; j++) {
                twoMass[ i ][ j ] = random.nextInt(40);
                System.out.print(twoMass[ i ][ j ] + " ");
            }
            System.out.println();
        }
            for (int i = 0; i < twoMass.length; i++) {
                for (int j = 0; j < twoMass.length; j++) {
                    if (twoMass[ i ][ j ] > max) {
                        max = twoMass[ i ][ j ];
                    }
                    if (twoMass[ i ][ j ] < min) {
                        min = twoMass[ i ][ j ];
                    }
                }
            }
                System.out.println("Max: " + max + " Min " + min);
            }
        }