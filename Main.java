
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
public class OpenNewTaborWindow {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://WWW.Google.com");
		
		System.out.println("First Page : "+ driver.getTitle());
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("http://WWW.Facebook.com");
		System.out.println("Second Page : "+ driver.getTitle());
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> handles = new ArrayList<String>();
		handles.addAll(windowHandles);
		
		driver.switchTo().window(handles.get(0));
		System.out.println("First Page : "+ driver.getTitle());
		
		driver.close();
	}
}
