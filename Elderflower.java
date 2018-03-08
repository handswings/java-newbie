package next;

import java.util.Scanner;

public class Elderflower {
public static void main(String[] args) {
Scanner q = new Scanner(System.in);
System.out.println("Отвечая на следующие команды, пишите слова с маленькой буквы и без звездочек. Введите *хорошо*, чтобы начать.");
String d = q.nextLine();
Scanner s = new Scanner(System.in);
System.out.println("Введите слово *псевдо*");
String x = s.nextLine();
Scanner r = new Scanner(System.in);
System.out.println("Продолжите цепочку: есть - ешь, петь - пой, гореть - ...");
String y = r.nextLine();
Scanner t = new Scanner(System.in);
System.out.println("Введите название приспособления-аксессуара против дождя НЕ в форме уменьшительно-ласкательного");
String f = t.nextLine();
;;System.out.println("В своем будущем Вы видите "+x+y+f+", поздравляем!");
}
}
