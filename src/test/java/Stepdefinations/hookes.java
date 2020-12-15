package Stepdefinations;

import org.junit.After;
import org.junit.Before;

public class hookes {


    DriverClass DC = new DriverClass();

    @Before

    public void Open() {
        DC.OpenBrowser();

    }

    @After

    public void close() {

        DC.CloseBrowser();


    }

}
