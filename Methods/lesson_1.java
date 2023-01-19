import java.util.Scanner;

public class Praktikum {
    public static void main(String[] args) {
        System.out.println("Робот-помощник v1.0.");
    }

    // Объявите ниже метод welcomeUserByName
        public static void welcomeUserByName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Как вас зовут?");
        String name = scanner.next();// Сохраните введённое пользователем имя в переменную name
        System.out.println("Рад познакомиться, " + name + "!");
    }

    public static void sayHelloByTime() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Который час?");
        int currentHour = scanner.nextInt();// Спросите у пользователя "Который час?" и сохраните ответ в переменную currentHour
        if (currentHour < 6) {
            System.out.println("Доброй ночи!");
        } else if (currentHour < 12) {
            System.out.println("Доброе утро!");
        } else if (currentHour < 18) {
            System.out.println("Добрый день!");
        } else if (currentHour < 22) {
            System.out.println("Добрый вечер!");
        } else {
            System.out.println("Доброй ночи!");
        }
    }// В зависимости от времени предусмотрите печать приветствий 

    public static void printSuccess() { // Объявите метод printSuccess
        System.out.println("У вас уже не плохо получается программировать!"); // Он должен печатать строку: У вас уже неплохо получается программировать!
    }
}

------------------------------------------------------------------------------

import java.util.Scanner;

public class Praktikum {
    public static void main(String[] args) {
        System.out.println("Робот-помощник v2.0.");
        // Вызовите ниже методы в правильном порядке
        sayHello();
        sayHelloByTime();
        welcomeUserByName();
        printSuccess();
    }

    public static void welcomeUserByName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Как вас зовут?");
        String name = scanner.next();
        printCity();
        String city = scanner.next();// Допишите чтение города
        System.out.println("Рад познакомиться, " + name + " из " + city + "!");
    }

    public static void printSuccess() {
        System.out.println("У вас уже неплохо получается программировать!");
    }
    
    public static void sayHello() {
        System.out.println("Пивет!");// Допишите метод sayHellо(), который печатает: Привет!
    }
    public static void printCity() {
        System.out.println("Из какого вы города?"); // Допишите метод printCity(), который печатает: Из какого вы города?
    }

    public static void sayHelloByTime() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Который час?");
        int currentHour = scanner.nextInt();
        if (currentHour < 6) {
            System.out.println("Доброй ночи!");
        } else if (currentHour > 22) {
            System.out.println("Доброй ночи!");
        } else if (currentHour < 12) {
            System.out.println("Доброе утро!");
        } else if (currentHour < 18) {
            System.out.println("Добрый день!");
        } else {
            System.out.println("Добрый вечер!");
        }
    }
}

------------------------------------------------------------------------------

public class Praktikum {

    public static void main(String[] args) {
        // Ниже вызовите новый метод
        String highestGrossingFilm = findHighestGrossingFilm();
        System.out.println("Best grossing film: " + highestGrossingFilm);
    }

      public static String findHighestGrossingFilm() {
        String bestFilm = "";
        String film1 = "Титаник";
        int income1 = 2194;

        String film2 = "Аватар";
        int income2 = 2810;

        String film3 = "Тёмный рыцарь";
        int income3 = 1084;
    
            // Допишите реализацию метода ниже
        if (income1 > income2 && income1 > income3) {
            bestFilm = film1;
        } else if (income2 > income3 && income2 > income1) {
            bestFilm = film2;
        } else if (income3 > income1 && income3 > income2) {
            bestFilm = film3;
        }
        return bestFilm;
    }
}
-------
public class Praktikum {
 
    public static void main(String[] args) {
        // Ниже вызовите новый метод        
        String highestGrossingFilm = findHighestGrossingFilm();
        System.out.println("Самый кассовый фильм: " + highestGrossingFilm);
    }
 
