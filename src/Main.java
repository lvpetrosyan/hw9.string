public class Main {
    public static void main(String[] args) {
        String phone = "79281946518";
        phone = phone.replace("-", "");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");
        if (phone.length() == 10) {
            phone = '7' + phone;
        } else if (phone.length() > 11) {
            throw new RuntimeException("телефон слишком длинный");
        } else if (phone.length() < 10) {
            throw new RuntimeException("телефон слишком короткий");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("посторонний знак");
        }
        System.out.println("phone=" + phone);
        String expected = "79281946519";
        if (phone.equalsIgnoreCase(expected)) {
            System.out.println("успех");
        } else {
            System.out.println("неудача");
        }
        System.out.println("Задание 1");

//Представим, что мы работаем в небольшой компании. Данные сотрудников хранятся в неструктурированном формате,
// и бухгалтерия попросила написать программу, в которой  можно работать с Ф. И. О. сотрудников.
//Напишите четыре строки:
//первая с именем firstName — для хранения имени;
//вторая с именем middleName — для хранения отчества;
//третья с именем lastName — для хранения фамилии;
//четвертая с именем fullName — для хранения Ф. И. О. сотрудника в формате "Фамилия Имя Отчество".
//Выведите в консоль фразу: “ФИО сотрудника — ….”
//В качестве данных для задачи используйте “Ivanov Ivan Ivanovich”.
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.printf("ФИО сотрудника — %s %s %s /ln", lastName, firstName, middleName);
        System.out.println("Задание 2");
        //Для подачи ежемесячного отчета и ведения документации нашей бухгалтерии нужны Ф. И. О.
        //сотрудников, полностью написанные заглавными буквами (верхним регистром).
        //Напишите программу, которая изменит написание Ф. И. О. сотрудника с “Ivanov Ivan Ivanovich” на полностью заглавные буквы.
        //В качестве строки с исходными данными используйте строку fullName.
        //Результат программы выведите в консоль в формате: ”Данные ФИО сотрудника для заполнения отчета — …”
        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName);
        System.out.println("Задание 3");
        //Система, в которой мы работаем, не принимает символ “ё”.
        //Поэтому нам нужно написать программу, которая заменяет символ “ё” на символ “е”.
        //В качестве исходных данных используйте строку fullName и данные в ней “Иванов Семён Семёнович”.
        //Выведите результат программы в консоль в формате: ка”Данные ФИО сотрудни — ...”
        String fullName2 = "Иванов Семён Семёнович";
        fullName2 = fullName2.replace("ё", "е");
        System.out.println("Данные ФИО сотрудни — " + fullName2);
//доп задания
        //К нам снова обратились за помощью, но теперь уже для того, чтобы написать алгоритм, разбивающий одну строку с Ф. И. О. на три — на фамилию, имя и отчество.
        //В качестве исходных данных используйте:
        //Ф. И. О. сотрудника: “Ivanov Ivan Ivanovich”;
        //строка fullName — для хранения Ф. И. О. сотрудника в формате фамилия - имя - отчество;
        //переменная firstName — для хранения имени;
        //переменная middleName — для хранения отчества;
        //переменная lastName — для хранения фамилии.
        //Решите задание с помощью метода substring().
        //Результат программы выведите в формате:
        //“Имя сотрудника — …”
        //“Фамилия сотрудника — …”
        //“Отчество сотрудника — ...”
        //:bulb: Важно: «в голове» высчитывать позиции пробелов и параметров для обрезания строки запрещено. Их должен вычислить компьютер.
        System.out.println("Задание 4");
        String allName = "ivanov ivan ivanovich";
        int index = allName.indexOf("");
        int index2 = allName.indexOf(" ");
        String firstName1=allName.substring(index, index2);
        System.out.println("Фамилия сотрудника — "+firstName1);
        int index3 = allName.lastIndexOf(" ");
        String middleName2=allName.substring(index2, index3);
        System.out.println("Имя сотрудника — "+ middleName2);
        int index4=allName.lastIndexOf("");
        String lastName2=allName.substring(index3, index4);
        System.out.println("Отчество сотрудника — "+lastName2);
        System.out.println("6");
        //Периодически данные в наших регистрах заполняются неверно, и Ф. И. О. сотрудников записывают со строчных букв.
        //Такую оплошность нужно исправить, написав программу, которая преобразует написанное со строчных букв Ф. И. О. в правильный формат.
        //В качестве исходных данных используйте строку fullName c данными “ivanov ivan ivanovich“, которые нужно преобразовать в “Ivanov Ivan Ivanovich”.
        //Выведите результат программы в консоль в формате: “Верное написание Ф. И. О. сотрудника с заглавных букв — …”
        String imya= firstName1.substring(0,1).toUpperCase()+firstName1.substring(1).toLowerCase();
        System.out.println(imya);
        String familiya=middleName2.substring(1,2).toUpperCase()+middleName2.substring(2).toLowerCase();
        System.out.println(familiya);
        String otchestvo= lastName2.substring(1,2).toUpperCase()+lastName2.substring(2).toLowerCase();
        System.out.println(otchestvo);
        System.out.println(7);
        String alfavit="aabccddefgghiijjkk";
        String res = alfavit.replaceAll("([a-z])\\1","");
        System.out.println(res);

        }




    }
