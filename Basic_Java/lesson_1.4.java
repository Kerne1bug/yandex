class Praktikum {
    public static void main(String[] args) {
        // Расходы за неделю
        double mondayExpense = 100.50;
        double tuesdayExpense = 500.00;
        double wednesdayExpense = 10.00;
        double thursdayExpense = 0.0;
        double fridayExpense = 40.60;
        double saturdayExpense = 500.10;
        double sundayExpense = 200.00;
            double[] expenses = {mondayExpense, tuesdayExpense, wednesdayExpense, thursdayExpense, fridayExpense, saturdayExpense, sundayExpense};

        // Объявите массив expenses и соберите в него значения из переменных
    }
}

------------------------------------------------------------------------------

class Praktikum {
    public static void main(String[] args) {
        double[] expenses = {100.50, 500.00, 10.00, 0.0, 640.60, 370.20, 200.00};

        // Добавьте 115 рублей к расходам за среду
        expenses[2] = 10.00 + 115;
        System.out.println("Новое значение расходов за среду: " + expenses[2] + " рублей.");

        // Суммируйте три самые крупные траты
        double summ = expenses[1] + expenses[4] + expenses[5];
        System.out.println("Самые большие расходы были во вторник, пятницу и субботу.");
        System.out.println("Всего вы потратили в эти дни: " + summ + " рублей.");
    }
}

------------------------------------------------------------------------------

class Praktikum {
    public static void main(String[] args) {
        double[] expenses = {100.50, 500.00, 10.00, 0.0, 640.60, 370.20, 200.00};

        // Добавьте 115 рублей к расходам за среду
        expenses[2] += 115.0;
        System.out.println("Новое значение расходов за среду: " + expenses[2] + " рублей.");

        // Суммируйте три самые крупные траты
        double summ = expenses[1] + expenses[4] + expenses[5];
        System.out.println("Самые большие расходы были во вторник, пятницу и субботу.");
        System.out.println("Всего вы потратили в эти дни: " + summ + " рублей.");
    }
}

------------------------------------------------------------------------------

class Praktikum {
    public static void main(String[] args) {
        // На месте многоточия объявите массив plans
        String[] plans = {"Поехать в Китай по работе",
                "Отметить день рождения с друзьями",
                "Обустроить рабочее место",
                "Научиться вести бюджет",
                "Купить диван",
                "Поехать на музыкальный фестиваль",
                "Попросить на работе один удалённый день в неделю",
                "Заняться спортом",
                "Поехать в Японию в отпуск",
                "Начать внедрять zero waste-подходы в повседневную жизнь",
                "Встречаться с друзьями не реже раза в неделю",
                "Перестать есть в кровати"
        };

        // Поменяйте местами покупку дивана и поездку в Китай в три шага, используя swap
        String swap = plans[0]; // Присвойте swap значение элемента, который вы заменяете
        plans[0] = plans[4]; // Присвойте значение одного элемента другому
        plans[4] = swap; // В swap должно оказаться значение элемента, выбранного на замену

        // Замените фразу "Поехать в Японию в отпуск" на "Поехать в Сочи в отпуск"
        plans[8] = "Поехать в Сочи в отпуск";


        System.out.println("Изменения в планах:");
        System.out.println("1. " + plans[0]);
        System.out.println("5. " + plans[4]);
        System.out.println("9. " + plans[8]);

    }
}

------------------------------------------------------------------------------

import java.util.Scanner;

class Praktikum {
    public static void main(String[] args) {
        String[] currencies = {"USD","EUR","JPY","RUB"};

        System.out.println("В вашем тревел-кошельке доступны следующие валюты:");
        System.out.println(currencies[0]);
        System.out.println(currencies[1]);
        System.out.println(currencies[2]);
        System.out.println(currencies[3]);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Если вы планируете поездку в Данию, введите 1, а если в Китай, введите 2");

        int country = scanner.nextInt();  // Считайте из консоли ввод пользователя
 
        // Если выбрана Дания, измените значение элемента евро на кроны DKK
        if (country == 1) {
            currencies[1] = "DKK";
            } else if (country == 2) {
            currencies[2] = "CNY";
        }
        // Если Китай, измените значение элемента иена на юани CNY
        

        System.out.println("В вашем тревел-кошельке доступны следующие валюты:");
        System.out.println(currencies[0]);
        System.out.println(currencies[1]);
        System.out.println(currencies[2]);
        System.out.println(currencies[3]);
    }
}

