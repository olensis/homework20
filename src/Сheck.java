import WrongLoginException.WrongLoginException;
public class Сheck {

    private String login;
    private String password;
    private String confirmPassword;

    @Override
    public String toString() {
        return "Сheck{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", confirmPassword='" + confirmPassword + '\'' +
                '}';
    }

    public Сheck(String login, String password, String confirmPassword) throws WrongPasswordException {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
        if (isFormat(login)) {
            System.out.println("Логин верный");
        } else {
            throw new WrongLoginException("Не верный логин");
        }
        if (isFormat(password)) {
            System.out.println("Пароль верный");
        } else {
            throw new WrongPasswordException("Пароль не верный");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Не совпадают пароли");
        }
        System.out.println("Создать профиль");
    }
    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    private static boolean isFormat (String srt){
        return srt.matches("\"^(?=.*[0-9])(?=.*[ a-z])(?=.*[_](?=\\\\\\\\S +$).{1,20}$)\"");
    }
    public void checkInfo(){
        System.out.println(login + password + confirmPassword);
    }


}


