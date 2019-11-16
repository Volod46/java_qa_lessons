public class hw7 {

    // Создать строку. Проинициализировать ее значением. Например: String str = "mam";
//2. Выполнить разбивку строки на массив символов. Например: char[] chars = str.toCharArray();
//3. В цикле реализовать проверку этого массива на возможность его чтение в обе стороны
//4. Результат вывести в консоль


    public static void main(String[] args) {
        String word = "mam";
        boolean palindrome = true;
        char[] symbols = word.toCharArray();
        int length = symbols.length;

        for (int index = 0; index < length; index++) {
            char start = symbols[ index ];
            char end = symbols[ length - 1 - index ];
            if (start != end) {
                palindrome = false;
                break;
            }
        }
        if (palindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