------------------------------------------------------------------------------

import java.util.Scanner;

class Praktikum {
    public static void main(String[] args) {
        String[] currencies = {"USD", "EUR", "JPY", "RUB"};
        System.out.println("Валюты в вашем портфеле:");
        System.out.println(currencies[0] + " - индекс 0"); // Печатаем валюты и их индексы
        System.out.println(currencies[1] + " - индекс 1");
        System.out.println(currencies[2] + " - индекс 2");
        System.out.println(currencies[3] + " - индекс 3");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите индекс валюты, которую хотите поменять:");
        int index = scanner.nextInt(); // Даём возможность ввести индекс выбранной валюты

        System.out.println("Выберите новую валюту:");
        String currency = scanner.next(); // Даём возможность ввести новое значение валюты

        String previousCurrency = currencies[index]; // Сохраняем старое значение
        currencies[index] = currency; // Присваиваем выбранному элементу новое значение

        System.out.println("Мы заменили " + previousCurrency + " на: " + currencies[index]);

        System.out.println("Теперь в вашем портфеле такие валюты:");
        System.out.println(currencies[0]);
        System.out.println(currencies[1]);
        System.out.println(currencies[2]);
        System.out.println(currencies[3]);
    }
}

------------------------------------------------------------------------------

import java.util.Scanner;

class Praktikum {
    public static void main(String[] args) {
        double[] expenses = {100.50, 500.00, 10.00, 0.0, 40.60, 500.10, 200.00};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Расходы за неделю хранятся под индексами от 0 (пн) до 6 (вс).");
        System.out.println("Введите индекс дня, траты за который вы хотите отредактировать:");

        // Объявите переменную, которая будет хранить индекс выбранного элемента
        int index = scanner.nextInt();

        System.out.println("Введите новую сумму трат за этот день:");
        // Объявите переменную, в которой будет сохранено новое значение трат за выбранный день
        double newExpense = scanner.nextDouble();

        // Замените значение элемента с нужным индексом на новое
        
        System.out.println("За день с индексом " + index + " размер трат теперь " + newExpense );
    }
}

------------------------------------------------------------------------------

import java.util.Scanner;

class Praktikum {
    public static void main(String[] args) {
        String[] dishes = {"Ризотто", "Тартар", "Шурпа", "Панна-котта", "Сашими"}; // Массив
        System.out.println("Вы продегустировали пять блюд.");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите индекс блюда, которое хотите переместить:");
        System.out.println("0-Ризотто");
        System.out.println("1-Тартар");
        System.out.println("2-Шурпа");
        System.out.println("3-Панна-котта");
        System.out.println("4-Сашими");

        // Считайте из консоли индекс блюда, которое нужно переместить
        int firstIndex = scanner.nextInt();

        System.out.println("Введите позицию, на которую хотите его переместить, от 0 до 4:");
        // Объявите переменную secondIndex для нового положения (индекса) блюда, считайте его из консоли
        int secondIndex = scanner.nextInt();
        String swap = dishes[secondIndex];
        
        // Сохраните значение блюда под индексом firstIndex в переменную swap
        swap = dishes[firstIndex];
        
        // Присвойте блюду с индексом firstIndex значение блюда под индексом secondIndex
       dishes[firstIndex] = dishes[secondIndex];

        // Присвойте блюду с индексом secondIndex значение переменной swap
        dishes[secondIndex] = swap;

        System.out.println("Ваш рейтинг блюд:");
        System.out.println(dishes[0]);
        System.out.println(dishes[1]);
        System.out.println(dishes[2]);
        System.out.println(dishes[3]);
        System.out.println(dishes[4]);

    }
}

