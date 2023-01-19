class PersonAccount {
    String name;      // Имя и фамилия
    Double moneyRUB;  // Счёт в рублях
    Double moneyUSD;  // Счёт в долларах
    Double moneyEUR;  // Счёт в евро
//    Person.Account(moneyRUB, moneyUSD, moneyUER)

    PersonAccount(String userName) {
         name = userName;
//         Double moneyRUB;
//         Double moneyUSD;
//         Double moneyEUR;
    }
}

// При проверке открытых счетов значения переменных необходимо сравнивать не с 0.0,
// а с null. Если значение счёта не равно null — user.moneyRUB != null, значит, он открыт.