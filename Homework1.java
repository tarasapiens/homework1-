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

//возвращает символы в заданном промежутке
        String color = "фиолетовый";
        String result_c = color.substring(2, 5);
        System.out.println(result_c);

//возвращает первый найденный индекс начала вхождения строки. в данномслучае вернуд "5"
        String song = "Солнечный круг, небо вокруг";
        int result_d = song.indexOf("чный");
        System.out.println(result_d);

//Возвращает последний найденный индекс начала вхождения строки из параметров в исходной строке. вернуло "8"
        String phrase = "Случайности не случайны";
        int result_e = phrase.lastIndexOf("сти");
        System.out.println(result_e);

//


    }
}
