class Praktikum {
    public static void main(String[] args) {
        double rateUSD = 78.5; // Курс доллара
        double rateEUR = 85.5; // Курс евро
        boolean isMoreOrEqual = rateUSD >= rateEUR;
        // Объявите переменную и сохраните в неё результат сравнения
        System.out.println(isMoreOrEqual);
    }
}

------------------------------------------------------------------------------

class Praktikum {
    public static void main(String[] args) {

        boolean condition = true;
        double rateUSD = 78.8;  // Перенесите объявление переменной сюда

        if (condition) {
            System.out.println("Внутри блока курс доллара виден. Он равен " + rateUSD);
        }
        // Здесь переменная rateUSD не видна
        System.out.println("Вне блока курс доллара не виден. Должен быть " + rateUSD);
    }
}

------------------------------------------------------------------------------

class Praktikum {
    public static void main(String[] args) {

        double rateUSD = 78.5;
        double rubles = 14356.5;

        if (rateUSD < 70) {
            System.out.println("Отличный курс доллара — рекомендую купить!");
        }
        
        System.out.println("Ваши сбережения в долларах: " + rubles / rateUSD);
    }
}

------------------------------------------------------------------------------

class Praktikum {
    public static void main(String[] args) {

        double rateUSD = 78.5;
        double rateEUR = 85.5;
        double rubles = 14560.5;

        String currency = "EUR";
        System.out.println("Вы конвертируете рубли в " + currency);
        if (currency.equals("USD")) {  // Если currency равно "USD", то конвертируем в доллары, иначе в евро
            System.out.println("Ваши сбережения в долларах: " + rubles / rateUSD);
        } else {
            System.out.println("Ваши сбережения в евро: " + rubles / rateEUR);
        }
    }
}

------------------------------------------------------------------------------

class Praktikum {
    public static void main(String[] args) {

        double moneyBeforeSalary = 15000.0; // Количество денег до зарплаты

        if (moneyBeforeSalary < 3000) {
            System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
        } else if (moneyBeforeSalary < 10000) {
            System.out.println("Окей, пора в Макдак!");
        } else if (moneyBeforeSalary < 30000) {
            System.out.println("Неплохо! Прикупите долларов и зайдите поужинать в классное место.");
        } else {
             System.out.println("Класс! Заказывайте крабов!");
        }
    }
}

------------------------------------------------------------------------------

class Praktikum {
    public static void main(String[] args) {

        double moneyBeforeSalary = 15000.0; // Количество денег до зарплаты
        int daysBeforeSalary = 14;

        if (moneyBeforeSalary < 3000) {
            System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
        } else if (moneyBeforeSalary < 10000) {
            // Здесь нужное условие уже добавили
            if (daysBeforeSalary < 10) {
                System.out.println("Окей, пора в Макдак!");
            } else {
                System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
            }
            
        } else if (moneyBeforeSalary < 30000) {
            if (daysBeforeSalary < 10) {  // Допишите условие
                System.out.println("Неплохо! Прикупите долларов и зайдите поужинать в классное место.");
            } else {
                System.out.println("Окей, пора в Макдак!");
            }

        } else {
            if (daysBeforeSalary < 10) { // Если до зарплаты меньше 10 дней, то едим крабов
            System.out.println("Класс! Заказывайте крабов!");
            } else { 
            // Иначе — доллары и ужин в хорошем ресторане
            System.out.println("Неплохо! Прикупите долларов и зайдите поужинать в классное место.");
            
            }
        }
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

        System.out.println("Введите команду. Доступные команды: convert и advice.");
        String command = scanner.next();

        if (command.equals("convert")) {
            
            System.out.println("В какую валюту хотите конвертировать рубли? Доступные варианты: USD, EUR, JPY.");
            String currency = scanner.next(); // Считайте это значение с помощью scanner
            if (currency.equals("USD")) {
                System.out.println("Ваши сбережения в долларах: " + moneyBeforeSalary / rateUSD);
            } else if (currency.equals("EUR")) {
                System.out.println("Ваши сбережения в евро: " + moneyBeforeSalary / rateEUR);
            } else if (currency.equals("JPY")) {
                System.out.println("Ваши сбережения в иенах: " + moneyBeforeSalary / rateJPY);
            } else {
                System.out.println("Валюта не поддерживается.");
            }

        } else if (command.equals("advice")) {
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
        } else {
            System.out.println("Извините, такой команды пока нет.");
        }
    }
}

------------------------------------------------------------------------------