/**
 * Created by calebotunuga on 2022-07-11.
 */
public class Main {
    public static void main(String [] args){
    IDandPasswords idandpass = new IDandPasswords();

    LoginPage loginpage = new LoginPage(idandpass.getLoginInfo());
    }
}