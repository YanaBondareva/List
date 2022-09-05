import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            System.out.println("Выберете номер операции: \n1-Добавить\n2-Показать\n3-Удалить\n4-Поиск");
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    System.out.println("Какой продукт хотите добавить?");
                    input = scanner.nextLine();
                    list.add(input);
                    System.out.println("Количество покупок " + list.size());
                    Thread.sleep(1000);
                    break;
                case "2":
                    System.out.println("Список покупок:");
                    for (int i = 0; i < list.size(); i++)
                        System.out.println((i + 1) + " " + list.get(i));
                    Thread.sleep(1000);
                    break;
                case "3":
                    System.out.println("Список покупок:");
                    for (int i = 0; i < list.size(); i++)
                        System.out.println((i + 1) + " " + list.get(i));
                    System.out.println("Какой продукт хотите удалить?\nВведите номер или название.");
                    input = scanner.nextLine();

                    try {
                        Integer.parseInt(input);
                        int t = Integer.parseInt(input);
                        list.remove(t - 1);
                    } catch (NumberFormatException e) {
                        list.remove(input);
                    }
                    System.out.println("Список покупок:");
                    for (int i = 0; i < list.size(); i++)
                        System.out.println((i + 1) + " " + list.get(i));
                    Thread.sleep(1000);

                    break;
                case "4":
                    System.out.println("Введите слово для поиска");
                    input = scanner.nextLine();
                    String queryLower = input.toLowerCase();
                    System.out.println("Вот что найдено:");
                    for (int i = 0; i < list.size(); i++) {
                        String itemLover = list.get(i).toLowerCase();
                        if (itemLover.contains(queryLower)) {
                            System.out.println((i + 1) + " " + list.get(i));
                        }
                    }
                    Thread.sleep(1000);
                    break;
                default:
                    System.out.println("Неверный ввод.Нужно ввести число 1, 2 или 3, а вы ввели " + input);

            }
        }
    }
}

