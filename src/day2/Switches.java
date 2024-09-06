package day2;

import java.time.temporal.ValueRange;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switches {
	// Ex5
	public void doEx5(int n) {
		switch (n) {
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Sunday");
			break;
		}
	}

	// Ex6
	public By getLocator(String locatorType, String locatorValue) {
		By result = null;

		switch (locatorType) {
		case "id": {
			result = By.id(locatorValue);
			break;
		}

		case "name": {
			result = By.name(locatorValue);
			break;
		}

		case "linkText": {
			result = By.linkText(locatorValue);
			break;
		}

		}
		System.out.println(result);
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Switches switchEx = new Switches();

		// Ex5
		boolean isCheck = false;
		int day;
		while (isCheck == false) {
			ValueRange range1 = ValueRange.of(2, 8);
			System.out.println("Please input a day in a week: ");
			day = sc.nextInt();
			if (range1.isValidIntValue(day)) {
				switchEx.doEx5(day);
				break;
			} else
				System.out.println("Please input again!");
		}

		// Ex6
		System.setProperty("webdriver.chrome.driver", "D:\\100AutomationProject\\01Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		switchEx.getLocator("id", "firstName");

	}
}