    public static String findHighestGrossingFilm() {
        String film1 = "Титаник";
        int income1 = 2194;
 
        String film2 = "Аватар";
        int income2 = 2810;
 
        String film3 = "Тёмный рыцарь";
        int income3 = 1084;
 
        // Напишите реализацию нового метода ниже
        if (income1 > income2) {
            if (income1 > income3) { 
                return film1;  
            }    
        } else if (income2 > income1) {
            if (income2 > income3) {
                return film2;
            }    
        }   
        return film3;
    }
}

------------------------------------------------------------------------------

import java.util.Scanner;

public class Praktikum {

    public static void main(String[] args) {
        System.out.println("Привет!");
        doCommand();
    }

    public static void doCommand() {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Что вы хотите сделать?");
            System.out.println("1 - Получить совет о покупке евро");
            System.out.println("2 - Получить совет о покупке долларов");
            System.out.println("0 - Выход");
            int command = scanner.nextInt();
            if (command == 1) {
                System.out.println("Если евро стоит меньше 90 рублей - покупайте!");
               
            } else if (command == 2) {
                System.out.println("Если доллар стоит меньше 75 рублей - покупайте!");
               
            } else if (command == 0) {
                System.out.println("Выход");
             break;
            }
        }
      return;
    }
}

------------------------------------------------------------------------------

public class Praktikum {

    public static void main(String[] args) {
        System.out.println("Наибольшее из чисел 3 и 5 = " + findMax(3, 5));
        // Напишите аналогичный вызов метода findMax для таких пар чисел: 16 и 5, -1 и -7
        System.out.println("Наибольшее из чисел 16 и 5 = " + findMax(16, 5));
        System.out.println("Наибольшее из чисел -1 и -7 = " + findMax(-1, -7));

    }
    public static int findMax(int a, int b) {
            if (a > b) {
                return a;
            } 
            return b;
    }

}

------------------------------------------------------------------------------

public class Praktikum {

    public static void main(String[] args) {
        double[] expenses = {1772.5, 367.0, 120.6, 2150.2, 874.0, 1.0, 1459.4};
        double maxExpense = findMaxExpense(expenses); // Вызовите метод и присвойте maxExpense значение его результата
        
        
        System.out.println("Самая большая трата недели " + maxExpense);
    }
    
    public static double findMaxExpense(double[] expenses) {
        double maxExpense = 0;
        for (int i = 0; i < expenses.length; i++) {
            if (expenses[i] > maxExpense) {
            maxExpense = expenses[i]; 
            }
        }
        return maxExpense;// Объявите метод findMaxExpense
     // Реализуйте метод. Чтобы найти самую большую трату, воспользуйтесь циклом
   // Самую большую трату запишите в переменную maxExpense
    }
}

------------------------------------------------------------------------------

import java.util.Scanner;
public class Praktikum {

    public static void main(String[] args) {

        int balls = 15; // Сохраните общее число мячиков Пикселя в переменной balls
        System.out.println("У Пикселя " + balls + " мячиков");

        playPixel(balls);// Поиграйте с Пикселем, вызвав метод playPixel

        // После игры Пиксель должен вернуть все мячики на место! 
        System.out.println("Пиксель вернул все мячики");
        System.out.println("Их снова " + balls);
    }

    public static void playPixel(int balls) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько мячиков он спрятал?");
        int hiddenBalls = scanner.nextInt();  // Сохраните количество мячиков, которые спрятал Пиксель, в переменную hiddenBalls

        balls = balls - hiddenBalls; // Посчитайте, сколько у Пикселя осталось мячиков
        System.out.println("Осталось " + balls );
    }
}

------------------------------------------------------------------------------

import java.util.Scanner;

