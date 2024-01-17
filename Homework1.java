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

//верхний регистр преобразует в нижний
        String region = "ТАТАРСТАН";
        String result_f = region.toLowerCase();
        System.out.println(result_f);

 //нижний регистр преобразует в верхний
        String flower = "драцена";
        String result_g = flower.toUpperCase();
        System.out.println(result_g);

//заменет сивмолы в строке
        String adjective = "обороноспособный";
        String result_h = adjective.replace("рон", "бно");
        System.out.println(result_h);

//Проверяет, начинается ли строка с указанного символа. здесь возврат false
        String building = "кирпичное";
        boolean result_i = building.startsWith("ю");
        System.out.println(result_i);

//Проверяет, заканчивается ли строка с указанного символа. здесь возврат true
        String car = "Ауди";
        boolean result_j = car.endsWith("и");
        System.out.println(result_j);

//на заданное число складывает строку. возврат soccersoccersoccersoccersoccersoccersoccer
        String ball = "soccer";
        String result_k = ball.repeat(7);
        System.out.println(result_k);

//определяет, есть ли указанная последовательность символов в строке. возврат true
        String watch = "Casio";
        boolean result_l = watch.contains("sio");
        System.out.println(result_l);

//присоединяет заданные сивмолы в конец строки. вывод: North Americaamer
        String continent = "North America";
        String result_m = continent.concat("amer");
        System.out.println(result_m);

//устраняет пробелы в начале и в конце строки
        String comp = " Asus ";
        String result_n = comp.trim();
        System.out.println(result_n);
    }
}