------------------------------------------------------------------------------

class Praktikum {
    public static void main(String[] args) {
        // Создайте и заполните массив именами участников сделки
        String[] participants = {"Пётр", "Надежда", "Валентина"};
        // Создайте и заполните массив документов участников сделки (с заглавной буквы)
        String[] documents = {"Паспорт", "Водительское удостоверение", "Свидетельство о рождении"};

        // Проверьте количество документов, оно должно быть равно числу участников
        if (participants.length == documents.length) {
            System.out.println("Документы загружены верно. Список документов:");
            for (int i = 0; i < participants.length; i ++) {
            // Если условие верно, напечатайте список документов в формате: "Пётр: Паспорт"
            System.out.println(participants[i] + ": " + documents[i]); } 
        } else { 
            System.out.println("Количество документов не сооветствует количеству участников сделки.");/* Для ошибки предусмотрите печать такого сообщения:
                         "Количество документов не соответствует количеству участников сделки." */
            
        }
    }
}

class Praktikum {
    public static void main(String[] args) {
        
        String[] participants = {"Пётр", "Надежда", "Валентина"};
        
        String[] documents = {"Паспорт", "Водительское удостоверение", "Свидетельство о рождении"};

        if (participants.length == documents.length) {
            System.out.println("Документы загружены верно. Список документов:");
          
            System.out.println(participants[0] + ": " + documents[0]);
            System.out.println(participants[1] + ": " + documents[1]);
            System.out.println(participants[2] + ": " + documents[2]);
        } else {
            System.out.println("Количество документов не соответствует количеству участников сделки.");
            
        }
    }
}

------------------------------------------------------------------------------


import java.util.Random;

class Praktikum {
    public static void main(String[] args) {
        // Объявите пустой массив трат за неделю (7 дней)
        int[] expenses = new int[7];

        Random random = new Random(); // Генерирует случайное число

        // Допишите условие цикла for, чтобы заполнить массив случайными тратами
        for (int i = 0; i < expenses.length; i ++) {
            expenses[i] = random.nextInt(1000);
        }

        System.out.println("Траты за неделю:");
        // Выведите с помощью цикла все траты за неделю в виде: "День ... . Потрачено рублей: ..."
        for (int j = 0; j < expenses.length; j++) {
            System.out.println("День " + (j + 1) + ". " + "Потрачено рублей: " + expenses[j]);
        }

        int sum = 0;
        // Посчитайте и выведите сумму трат за неделю — используйте цикл и здесь
        for (int s = 0; s < expenses.length; s++) {
            sum += expenses[s];
        }
        System.out.println("Траты в рублях за неделю: " + sum);
    }
}

------------------------------------------------------------------------------

class Praktikum {
    public static void main(String[] args) {

        double[] expenses = new double[7]; // Объявили массив трат за неделю (7 дней)

        int expense = 50; // В первый день потрачено 50 рублей

        // Заполнили массив, используя цикл for
        for (int i = 0; i < expenses.length; i++) {
            expenses[i] = expense;
            expense = expense + 100;
        }
        System.out.println("Ошибок нет. Все расходы успешно занесены в приложение!");
    }
}

------------------------------------------------------------------------------

import java.util.Scanner;

