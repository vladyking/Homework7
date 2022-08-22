public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        /** Задание 1:
         Представим, что мы работаем в небольшой компании.
         Данные сотрудников хранятся в неструктурированном формате, и бухгалтерия попросила написать программу,
         в которой можно работать с Ф.И.О. сотрудников.
         Напишите четыре строки:
         первая с именем firstName — для хранения имени;
         вторая с именем middleName — для хранения отчества;
         третья с именем lastName — для хранения фамилии;
         четвертая с именем fullName — для хранения Ф.И.О. сотрудника в формате "Фамилия Имя Отчество".
         Выведите в консоль фразу: “ФИО сотрудника — ...”
         В качестве данных для задачи используйте “Ivanov Ivan Ivanovich”.
         Критерии оценки
         – Строки инициализированы верно.
         – Сложение строк проведено корректно.
         – При изменении данных в строках результат программы выводится корректно.
         – Все условия задания выполнены.*/

        {//Вариант решения 1.1
            System.out.println("Ответ на задание №1: ");
            String firstName = "Ivan";
            String middleName = "Ivanovich";
            String lastName = "Ivanov";
            String fullName = String.format("%s %s %s", lastName, firstName, middleName);
            System.out.println("1.1. ФИО сотрудника - " + fullName);
        }
        {//Вариант решения 1.2
            String firstName = new String(new char[]{'I', 'v', 'a', 'n'});
            String middleName = new String(new char[]{'I', 'v', 'a', 'n', 'o', 'v', 'i', 'c', 'h'});
            String lastName = new String(new char[]{'I', 'v', 'a', 'n', 'o', 'v'});
            String fullName = String.format("%s %s %s", lastName, firstName, middleName);
            System.out.println("1.2. ФИО сотрудника - " + fullName);
        }
        {//Вариант решения 1.3
            var firstName = "Ivan";
            var middleName = "Ivanovich";
            var lastName = "Ivanov";
            var fullName = String.format("%s %s %s", lastName, firstName, middleName);
            System.out.println("1.3. ФИО сотрудника - " + fullName);
            System.out.println();
        }
    }

    public static void task2() {
        /** Задание 2:
         Для подачи ежемесячного отчета и ведения документации нашей бухгалтерии нужны Ф.И.О. сотрудников,
         полностью написанные заглавными буквами (верхним регистром).
         Напишите программу, которая изменит написание Ф.И.О. сотрудника с “Ivanov Ivan Ivanovich”
         на полностью заглавные буквы.
         В качестве строки с исходными данными используйте строку fullName.
         Результат программы выведите в консоль в формате: "Данные ФИО сотрудника для заполнения отчета — ..."
         Критерии оценки
         – Применен метод, меняющий регистр символов строки.
         – При изменении содержания строки результат программы выполняется.
         – Результат программы выведен в консоль согласно условиям задачи.*/

        {//Вариант решения
            System.out.println("Ответ на задание №2: ");
            String firstName = "Ivan";
            String middleName = "Ivanovich";
            String lastName = "Ivanov";
            String fullName = String.format("%s %s %s",  lastName, firstName, middleName);
            System.out.println("ФИО сотрудника - " + fullName.toUpperCase());
            System.out.println();
        }

    }

    public static void task3() {
        /** Задание 3
         Система, в которой мы работаем, не принимает символ “ё”.
         Поэтому нам нужно написать программу, которая заменяет символ “ё” на символ “е”.
         В качестве исходных данных используйте строку fullName и данные в ней “Иванов Семён Семёнович”.
         Выведите результат программы в консоль в формате: "Данные ФИО сотрудника — ..."
         Подсказка
         Может потребоваться метод split() и метод contains().
         Критерии оценки
         – Применен метод, меняющий написание данных строки.
         – При изменении содержания строки результат программы выполняется.
         – Результат программы выведен в консоль согласно условиям задачи.*/

        {
            System.out.println("Ответ на задание №3: ");
            System.out.print("Данные ФИО сотрудника — ");
            String fullName = "Иванов Семён Семёнович";
            String [] split = fullName.split(" ");
            for (String current : split) {
                if (current.contains("ё")) {
                    String text = current.replace("ё", "е");
                    System.out.print(text);
                } else {
                    System.out.print(current);
                }
                System.out.print(" ");
            }
        }
    }
}
