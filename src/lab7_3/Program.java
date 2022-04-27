package src.lab7_3;

public class Program {
    public static void main(String[] args) {
        /* 6.В предложении из n слов первое слово поставить на место второго,
        второе – на место третьего, и т.д., (n-1)-е слово – на место n-го, n-е слово поставить на место первого.
        В исходном и преобразованном предложениях между словами должны быть или один пробел,
        или знак препинания и один пробел.
         */
        String text = """
                В предложении из n слов первое слово поставить на место второго,
                второе – на место третьего, и т.д., (n-1)-е слово – на место n-го, n-е слово поставить на место первого.
                В исходном и преобразованном предложениях между словами должны быть или один пробел,
                или знак препинания и один пробел.""";
        String res = "";
        // Индекс последнего слова в тексте
        int pos = text.lastIndexOf(" ");
        int length = text.length();
        // Буква, которая раньше была первой в тексте
        String oldFirstLetter = String.valueOf(text.charAt(0)).toLowerCase();
        // Буква, которая теперь будет первой в тексте
        String newFirstLetter = String.valueOf(text.charAt(pos + 1)).toUpperCase();

        if (String.valueOf(text.charAt(pos - 1)).matches("\\p{Punct}")) {
            // Если есть знак препинания перед последним словом
            res = newFirstLetter // Первая буква последнего слова
                    + text.substring(pos + 2, length - 1) // Последнее слово до точки
                    + text.charAt(pos - 1) // Знак препинания, который был перед последним словом
                    + " "
                    + oldFirstLetter // Первая буква текста
                    + text.substring(1, pos - 1) // Весь оставшийся текст
                    + text.substring(length - 1); // Последняя точка
        }
        else {
            // Если перед последним словом просто пробел
            res = newFirstLetter // Первая буква последнего слова
                    + text.substring(pos + 2, length - 1) // Последнее слово до точки
                    + " "
                    + oldFirstLetter // Первая буква текста
                    + text.substring(1, pos) // Весь оставшийся текст
                    + text.substring(length - 1); // Последняя точка
        }
        System.out.println(res);


        /* 7.	Текст шифруется по следующему правилу: из исходного текста выбирается 1, 4, 7, 10-й и т.д. (до конца текста) символы,
        затем 2, 5, 8, 11-й и т.д. (до конца текста) символы, затем 3, 6, 9, 12-й и т.д. Зашифровать заданный текст.
         */
        StringBuilder result = new StringBuilder("");
        String txt = "Lorem ipsum dolor sit amet";
        for (int i=0; i < txt.length(); i++){
            for (int j=i; j < txt.length(); j+=3) {
                result.append(txt.charAt(j));
            }
        }
        System.out.println(result);
    }
}
