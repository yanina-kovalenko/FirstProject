package lesson9;

import lesson9.utils.Checker;

public class Demo {
    public static void main(String[] args) {
        Company company = new Company("Yana", "Ukraine");
        System.out.println(company.getCountryFounded());
        System.out.println(company.getName());

//        company. = "New Value";

//        company.name = "IBM";

        Checker checker = new Checker();
        checker.checkCompanyName(company.getName());
        System.out.println(checker.checkCompanyName(company.getName()));
//        System.out.println(checker.companyNamesValidatedCount);
    }
}
