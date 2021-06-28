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
        if (!users.containsKey(user)) {
            users.put(user, new ArrayList<Account>());
        }
    }

    public void addAccount(String passport, Account account) {
        User userWithPassport = findByPassport(passport);
        if (userWithPassport == null) {
            return;
        }
        List<Account> userAccounts = users.get(userWithPassport);
        if (!userAccounts.contains(account)) {
            userAccounts.add(account);
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
        User userWithPassport = this.findByPassport(passport);
        if (userWithPassport == null) {
            return null;
        }
        List<Account> userAccounts = users.get(userWithPassport);
        if (userAccounts.isEmpty()) {
            return null;
        }
        Account target = new Account(requisite, 0.0);
        int accountIndex = userAccounts.indexOf(target);
        if (accountIndex == -1) {
            return null;
        }

        return userAccounts.get(accountIndex);
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {

        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);

        if ((srcAccount == null) || (destAccount == null)) {
            return false;
        }
        if (srcAccount.equals(destAccount)) {
            return false;
        }
        if (srcAccount.getBalance() < amount) {
            return false;
        }

        srcAccount.setBalance(srcAccount.getBalance() - amount);
        destAccount.setBalance(destAccount.getBalance() + amount);

        return true;
    }
}