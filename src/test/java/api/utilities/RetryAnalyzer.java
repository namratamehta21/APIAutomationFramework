package api.utilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer
{

	private int retryCount = 0;
    private static final int MAX_RETRY_COUNT = 3;
    
	@Override
	public boolean retry(ITestResult result) 
	{
		if (retryCount < MAX_RETRY_COUNT) 
		{
            retryCount++;
            System.out.println("Retrying test: " + result.getName() + " Retry count: " + retryCount);
            return true; // Retry the test
        }
        return false;
	}

}
