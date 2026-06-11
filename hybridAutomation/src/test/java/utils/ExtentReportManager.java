package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentReportManager implements ITestListener {

    public ExtentSparkReporter sparkReporter;
    public ExtentReports extent;
    public ExtentTest test;


    String repName;

    public void onStart(ITestContext testContext) {

        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        repName = "Test-Report-" + timeStamp + ".html";


        sparkReporter = new ExtentSparkReporter("reports/" + repName);

        sparkReporter.config().setDocumentTitle("Automation Report");
        sparkReporter.config().setReportName("UI API Hybrid Framework");
        sparkReporter.config().setTheme(Theme.DARK);

        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);
        extent.setSystemInfo("Application", "ParaBank Application");
        extent.setSystemInfo("Framework", "Selenium + RestAssured");
        extent.setSystemInfo("Environment", "QA");
        extent.setSystemInfo("Tester", "Prasadi");

    }

    public void onTestSuccess(ITestResult result) {
        test = extent.createTest(result.getTestClass().getName());
        test.assignCategory(result.getMethod().getGroups());
        test.createNode(result.getName());
        test.log(Status.PASS, " Test got successfully executed");
    }


    public void onTestFailure(ITestResult result) {
        test=extent.createTest(result.getClass().getName());
        test.createNode(result.getName());
        test.assignCategory(result.getMethod().getGroups());
        test.log(Status.FAIL, "Test got failed");
        test.log(Status.INFO, result.getThrowable().getMessage());
    }

    public void onTestSkipped(ITestResult result) {

        test=extent.createTest(result.getClass().getName());
        test.createNode(result.getName());
        test.assignCategory(result.getMethod().getGroups());
        test.log(Status.SKIP, "Test got skipped");
        test.log(Status.INFO, result.getThrowable().getMessage());
    }

    public void onFinish(ITestContext testContext) {
        extent.flush();
    }
}
