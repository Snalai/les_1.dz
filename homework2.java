package org.example.lesson4.HomeWork;

public class HomeWork2 {
    public static void main(String[] args) {
        String str = "(";
        System.out.println("homezadanie2(str) = " + homezadanie2(str));
    }

    /**
     * @apiNote При наличии строки, содержащей только символы , , , , и , определите, является ли входная строка допустимой.s'('')''{''}''['']'
     * @param str входная строка
     * @return является  ли строка допустимой
     */
    private static boolean homezadanie2(String str) {
        boolean b = false;
        int f = 0;
        if (str.length() > 1) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '(') {
                    if (str.charAt(i + 1) == ')') {
                        b = true;
                    } else if (')' == str.charAt(str.length() - 1)) {
                        b = true;
                    } else f++;
                }
                if (str.charAt(i) == '[') {
                    if (str.charAt(i + 1) == ']') {
                        b = true;
                    } else if (']' == str.charAt(str.length() - 1)) {
                        b = true;
                    } else f++;
                }
                if (str.charAt(i) == '{') {
                    if (str.charAt(i + 1) == '}') {
                        b = true;
                    } else if ('}' == str.charAt(str.length() - 1)) {
                        b = true;
                    } else f++;
                }

            }
        }
        if (f > 0){
            b = false;
        }
        return b;
    }
}
