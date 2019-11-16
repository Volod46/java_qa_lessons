import java.util.Arrays;
import java.util.Random;

public class hw8 {

    //1. Создать одномерный массив чисел
    //2. Заполнить его рандомными значениями
    //3. Выполнить поиск всех четных елементов и добавить их в новый массив

    public static void main(String[] args) {

        int[] oneMass = new int[10];
//        oneMass[0] = 10; //index = 0;
//        oneMass[1] = 30; // index = 1;
//        oneMass[2] = 40; // index = 2;
        Random random = new Random();
        int[] evenNumbers = new int [oneMass.length];

        for (int index = 0; index < oneMass.length; index++) {
            oneMass[index] = random.nextInt(20);
        }
        for (int index = 0; index < oneMass.length; index++) {
            if (oneMass[index] % 2 == 0) {
                //System.out.println("четные: " + oneMass[index]);
                evenNumbers[index] = oneMass[index];
            }
        }
        System.out.println(Arrays.toString(evenNumbers));
    }
}
