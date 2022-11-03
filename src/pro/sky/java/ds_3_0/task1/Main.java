package pro.sky.java.ds_3_0.task1;

public class Main {
    public static void main(String[] args) {

        boolean check1 = Data.validation("login1", "123456", "12345");

        if (check1) {
            System.out.println("Логин и пароль корректные");
        } else {
            System.out.println("Логин и пароль некорректные");
        }

    }
}
