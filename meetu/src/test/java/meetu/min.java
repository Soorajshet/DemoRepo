package meetu;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver d = new ChromeDriver();
		d.get("https://meetyou.me/page/introduction");
		d.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/a/button")).click();
		
	}

}
