package utility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main implements IRetryAnalyzer {

    int count =0;
    int maxCount=0;
    @Override
    public boolean retry(ITestResult result) {
        if(count<maxCount){
            count++;
            return true;
        }

        return false;
    }
}