package ru.job4j.ex;

public class UserStore {
    User user = new User();

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (int i = 0; i < users.length; i++) {
            if (users[i].equals(login)) {
                return users[i];
            }
        }
        throw new UserNotFoundException("There is found no user");
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.getUsername().length() < 3) {
            return false;
        }
        if (user.isValid())  {
            return true;
        }
        throw new UserInvalidException("the user is no valid");
    }

    public static void main(String[] args) throws UserNotFoundException, UserInvalidException {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }

        try {
            (validate(user));
        } catch (UserInvalidException i) {
            i.printStackTrace();
        }

    }
}