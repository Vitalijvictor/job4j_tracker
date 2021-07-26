package ru.job4j.bank;

import java.util.*;
import java.util.stream.Stream;

/**
 * Класс работает с массивом данных от пользователей, а именно(requisite,
 * balance и passport.
 */
public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Данный метод ищет user по номеру паспорта и если находит
     * то добавляет account.
     * @param passport
     * @param account
     */
    public void addAccount(String passport, Account account) {
//        User userWithPassport = findByPassport(passport);
//        if (userWithPassport != null) {
//            List<Account> userAccounts = users.get(userWithPassport);
//            if (!userAccounts.contains(account)) {
//                userAccounts.add(account);
//            }
//        }
    }

    /**
     * Метод ищет user по паспорту.
     * @param passport
     * @return
     */
//    public User findByPassport(String passport) {
//        for (User user : users.keySet()) {
//            if (user.getPassport().equals(passport)) {
//                return user;
//            }
//        }
//        return null;
//    }

    public Optional<User> findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(s -> s.getPassport().equals(passport))
                .findFirst();
    }

    /**
     * Данный метод ищет пользователя по реквизиту.
     * @param passport
     * @param requisite
     * @return
     */
//    public Account findByRequisite(String passport, String requisite) {
//        Account result = null;
//        User user = findByPassport(passport);
//        if (user != null) {
//            List<Account> accounts = users.get(user);
//            for (Account found : accounts) {
//                if (found.getRequisite().equals(requisite)) {
//                    result = found;
//                    break;
//                }
//            }
//        }
//        return result;
//    }

    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            return users.get(user)
                    .stream()
                    .filter(s -> s.getRequisite().equals(requisite))
                    .findFirst();
        }
    }

    /**
     * Метод проверяет перечисления суммы и сравнивает количество средств
     * на балансе у одного и у другого user.
     * @param srcPassport
     * @param srcRequisite
     * @param destPassport
     * @param destRequisite
     * @param amount
     * @return
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {

        Optional<Account> srcAccount = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> destAccount = findByRequisite(destPassport, destRequisite);

        if (srcAccount.isPresent() && destAccount.isPresent() && amount <= srcAccount.get()) {
            srcAccount.get(srcAccount.get() - amount);
            destAccount.get(destAccount.get() + amount);
            return true;
        }
            return false;
    }

    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 2);
        Optional<Integer> rsl = stream.filter(e -> e == 2).findFirst();
        if (rsl.isPresent()) {
            System.out.println(rsl.get());
        } else {
            System.out.println("Element not found.");
        }
    }

}
