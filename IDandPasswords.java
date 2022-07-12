import java.util.HashMap;

/**
 * Created by calebotunuga on 2022-07-11.
 */
public class IDandPasswords {
    HashMap<String,String> logininfo = new HashMap<String, String>();
    IDandPasswords(){
        logininfo.put("bro","pizza");
        logininfo.put("caleb","peanuts");
        logininfo.put("funke","eric");
    }

    protected HashMap getLoginInfo(){
return logininfo;
    }
}