public class Praktikum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какую зарплату вы получите в этом месяце?");
        int salary = scanner.nextInt();
        System.out.println("Сколько планируете потратить на транспорт?");
        int transportMoney = scanner.nextInt();
        System.out.println("Сколько запланировано на супермаркеты?");
        int foodMoney = scanner.nextInt();
        System.out.println("Какую сумму хотите отложить?");
        int savings = scanner.nextInt();

        correctExpenses(salary, transportMoney, foodMoney, savings); // Вызовите метод correctExpenses с правильными аргументами

        // Напечатайте запланированные траты
        System.out.println("Вы планировали потратить: транспорт — " + transportMoney + ", "
                + "еда — " + foodMoney + ", "
                + "сбережения — " + savings + ".");
    }

    public static void correctExpenses(int salary, int transportMoney, int foodMoney, int savings) { // Объявите метод correctExpenses 
    // Тело метода дано ниже
    
        int expensesSum = transportMoney + foodMoney + savings; // Считаем расходы
        int leftMoney = salary - expensesSum; // Считаем излишек средств
        
        if (expensesSum > salary) { // Проверяем, не превышают ли расходы зарплату
            int lackMoney = expensesSum - salary; // Считаем, сколько не хватает
            
            // Пока не начнёт хватать денег на транспорт — сокращаем траты на 100 рублей
            while ((salary - foodMoney) < transportMoney) {
                foodMoney = foodMoney - 100;
            }
            // Если не хватает денег на жизнь — не откладываем
            if (transportMoney + foodMoney + savings > salary) {
                savings = 0;
            }
            
            // Печатаем рекомендации
            System.out.println("Придётся пересмотреть планы, вам не хватает " + lackMoney);
            System.out.println("Рекомендуемые траты: "
                    + "еда — " + foodMoney + ", "
                    + "сбережения — " + savings + ".");
        } else {
            System.out.println("В этом месяце дебет с кредитом сошлись!");
            System.out.println("Свободных средств " + leftMoney);
        }
    }
}

------------------------------------------------------------------------------

public class Praktikum {

    public static void main(String[] args) {
        
        double[] feedExpensesCat = {100.50, 236.0, 510.6, 150.20, 80.0, 172.0, 135.4};
        double[] feedExpensesHamster = {70.50, 146.0, 710.6, 250.20, 83.0, 19.0, 55.4};
        
        sayHello("Пиксель");
        System.out.println("Твой самый дорогой корм стоил " + findMaxExpense(feedExpensesCat));
        System.out.println("Всего на корм было потрачено " + findExpensesSum(feedExpensesCat));
        sayEnjoyMeal("Пиксель");
        sayHello("Байт");
        System.out.println("Твой самый дорогой корм стоил " + findMaxExpense(feedExpensesHamster));
        System.out.println("Всего на корм было потрачено " + findExpensesSum(feedExpensesHamster));
        sayEnjoyMeal("Байт");
    }
    
        public static double findMaxExpense(double[] expenses) {
            double maxFeedExpense = 0;
            for (int i = 0; i < expenses.length; i++) {
                if (expenses[i] > maxFeedExpense) {
                    maxFeedExpense = expenses[i];
                }
            }
                return maxFeedExpense;
        }
      
        public static double findExpensesSum(double[] expenses) {
            double sumFeed = 0;
            for (int i = 0; i < expenses.length; i++) {
                sumFeed = sumFeed + expenses[i];
            }
                return sumFeed;
        }
        
        public static void sayHello(String name) {
            System.out.println("Привет, " + name + "!");
        }
        
        public static void sayEnjoyMeal (String name) {
            System.out.println("Приятного аппетита, " + name + "!");
        }
}

------------------------------------------------------------------------------

import java.util.Scanner;

