package com.vTiger.crm.ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * User 1
 */


public class ProductsPage {
	WebDriver driver = null;

	public ProductsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * @author Kalyan
	 */
	
	@FindBy(xpath = "//input[@class='txtBox']")
	private WebElement searchBarEdit;

	public WebElement getSearchBarEdit() {
		return searchBarEdit;
	}
/**
 * @author pavan
 */
	
	@FindBy(xpath = "//input[@class='crmbutton small create']")
	private WebElement searchBtn;
	
	

	public WebElement getSearchBtn() {
		return searchBtn;
	}


	@FindBy(xpath = "//img[@alt='Create Product...']")
	private WebElement createProduct;

	public WebElement getCreateProduct() {
		return createProduct;
	}
}