class Praktikum {
    public static void main(String[] args) {
        // Объявили массив трат за неделю (7 дней)
        double[] expenses = new double[7];

        double expense = 50; // В первый день потрачено 50 рублей

        // Заполнили массив, используя цикл for
        for (int i = 0; i < expenses.length; i++) {
            expenses[i] = expense;
            expense = expense + 100;
        }
        System.out.println("Расходы за неделю успешно занесены в приложение!");
        Scanner scanner = new Scanner(System.in);
        while (true) { // Добавили бесконечный цикл — теперь не страшно ошибаться много раз
            System.out.println("Расходы за какой день вы хотите проверить. Выберите значение от 0 (пн) до 6 (вс).");

            // Считайте ввод пользователя из консоли и сохраните в переменной index
            int s = scanner.nextInt();


            // Проверьте, не допущена ли ошибка
            if (s < 0) {
                System.out.println("Выбрано неверное значение! Минимальное значение - 0");   
            } // Если значение меньше нуля, 
            // напечатайте "Выбрано неверное значение! Минимальное значение - 0"
            else if (s > 6) {
                System.out.println("Выбрано неверное значение! Максимальное значение - " + "6");   
            } else {
            // Если выбрано значение больше длины массива или равное ей, 
            // напечатайте "Выбрано неверное значение! Максимальное значение - " + ...

            // Если пользователь ввёл корректный индекс, 
            // то программа должна вывести значение нужного элемента и завершить работу (прервать цикл)
            System.out.println("Потрачено " + expenses[s]+" рублей");
            break;
            }
        }
    }
}

------------------------------------------------------------------------------

import java.util.Scanner;

