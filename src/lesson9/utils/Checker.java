package lesson9.utils;

public class Checker {
    //модификаторы доступа (или области видимости)
    //public - метод, конструктор или поле будет доступно с любой точки проекта
    //private - метод, конструктор или поле будет доступно только внутри класса
    //default (package-private или когда не указана область видимости) - елемент доступен только внутри текущего пакета
    //protected - елемент доступен внутри текущего класса, внутри пакета, где находиться класс и во всех наследниках этого класса
    //(по сути то же самое что дефолт + еще доступен и во всех наследниках этого класса)

    // модификаторы доступа в порядке по возростанию
    //private
    //default (package-private)
    //protected
    //public

    int companyNamesValidatedCount = 0;

    public boolean checkCompanyName(String companyName) {
//        if(companyName == "Google" || companyName == "Amazon")
//            return false;
//        return true;
        if(companyNamesValidatedCount > 10)
            return false;

        companyNamesValidatedCount++;
        return companyName != "Google" && companyName != "Amazon";
    }
}
