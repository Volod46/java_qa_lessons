import java.util.Random;

public class hw10 {

    //1. Создать двумерный массив
    //2. Заполнить его рандомными значениями
    //3. Подсчитать сумму всех елементов масива (каждой его строки) и вывести на экран

    public static void main(String[] args) {
        int[][] twoMass_1 = new int[ 3 ][ 3 ];
        Random random = new Random();
        int sum = 0;

        for (int i = 0; i < twoMass_1.length; i++) {
            for (int j = 0; j < twoMass_1.length; j++) {
                twoMass_1[ i ][ j ] = random.nextInt(60);
                System.out.print(twoMass_1[ i ][ j ] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < twoMass_1.length; i++) {
            for (int j = 0; j < twoMass_1.length; j++) {
                sum += twoMass_1[ i ][ 0 ];
            }
            System.out.println("Вывод суммы строки " + sum);
        }
    }
}
