public class Homework1 {
    public static void main(String[] args) {
// возвращает количество символов в строке
        String brand = "Gibson";
        int result = brand.length();
        System.out.println(result);

// определяет пустоту строки. в данном случае отработало false - не пустая
        String city = "Kazan";
        boolean result_a = city.isEmpty();
        System.out.println(result_a);

        // Метод возвращает результат запроса, является ли эта строка «пустой»,
        // не содержащих никаких символов, кроме пробелов. вернулся true
        String channel = "     ";
        boolean result_b = channel.isBlank();
        System.out.println(result_b);




    }
}
