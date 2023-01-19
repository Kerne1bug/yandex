class Praktikum {
    public static void main(String[] args) {
        
        double rubles = 3000.0;  // переменные
        double rateUSD = 78.5;
        double dollars = rubles / rateUSD;  // формула поделили 
        String shet = "У вас на счету ";  // текст! 
        String shet1 = "В долларах это ";
        String shet2 = "Так держать";
        System.out.println(shet + rubles + " " + "рублей. " + shet1 + dollars + " " + "долларов ." + shet2); // выводим + текст отдельно (складываем текст и переменные)
    }
}

------------------------------------------------------------------------------
double rubles = 15000.0;
double rateUSD = 78.5;
double dollars = rubles / rateUSD;
String summ = "С текущим курсом вы можете купить ";
String summA = " долларов";
System.out.println(summ + dollars + summA);// значение в долларах


double rubles = 31400.0;
double rateUSD = 78.5;
double dollars = rubles / rateUSD;

System.out.println(dollars); // значение переменной dollars
------------------------------------------------------------------------------


