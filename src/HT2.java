public class HT2 {
/* Задача №1
Необходимо создать целочисленные переменные a и b, присвоить произвольные значения переменным на ваш выбор и вывести результаты следующих операций с этими переменными: сложение, умножение, вычитание, деление.
Экстра задача
Также вывести остаток от деления и сделать проверку на четность этих переменных.
Экстра задача
Вывести/напечатать смайлик (не :), а настоящий смайлик одним символом).

 */

    public static void main(String[] args) {
        int a = 12;
        int b = 23;
        System.out.println(a+b);
        System.out.println(a-b );
        System.out.println(a*b );
        System.out.println(a/b );
        System.out.println(a%b );
        boolean aCheking = a%2==0;
        boolean bCheking = b%2==0;
        String smile  = "\u263A";
        String smile1  ="\u2639";
        System.out.println("А четное ? " +  aCheking );
        System.out.println("B четное ? " + bCheking );
        System.out.println(smile + smile1 );
    }
}
