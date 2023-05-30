package generalUtils;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ILisnerstest implements ITestListener{

	public void onTestFailure(ITestResult result) {
		try {
			WebUtils theWebdriverUtility = new WebUtils();
			String screenshotName=result.getMethod().getMethodName()+Javautill.currentSystem();
			theWebdriverUtility.getScreenShot(BaseClass.staticdriver, screenshotName);
		} catch (Throwable e) {
			e.printStackTrace();
		}

	}
}
