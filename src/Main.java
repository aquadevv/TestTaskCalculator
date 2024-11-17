import java.util.Scanner;

public class Main {
    public static String calc(String input) throws Exception {
        try {
            int firstNum = Integer.parseInt(input.split(" ")[0]);
            int secondNum = Integer.parseInt(input.split(" ")[2]);
            if (firstNum < 1 || firstNum > 10 || secondNum < 1 || secondNum > 10)
                throw new Exception("Принимаются числа только от 1 до 10 включительно");

            String action = input.split(" ")[1];
            return switch (action) {
                case "+" -> String.valueOf(firstNum + secondNum);
                case "-" -> String.valueOf(firstNum - secondNum);
                case "*" -> String.valueOf(firstNum * secondNum);
                case "/" -> String.valueOf(firstNum / secondNum);
                default -> {
                    throw new Exception("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
                }
            };
        } catch (Exception e) {
            throw new Exception("throws Exception //т.к. строка не является математической операцией");
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println(calc(scanner.nextLine()));
    }
}