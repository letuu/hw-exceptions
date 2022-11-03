package pro.sky.java.ds_3_0.task1;

public class Data {

    private static final String VALID_CHAR = "abcdefghijklmnopqrstuvwxyz_ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    private Data() {

    }

    public static boolean validation(String login, String password, String confirmPassword) {
        try {
            checkData(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    private static void checkData(String login,
                                  String password,
                                  String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (!validString(login)) {
            throw new WrongLoginException("Логин некорректный");
        }
        if (!validString(password)) {
            throw new WrongPasswordException("Пароль некорректный");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают");
        }
    }

    private static boolean validString(String data) {
        if (data.length() < 1 || data.length() > 20) {
            return false;
        }
        for (int i = 0; i < data.length(); i++) {
            if (!VALID_CHAR.contains(String.valueOf(data.charAt(i)))) {
                return false;
            }
        }
        return true;
    }
}
