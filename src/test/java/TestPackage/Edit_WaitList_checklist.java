package TestPackage;

import org.openqa.selenium.By;

import Base.Baseclass;

public class Edit_WaitList_checklist extends Baseclass {

	public void Edit_WaitList_checklist() {
		try {
            driver.findElement(By.xpath("//div[@id='orderDetails']/div[@class='content order-detail-container']/div/div[@class='pt-content-panel']/div[2]//table[@class='otherAppointmentDetails-table table table-striped']//tr[@class='ng-scope']/td[5]/div//i[@class='fa fa-ellipsis-v']")).click();
            Thread.sleep(3000);
            System.out.println("Click on elipses icon");
            driver.findElement(By.linkText("Edit")).click();
            Thread.sleep(3000);
            System.out.println("Click on edit button");
            String a = driver.findElement(By.xpath("//div[@id='editChecklistItemElement']/input[@placeholder='Enter new checklist item and click update button to save']")).getText();
            String b = a + "_updated";
            Thread.sleep(500);
            driver.findElement(By.xpath("//div[@id='editChecklistItemElement']/input[@placeholder='Enter new checklist item and click update button to save']")).sendKeys(b);
            Thread.sleep(3000);
            System.out.println("Cancel Update checklist item");
            driver.findElement(By.xpath("//td[@class='ng-scope']/form[@name='editChecklistItemForm']/button[1]//span[@class='pt-text']")).click();
            Thread.sleep(3000);
            System.out.println("Cancelled");
            
            
            
            driver.findElement(By.xpath("//div[@id='orderDetails']/div[@class='content order-detail-container']/div/div[@class='pt-content-panel']/div[2]//table[@class='otherAppointmentDetails-table table table-striped']//tr[@class='ng-scope']/td[5]/div//i[@class='fa fa-ellipsis-v']")).click();
            System.out.println("Click on elipses icon");
            driver.findElement(By.linkText("Edit")).click();
            Thread.sleep(3000);
            System.out.println("Click on edit button");
             a = driver.findElement(By.xpath("//div[@id='editChecklistItemElement']/input[@placeholder='Enter new checklist item and click update button to save']")).getText();
            a = a + "_updated";
            Thread.sleep(500);
            driver.findElement(By.xpath("//div[@id='editChecklistItemElement']/input[@placeholder='Enter new checklist item and click update button to save']")).sendKeys(a);
            Thread.sleep(3000);
            System.out.println("Update checklist item");
            driver.findElement(By.xpath("//td[@class='ng-scope']/form[@name='editChecklistItemForm']/button[2]")).click();
            Thread.sleep(3000);
            System.out.println("saved");
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}

}
