public class Praktikum {
    public static void main(String[] args) {
        for (int i = 1; i <= 17; i = i + 1) { // Здесь нужно объявить цикл
        System.out.println(i + "-я овечка перепрыгнула через забор.");
        }// Это тело цикла

        // Цикл завершён, далее выполнится эта строка:
        System.out.println("Хомяки сыты, овцы целы. Можно отдохнуть!");         
    }
}

------------------------------------------------------------------------------

public class Praktikum {
    public static void main(String[] args) {

        System.out.println("Это первый этаж дома, который построил Джек.");
        // Вместо многоточий добавьте нужные значения
        for (int i = 2; i <= 10; i = i + 1) {
            System.out.println("А это " + i + " этаж, он на один выше, чем этаж " + (i - 1));  //Место для вывода
        }
    }
}

------------------------------------------------------------------------------

public class Praktikum {

    public static void main(String[] args) {
        int days = 5; // Количество дней
        int moneyPerDay = 200; // Нужно откладывать в день
        int sum = 0; // Переменная, которая хранит общую сумму накоплений 
        
        for (int i = 1; i <= days; i ++) {
            sum = sum + moneyPerDay; // Каждый день увеличивается на значение moneyPerDay
            System.out.println("День " + i + ". " + "Уже " + sum + " руб."); // место для вывода
        }
    }
}

------------------------------------------------------------------------------

public class Praktikum {

    public static void main(String[] args) {
        int money = 500; // Деньги на корм
        int foodPerDay = 100; // Стоимость пачки корма
        int days = 0; // Дни, когда вы сможете покупать корм
                
        for (int i = money - foodPerDay; i >= 0; i = i - foodPerDay) { // Здесь опишите цикл, начинаем с 500 рублей 
        days = days + 3; // Здесь отразите, что вы будете покупать корм каждые три дня
        System.out.println("На " + days + "-й день останется " +  i + " рублей.");  // Опишите строку вывода
        }// Цикл оканчивается здесь

        System.out.println("Денег хватит на " + days + " дней.");
    }
}

------------------------------------------------------------------------------

public class Praktikum {
    public static void main(String[] args) {

        int flatsNumber = 5; // Количество квартир на этаже
         int floorsNumber = 10; // Количество этажей
        
        for (int i = 1; i <= floorsNumber; i++) {
            for (int j = 1; j <= flatsNumber; j++) {
              int currentFlat = (i - 1) * flatsNumber + j; // Заготовка формулы для учёта квартир
              System.out.println("Этаж " + i + " квартира " + currentFlat + " — доставлено.");
            }
        }
    }
}

------------------------------------------------------------------------------

class Praktikum {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++ ) {  // В тренировке должно выполниться 5 кругов
        System.out.println("Круг " + i);
            if (i % 2 == 0) {  // Выполнение каждого круга зависит от условия - проверьте, является ли круг чётным
                for (int k = 1; k <= 5; k++) {
                    // Если да, то присесть 5 раз
                    System.out.println("  Приседаем " + k);
                }
            } else if (i % 2 != 0) {
                    for (int j = 1; j <= 3; j++) { // Иначе нужно отжаться 3 раза
                        System.out.println("  Отжимаемся " + j);
                    }
            }
            for (int p = 1; p <= 7; p++) {  // Независимо от номера круга качаем пресс 7 раз
                System.out.println("  Качаем пресс " + p);
            }
        // Небольшое подбадривание в конце каждого круга
            System.out.println("Хороший темп, так держать!");
        }
        System.out.println("Отлично позанимались сегодня! Вы - молодец!");
    }
}

------------------------------------------------------------------------------

import java.util.Scanner;

class Praktikum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько денег у вас сейчас: ");
        double balance = scanner.nextDouble(); // Ваши сбережения
        int years = 0;

        while (balance <= 1000000) {
            balance = balance + balance * 0.05;
            years = years + 1;
        }

        System.out.println("Через " + years + " лет у вас будет миллион!");
    }
}

------------------------------------------------------------------------------

import java.util.Random;
import java.util.Scanner;

