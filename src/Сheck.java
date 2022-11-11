import WrongLoginException.WrongLoginException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Сheck {

    private String login;
    private String password;
    private String confirmPassword;

    public Сheck(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
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
//    public static Pattern compile (String login){
//        Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[ a-z])(?=.*[_](?=\\\\S +$).{1,20}$)" );
//        return Pattern.compile(login);
//        throw new WrongLoginException();

    public static Pattern  checkLogin(String login) {
        String regex = "^(?=.*[0-9])(?=.*[ a-z])(?=.*[_](?=\\\\S +$).{1,20}$)";
        Pattern p = Pattern.compile(regex);
        if (login == null) {
            throw new WrongLoginException();

        }
return Pattern.compile(login);
    }

        }


