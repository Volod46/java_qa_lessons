import java.util.Arrays;

public class hw11 {
    //1. Создать одномерный массив чисел
    //2. Заполнить массив следующим образом: [1,2,3,4,5,5,4,3,2,1]

    public static void main (String[] args) {
        int[] oneMass = new int[10];
        int start = oneMass[0];
        int middle = oneMass.length/2;
        int end = oneMass.length;

        for ( int a = 0; a < oneMass.length/2; a++) {
            oneMass[a] = a + 1;
            oneMass[oneMass.length - a - 1 ] = a + 1;
    }
        System.out.println(Arrays.toString(oneMass));
}
}
