package testPackage;

import com.sun.jna.platform.win32.WinDef;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by hasan on 13/11/2015.
 */
public class checkUserName {

    @Test
    public void verifyUserName()
    {
        String UserName = getUserName();
        //if(UserName.length() > 0 && UserName.length() >=5 && UserName.matches("^[a-zA-Z]+$"))


            assertTrue(UserName.length() > 0);
            assertTrue(UserName.length() >=5);
            assertTrue(UserName.matches("^[a-zA-Z]+$"));



    }



    public String getUserName()
    {

        return "usman";
    }


}
