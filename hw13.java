public class hw13 {
    //С помощью оператора while напишите программу определения суммы всех нечетных чисел в диапазоне от 1 до 99 включительно

    public static void main(String[] args) {
        int j = 1;
        int sum = 0;

        while (j <= 99) {
            j++;
            if (j % 2 != 0) {
                sum =  sum + j;;
            }
        }
        System.out.println("сумма нечетных чисел: " + sum );
    }
}

