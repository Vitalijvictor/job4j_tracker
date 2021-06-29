package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
user1 = {passport: "1234", username: "Vasya"}
user2 = {passport: "5678", username: "Petya"}
account1 = {req: "ZXCV45", balance: 100}
account2 = {req: "ABCD987", balance: 400}
account3 = {req: "XXX", balance: 999}

map users = {
    {passport: "1234", username: "Vasya"} : ({req: "ZXCV45", balance: 100}, {req: "ABCD987", balance: 400}),
    {passport: "5678", username: "Petya"} : ({req: "XXX", balance: 999})
}

findByPassport
keySet = ({passport: "1234", username: "Vasya"}, {passport: "5678", username: "Petya"})
user = {passport: "5678", username: "Petya"}

accounts = users.get({passport: "5678", username: "Petya"})
   0
= ({req: "XXX", balance: 999})

new Account(requisite, 0.0)
{req: "XXX", balance: 0.0}
* */
public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
            users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void addAccount(String passport, Account account) {
        User userWithPassport = findByPassport(passport);
        if (userWithPassport != null) {
            List<Account> userAccounts = users.get(userWithPassport);
            if (!userAccounts.contains(account)) {
                userAccounts.add(account);
            }
        }
    }

    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        Account result = null;
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            for (Account found : accounts) {
                if (found.getRequisite().equals(requisite)) {
                    result = found;
                    break;
                }
            }
        }
        return result;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {

        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);

        if (srcAccount != null && destAccount != null && amount <= srcAccount.getBalance()) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            return true;
        }
            return false;
    }
}