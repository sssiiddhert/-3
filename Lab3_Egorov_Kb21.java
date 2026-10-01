import java.util.Scanner;

public class Lab3_Egorov_Kb21 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("--- Збор Даних ---");

        System.out.print("1. Введіть логічне значення (true або false): ");
        boolean boolData = Boolean.parseBoolean(console.nextLine());

        System.out.print("2. Введіть дробове число (через крапку): ");
        double doubleData = Double.parseDouble(console.nextLine());

        System.out.print("3. Введіть довільний текст (бажано кілька слів): ");
        String textData = console.nextLine();

        System.out.print("4. Введіть ціле число: ");
        int intData = Integer.parseInt(console.nextLine());

        System.out.println("\n=== Виведення Результатів у 10 форматах ===");

        System.out.println("Формат 1 (Конкатенація): Текст: " + textData + " | Число: " + intData +
                " | Дріб: " + doubleData + " | Статус: " + boolData);

        System.out.printf("Формат 2 (printf базовий): Рядок=%s, Ціле=%d, Дробове=%f, Логічне=%b\n",
                textData, intData, doubleData, boolData);

        System.out.printf("Формат 3 (printf системи числення): DEC = %d, OCT = %o, HEX = %x\n",
                intData, intData, intData);

        System.out.printf("Формат 4 (printf зріз рядка): Перші 5 символів тексту -> '%.5s'\n", textData);

        System.out.printf("Формат 5 (printf комбінація для рядка): |%-20.7s|\n", textData);

        System.out.printf("Формат 6 (printf дріб): Округлене значення зі знаком: %+.4f\n", doubleData);

        System.out.printf("Формат 7 (printf нулі): Число з лідируючими нулями: %012d\n", intData);

        String out8 = String.format("Формат 8 (String.format регістр): %S (СТАТУС: %B)", textData, boolData);
        System.out.println(out8);

        String out9 = String.format("Формат 9 (String.format індекси): 4-й=%4$s, 3-й=%3$d, 2-й=%2$.2f, 1-й=%1$b",
                boolData, doubleData, intData, textData);
        System.out.println(out9);

        String out10 = String.format("Формат 10 (String.format звіт): Дані користувача [%s] | Код: %X | Множник: %08.2f",
                textData, intData, doubleData);
        System.out.println(out10);

        console.close();
    }
}
