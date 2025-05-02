import java.util.Scanner;

public class CharCounter {
    
    // Метод для подсчёта количества вхождений символа в строку
    public static int str_count(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Примеры использования
        System.out.println(str_count("Hello", 'o'));  // 1
        System.out.println(str_count("Hello", 'l'));  // 2
        System.out.println(str_count("", 'z'));       // 0
        
        // Взаимодействие с пользователем через консоль
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите строку: ");
        String inputString = scanner.nextLine();
        
        System.out.print("Введите символ для поиска: ");
        char targetChar = scanner.nextLine().charAt(0);
        
        int result = str_count(inputString, targetChar);
        System.out.printf("Символ '%c' встречается %d раз(а)\n", targetChar, result);
        
        scanner.close();
    }
}