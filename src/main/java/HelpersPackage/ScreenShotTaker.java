package HelpersPackage;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by rakeshprabhakaran on 14/11/2015.
 */
public class ScreenShotTaker {

    private static final Log log = LogFactory.getLog(ScreenShotTaker.class);

    protected final String targetDirName;

    public ScreenShotTaker() {
        this(null);
    }

    public ScreenShotTaker(String targetDirName) {
        super();
        this.targetDirName = targetDirName;
    }

    public File takeScreenshot(WebDriver driver, String filename) {
        if (driver == null) {
            return null;
        }
        if (TakesScreenshot.class.isInstance(driver)) {
            try {
                Thread.sleep(250);
                String name = filename;
                return TakesScreenshot.class.cast(driver).getScreenshotAs(
                        new ScreenShotFileOutput(targetDirName, name));
            } catch (InterruptedException e) {
                log.error(e, e);
            }
        }
        return null;
    }

    public File dumpPageSource(WebDriver driver, String filename) {
        if (driver == null) {
            return null;
        }
        FileWriter writer = null;
        try {
            String location = System.getProperty("basedir") + File.separator
                    + "target";
            File outputFolder = new File(location);
            if (!outputFolder.exists() || !outputFolder.isDirectory()) {
                outputFolder = null;
            }
            if (outputFolder != null && !StringUtils.isBlank(targetDirName)) {
                outputFolder = new File(outputFolder, targetDirName);
                outputFolder.mkdir();
            }
            File tmpFile = File.createTempFile(filename, ".html", outputFolder);
            log.trace(String.format("Created page source file named '%s'",
                    tmpFile.getPath()));
            writer = new FileWriter(tmpFile);
            writer.write(driver.getPageSource());
            return tmpFile;
        } catch (IOException e) {
            throw new WebDriverException(e);
        } finally {
            IOUtils.closeQuietly(writer);
        }
    }

}
