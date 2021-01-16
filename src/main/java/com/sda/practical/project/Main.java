package com.sda.practical.project;

/*

O. Creem conexiunea la baza de date
I. definim entityyuri (in pachetul model: user, account, transactions)
II. definiim operatii pe baza de date (in pachetul dao)
III. definim operatii pe aplicatie

1. citeste la infinit de la tastatura  comenzi
2. pentru fiecare comanda nstrodusa, citim restul parametrilor (daca exista)
3. apelam metoda corespunzatoare din service
    service apeleaza metode din dao conformlogicii de business
    dao foloseste entity-uri pentru a face operatii pe baze de date


//LOGING MIhai 1234 - > service.login("Mihai, 1234);
//ACCOUNTS -> ia userul curent logat
-> apeleaza dao (getAllAccountsFor USerName) cu usernameul introdus
->rezultatele sunt afisate pe ecran
 */


import org.hibernate.SessionFactory;

public class Main {
    public static void main(String[] args) {
        DBConfig dbConfig= new DBConfig();
        SessionFactory sessionFactory = dbConfig.getSessionFactory();
    }
    }