class Praktikum {
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in); 
        int randomInt = new Random().nextInt(1000); // Генерирует новое число от 0 до 1000
        
        int userInput = -1; // Это нужно, чтобы цикл запустился, если Random выдаст 0
        System.out.println("Я загадал число от 0 до 1000.");
        System.out.println("Ваш ход:");

        while (userInput != randomInt) { // Напишите условие цикла для запуска игры
        userInput = scanner.nextInt(); // В этой переменной должен сохраняться ввод пользователя
        if (userInput > randomInt) { // Условие проверяется в цикле
            System.out.println("Меньше");
        } else if (userInput < randomInt) {  // Второе условие 
        System.out.println("Больше");
            }
        }
                // Печатаем, когда число угадано
        System.out.println("Вы великолепны! Именно это я загадал.");
    }
}

------------------------------------------------------------------------------

import java.util.Scanner;

class Praktikum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0; // Сумма
        int input = 1; // Ввод пользователя

        while (input != 0) {
            input = scanner.nextInt();
            sum = sum + input; 
        }
        System.out.println("Сумма введённых чисел: " + sum);
    }
}
--------------------------------
import java.util.Scanner;

class Praktikum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0; // Сумма
        int input; // Ввод пользователя

        while (true) {
            input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            sum = sum + input;
        }
        System.out.println("Сумма введённых чисел: " + sum);
    }
}

------------------------------------------------------------------------------

import java.util.Random;

class Praktikum {
    public static void main(String[] args) {
        Random random = new Random(); // Генерирует случайное число
        int secretCode;
        int pilotInput;
                
        while (true) { // Добавьте цикл - ракета летает бесконечно
        secretCode = random.nextInt(100); // Здесь задаётся код - случайное число от 0 до 100
        System.out.println("Ракета SpaceY на орбите!");
        pilotInput = random.nextInt(100); // Пилот пытается угадать код
        
        if (secretCode == pilotInput) { // Если пилот угадал код, то цикл должен завершиться
            break;
        }
        }
            System.out.println("Пилот угадал число! Летим домой!");
    }
}

------------------------------------------------------------------------------
import java.util.Scanner;

class Praktikum {
    public static void main(String[] args) {
        double rateUSD = 78;
        double rateEUR = 85;
        double rateJPY = 0.74;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Сколько денег у вас осталось до зарплаты?");
        double moneyBeforeSalary = scanner.nextDouble();

        System.out.println("Сколько дней до зарплаты?");
        int daysBeforeSalary = scanner.nextInt();

        while (true) {//настройте бесконечный цикл здесь
            System.out.println("Что вы хотите сделать? ");
            System.out.println("1 - Конвертировать валюту");
            System.out.println("2 - Получить совет");
            System.out.println("0 - Выход"); // Новый пункт меню, осталось только реализовать логику

            int command = scanner.nextInt();

            if (command == 1) {
                System.out.println("В какую валюту хотите конвертировать? Доступные варианты: 1 - USD, 2 - EUR или 3 - JPY.");
                int currency = scanner.nextInt();

                if (currency == 1) {
                    System.out.println("Ваши сбережения в долларах: " + moneyBeforeSalary / rateUSD);
                } else if (currency == 2) {
                    System.out.println("Ваши сбережения в евро: " + moneyBeforeSalary / rateEUR);
                } else if (currency == 3) {
                    System.out.println("Ваши сбережения в йенах: " + moneyBeforeSalary / rateJPY);
                } else {
                    System.out.println("Валюта не поддерживается.");
                }

            } else if (command == 2) {
                if (moneyBeforeSalary < 3000) {
                    System.out.println("Сегодня лучше поесть дома. Экономьте и вы дотянете до зарплаты!");
                } else if (moneyBeforeSalary < 10000) {
                    if (daysBeforeSalary < 10) {
                        System.out.println("Окей, пора в Макдак!");
                    } else {
                        System.out.println("Сегодня лучше поесть дома. Экономьте и вы дотянете до зарплаты!");
                    }
                } else if (moneyBeforeSalary < 30000) {
                    if (daysBeforeSalary < 10) {
                        System.out.println("Неплохо! Прикупите долларов и зайдите поужинать в классное место. :)");
                    } else {
                        System.out.println("Окей, пора в Макдак!");
                    }
                } else {
                    if (daysBeforeSalary < 10) {
                        System.out.println("Отлично! Заказывайте крабов!");
                    } else {
                        System.out.println("Неплохо! Прикупите долларов и зайдите поужинать в классное место. :)");
                    }
                }
            } else if (command == 0) {
                System.out.println("Выход");
                break;
                
            } else {
                System.out.println("Извините, такой команды пока нет.");
            }
        
    }
}
}

------------------------------------------------------------------------------