public class Praktikum {
    public static void main(String[] args) {
        double[] expenses = new double[7];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Сколько денег у вас осталось до зарплаты?");
        double moneyBeforeSalary = scanner.nextDouble();

        System.out.println("Сколько дней до зарплаты?");
        int daysBeforeSalary = scanner.nextInt();

    

        while (true) {
            printMenu();// Вынесите печать меню в метод printMenu, здесь останется только его вызов
            int command = scanner.nextInt();

            if (command == 1) {
                convert(scanner, moneyBeforeSalary);// Вынесите обработку команды в метод convert, здесь вызовите его
          
            } else if (command == 2) {
                getAdvice(moneyBeforeSalary, daysBeforeSalary); // Вынесите обработку команды в метод getAdvice, здесь вызовите его
             } else if (command == 3) {
                System.out.println("За какой день вы хотите ввести трату: 1-ПН, 2-ВТ, 3-СР, 4-ЧТ, 5-ПТ, 6-СБ, 7-ВС?");
                int day = scanner.nextInt();
                System.out.println("Введите размер траты:");
                double expense = scanner.nextDouble();
                moneyBeforeSalary = moneyBeforeSalary - expense;
                expenses[day - 1] = expenses[day - 1] + expense;
                System.out.println("Значение сохранено! Ваш текущий баланс в рублях: " + moneyBeforeSalary);
                if (moneyBeforeSalary < 1000) {
                    System.out.println("На вашем счету осталось совсем немного. Стоит начать экономить!");
                }
            } else if (command == 4) {
                for (int i = 0; i < expenses.length; i++) {
                    System.out.println("День " + (i + 1) + ". Потрачено " + expenses[i] + " рублей");
                }
            } else if (command == 5) {
                double maxExpense = 0;
                for (int i = 0; i < expenses.length; i++) {
                    if (expenses[i] > maxExpense) {
                        maxExpense = expenses[i];
                    }
                }
                System.out.println("Самая большая сумма расходов на этой неделе составила " + maxExpense + " руб.");
            } else if (command == 0) {
                System.out.println("Выход");
                break;
            } else {
                System.out.println("Извините, такой команды пока нет.");
            }
        }
    }

    // Объявите и реализуйте метод printMenu, который печатает меню
    public static void printMenu() {
                    System.out.println("Что вы хотите сделать? ");
            System.out.println("1 - Конвертировать валюту");
            System.out.println("2 - Получить совет");
            System.out.println("3 - Ввести трату");
            System.out.println("4 - Показать траты за неделю");
            System.out.println("5 - Показать самую большую сумму расходов за неделю");
            System.out.println("0 - Выход");
    }
  
    // Объявите и реализуйте метод convert, который конвертирует валюты 
    public static void convert(Scanner scanner, double moneyBeforeSalary) {
        double rateUSD = 78.5;
        double rateEUR = 85;
        double rateJPY = 0.74;
        
        System.out.println("Ваши сбережения: " + moneyBeforeSalary + " RUB");
        System.out.println("В какую валюту хотите конвертировать? Доступные варианты: 1 - USD, 2 - EUR, 3 - JPY.");
            int currency = scanner.nextInt();
                if (currency == 1) {
        System.out.println("Ваши сбережения в долларах: " + moneyBeforeSalary / rateUSD);
                } else if (currency == 2) {
                    System.out.println("Ваши сбережения в евро: " + moneyBeforeSalary / rateEUR);
                } else if (currency == 3) {
                    System.out.println("Ваши сбережения в иенах: " + moneyBeforeSalary / rateJPY);
                } else {
                    System.out.println("Неизвестная валюта");
                }
        
    }
   
