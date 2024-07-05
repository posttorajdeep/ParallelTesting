package DataProvider;

import Page.BaseTest;
import org.testng.annotations.DataProvider;

public class DataSet extends BaseTest {

    @DataProvider(parallel = true )
    public Object[] dataCount() {
        return new Object[] {1,2,3,4,5};
    }
}
