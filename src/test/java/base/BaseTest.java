package base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.junit.After;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.yaml.snakeyaml.Yaml;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class BaseTest {

	protected AppiumDriver<MobileElement> driver;

	public static AppiumDriver<MobileElement> getDriver(String capsFile) {
		Map<String, Map<String, Object>> capsMap = new Yaml().load(
				BaseTest.class.getClassLoader().getResourceAsStream(capsFile)
		);
		DesiredCapabilities caps = new DesiredCapabilities();

		capsMap.get("caps").forEach((k, v) -> {
			if (k.equals("app"))
				try {
					URL url = BaseTest.class.getClassLoader().getResource((String) v);
					String fpath =
							Paths.get(Objects.requireNonNull(url).toURI()).toFile().getAbsolutePath();
					caps.setCapability(k, fpath);
				} catch (URISyntaxException e) {
					e.printStackTrace();
				}

			else
				caps.setCapability(k, v);
		});

		AppiumDriver<MobileElement> driver = null;
		try {
			URL remoteUrl = new URL("http://localhost:4723/wd/hub");
			driver = new AppiumDriver<>(remoteUrl, caps);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return driver;
	}

	@After
	public void tearDown() {
		driver.quit();
	}
}