    // Объявите и реализуйте метод getAdvice, который даёт совет
    public static void getAdvice (double moneyBeforeSalary, int daysBeforeSalary) {
                       if (moneyBeforeSalary < 3000) {
                    System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
                } else if (moneyBeforeSalary < 10000){
                    if (daysBeforeSalary < 10) {
                        System.out.println("Окей, пора в Макдак!");
                    } else {
                        System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
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
    }
}

------------------------------------------------------------------------------

import java.util.Scanner;

public class Praktikum {
    public static void main(String[] args) {
        double[] expenses = new double[7];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Сколько денег у вас осталось до зарплаты?");
        double moneyBeforeSalary = scanner.nextDouble();

        System.out.println("Сколько дней до зарплаты?");
        int daysBeforeSalary = scanner.nextInt();

        while (true) {
            printMenu();
            int command = scanner.nextInt();

            if (command == 1) {
                convert(scanner, moneyBeforeSalary);
            } else if (command == 2) {
                getAdvice(moneyBeforeSalary, daysBeforeSalary);
            } else if (command == 3) {
                // Перенесите код ниже в метод saveExpense
                // Вызовите метод с помощью такой строки:
            moneyBeforeSalary = saveExpense(scanner, moneyBeforeSalary, expenses);
            } else if (command == 4) {
                printAllExpenses(expenses);// Перенесите обработку команды в метод printAllExpenses, здесь вызовите его
    
            } else if (command == 5) {
               // Перенесите поиск максимальной траты в метод findMaxExpense

                // Печать должна остаться здесь — для получения максимальной траты нужно вызвать метод
                System.out.println("Самая большая сумма расходов на этой неделе составила " + findMaxExpense(expenses) + " руб.");
            } else if (command == 0) {
                System.out.println("Выход");
                break;
            } else {
                System.out.println("Извините, такой команды пока нет.");
            }
        }
    }

    public static double saveExpense(Scanner scanner, double moneyBeforeSalary, double[] expenses) {
        System.out.println("За какой день вы хотите ввести трату: 1-ПН, 2-ВТ, 3-СР, 4-ЧТ, 5-ПТ, 6-СБ, 7-ВС?");
            int day = scanner.nextInt();
            System.out.println("Введите размер траты:");
            double expense = scanner.nextDouble();
            moneyBeforeSalary = moneyBeforeSalary - expense;
            expenses[day - 1] = expenses[day - 1] + expense;
            System.out.println("Значение сохранено! Ваш текущий баланс в рублях: " + moneyBeforeSalary);
                if (moneyBeforeSalary < 1000) {
                    System.out.println("На вашем счету осталось совсем немного. Стоит начать экономить!");
                }
        return moneyBeforeSalary;
    } /* Добавьте здесь метод saveExpense, который будет сохранять значение расходов пользователя.
           saveExpense также должен возвращать новое значение остатка средств. */

    public static void printAllExpenses(double[] expenses) {
                    for (int i = 0; i < expenses.length; i++) {
                    System.out.println("День " + (i + 1) + ". Потрачено " + expenses[i] + " рублей");
                }
    }// Объявите и реализуйте здесь метод printAllExpenses

    public static double findMaxExpense (double[] expenses) {
                double maxExpense = 0;
                for (int i = 0; i < expenses.length; i++) {
                    if (expenses[i] > maxExpense) {
                        maxExpense = expenses[i];
                    }
                }
        return maxExpense;
    } // Напишите метод findMaxExpense — он должен возвращать значение максимальной траты
    

    public static void printMenu() {
        System.out.println("Что вы хотите сделать? ");
        System.out.println("1 - Конвертировать валюту");
        System.out.println("2 - Получить совет");
        System.out.println("3 - Ввести трату");
        System.out.println("4 - Показать траты за неделю");
        System.out.println("5 - Показать самую большую сумму расходов за неделю");
        System.out.println("0 - Выход");
    }

    public static void getAdvice(double moneyBeforeSalary, int daysBeforeSalary) {
        if (moneyBeforeSalary < 3000) {
            System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
        } else if (moneyBeforeSalary < 10000){
            if (daysBeforeSalary < 10) {
                System.out.println("Окей, пора в Макдак!");
            } else {
                System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
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
    }

    public static void convert(Scanner scanner, double moneyBeforeSalary) {
        double rateUSD = 78.5;
        double rateEUR = 85;
        double rateJPY = 0.74;

        System.out.println("Ваши сбережения: " + moneyBeforeSalary + " RUB");
        System.out.println("В какую валюту хотите конвертировать? Доступные варианты: 1 - USD, 2 - EUR, 3 - JPY.");
        int currency = scanner.nextInt();
        if (currency == 1) {
            System.out.println("Ваши сбережения в долларах: " + moneyBeforeSalary / rateUSD);
        } else if (currency == 2) {
            System.out.println("Ваши сбережения в евро: " + moneyBeforeSalary / rateEUR);
        } else if (currency == 3) {
            System.out.println("Ваши сбережения в иенах: " + moneyBeforeSalary / rateJPY);
        } else {
            System.out.println("Неизвестная валюта");
        }
    }
}
