import Extensions.WebFlows;
import Utilities.CommonOps;
import org.testng.annotations.Test;

import java.io.IOException;

public class ExportResultsToCSV extends CommonOps {

    @Test
    public void test01() throws IOException {
        WebFlows.navigateToMacbook();
        WebFlows.writeResultsToCSV();
    }

}