class Praktikum {
    public static void main(String[] args) {
        // Ниже объявите пустой массив expenses для записи трат за неделю 
        double[] expenses = new double[7];

        double rateUSD = 78.5;
        double rateEUR = 85;
        double rateJPY = 0.74;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Сколько денег у вас осталось до зарплаты?");
        double moneyBeforeSalary = scanner.nextDouble();

        System.out.println("Сколько дней до зарплаты?");
        int daysBeforeSalary = scanner.nextInt();
        
        while (true) {
            System.out.println("Что вы хотите сделать?");
            System.out.println("1 — Конвертировать валюту");
            System.out.println("2 — Получить совет");
            System.out.println("3 - Ввести трату"); // Допишите вывод нового пункта меню
            System.out.println("0 — Выход");
            
            int command = scanner.nextInt();

            if (command == 1) {
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
            } else if (command == 2) {
                if (moneyBeforeSalary < 3000) {
                    System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
                } else if (moneyBeforeSalary < 10000) {
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
            } else if (command == 3) {
                System.out.println("За какой день вы хотите ввести трату: 1-ПН, 2-ВТ, 3-СР, 4-ЧТ, 5-ПТ, 6-СБ, 7-ВС?");// Ещё одно ветвление для обработки новой команды, допишите его условие
                // Допишите код для печати сообщения для пользователя
                // Текст сообщения: "За какой день вы хотите ввести трату: 1-ПН, 2-ВТ, 3-СР, 4-ЧТ, 5-ПТ, 6-СБ, 7-ВС?"
                
                // Получите из консоли день, за который пользователь хочет указать расходы
                int day = scanner.nextInt();
                System.out.println("Введите размер траты:");
                // Получите из консоли значение расходов и сохраните в переменной expense
                        double exp = scanner.nextDouble();
                // Сохраните полученное значение дневных трат в массив expenses
                // Не забудьте прибавить новое значение к уже существующим тратам
                    expenses[day - 1] += exp;
                System.out.println("Значение сохранено!");

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

import java.util.Scanner;

class Praktikum {
    public static void main(String[] args) {
        double[] expenses = new double[7];

        double rateUSD = 78.5;
        double rateEUR = 85;
        double rateJPY = 0.74;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Сколько денег у вас осталось до зарплаты?");
        double moneyBeforeSalary = scanner.nextDouble();

        System.out.println("Сколько дней до зарплаты?");
        int daysBeforeSalary = scanner.nextInt();

        while (true) {
            System.out.println("Что вы хотите сделать?");
            System.out.println("1 — Конвертировать валюту");
            System.out.println("2 — Получить совет");
            System.out.println("3 — Ввести трату");
            System.out.println("0 — Выход");

            int command = scanner.nextInt();

            if (command == 1) {
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
            } else if (command == 2) {
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
            } else if (command == 3) {
                System.out.println("За какой день вы хотите ввести трату: 1-ПН, 2-ВТ, 3-СР, 4-ЧТ, 5-ПТ, 6-СБ, 7-ВС?");
                int day = scanner.nextInt();
                System.out.println("Введите размер траты:");
                double expense = scanner.nextDouble();

                            moneyBeforeSalary -= expense;// Уменьшите баланс на сумму введённой траты
                expenses[day - 1] += expense;// Сохраните трату в массив
               
                                System.out.println("Значение сохранено! Ваш текущий баланс в рублях: " + moneyBeforeSalary);

                                if (moneyBeforeSalary < 1000) {
                                    System.out.println("На вашем счету осталось совсем немного. Стоит начать экономить!");// Проверьте текущее значение баланса — не опустилось ли оно ниже отметки в 1000 рублей
                                }// Выведите предупреждение: "На вашем счету осталось совсем немного. Стоит начать экономить!"
                
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

import java.util.Scanner;

class Praktikum {
    public static void main(String[] args) {
        double[] expenses = new double[7];

        double rateUSD = 78.5;
        double rateEUR = 85;
        double rateJPY = 0.74;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Сколько денег у вас осталось до зарплаты?");
        double moneyBeforeSalary = scanner.nextDouble();

        System.out.println("Сколько дней до зарплаты?");
        int daysBeforeSalary = scanner.nextInt();

        while (true) {
            System.out.println("Что вы хотите сделать?");
            System.out.println("1 - Конвертировать валюту");
            System.out.println("2 - Получить совет");
            System.out.println("3 - Ввести трату");
            System.out.println("4 - Показать траты за неделю");// Допишите новый пункт цифрового меню
            
            System.out.println("0 - Выход");

            int command = scanner.nextInt();

            if (command == 1) {
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
            } else if (command == 2) {
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
            
            } else if (command == 4) { // Добавьте ветвление для обработки новой команды
              for (int i = 0; i < expenses.length; i++) { // Используйте цикл for, чтобы получить все траты — элементы массива expenses
               // Напечатайте в цикле строку: "День _. Потрачено _ рублей.".
                  System.out.println("День " + (i + 1) + ". Потрачено " + expenses[i] + " рублей.");
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

import java.util.Scanner;

class Praktikum {
    public static void main(String[] args) {
        double[] expenses = new double[7];

        double rateUSD = 78.5;
        double rateEUR = 85;
        double rateJPY = 0.74;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Сколько денег у вас осталось до зарплаты?");
        double moneyBeforeSalary = scanner.nextDouble();

        System.out.println("Сколько дней до зарплаты?");
        int daysBeforeSalary = scanner.nextInt();

        while (true) {
            System.out.println("Что вы хотите сделать?");
            System.out.println("1 - Конвертировать валюту");
            System.out.println("2 - Получить совет");
            System.out.println("3 - Ввести трату");
            System.out.println("4 - Показать траты за неделю");
            System.out.println("5 - Показать самую большую сумму расходов за неделю");// Допишите вывод нового пункта меню
            
            System.out.println("0 - Выход");

            int command = scanner.nextInt();

            if (command == 1) {
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
            } else if (command == 2) {
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
            } else if (command == 5) { // Добавьте условие в ветвление для обработки новой команды
                /* Объявляем переменную maxExpense для хранения самой большой суммы расходов. 
                   Сначала её значение неизвестно, поэтому равно нулю */
                double maxExpense = 0;
                for (int i = 0; i < expenses.length; i++) { // Проходим циклом по всему массиву трат
                    if (expenses[i] > maxExpense) { // Сравниваем, больше ли текущий элемент массива значения maxExpense
                        // Если условие верно, то записываем в maxExpense значение текущего элемента массива
                        maxExpense = expenses[i];
                    }
                }
                // Печатаем максимум расходов:
                System.out.println("Самая большая сумма расходов на этой неделе составила " + maxExpense + " руб.");

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