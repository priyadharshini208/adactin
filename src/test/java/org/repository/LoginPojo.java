package org.repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilityClass.BaseClass;

public class LoginPojo extends BaseClass{
	public LoginPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement txtEmail;
	
	@FindBy(id="password")
	private WebElement txtPass;
	
	@FindBy(name="login")
	private WebElement btnlogin;
	
	public WebElement getRtype() {
		return rtype;
	}
	@FindBy(id="location")
	private WebElement loct;
	
	@FindBy(id="hotels")
	private WebElement hott;
	
	@FindBy(id="room_nos")
	private WebElement rno;
	
	@FindBy(id="room_type")
	private WebElement rtype;
	
	public WebElement getLoct() {
		return loct;
	}

	public WebElement getHott() {
		return hott;
	}

	public WebElement getRno() {
		return rno;
	}

	public WebElement getAdrom() {
		return adrom;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSearch() {
		return search;
	}
	@FindBy(id="adult_room")
	private WebElement adrom;
	
	@FindBy(id="child_room")
	private WebElement child;
	
	@FindBy(id="Submit")
	private WebElement search;
	
	@FindBy(id="radiobutton_0")
	private WebElement radio;
	
	@FindBy(id="continue")
	private WebElement contn;
	
	@FindBy(id="first_name")
	private WebElement first;
	
	@FindBy(id="last_name")
	private WebElement last;
	
	@FindBy(id="address")
	private WebElement addres;
	
	@FindBy(id="cc_num")
	private WebElement cardno;
	
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	
	@FindBy(id="cc_type")
	private WebElement cardtype;
	
	@FindBy(id="cc_exp_month")
	private WebElement mnth;
	
	@FindBy(id="cc_exp_year")
	private WebElement year;
	
	
	public WebElement getLogged() {
		return logged;
	}
	@FindBy(name="logout")
	private WebElement logged;
	
	
	@FindBy(id="order_no")
	private WebElement orderno;
	
	

	public WebElement getOrderno() {
		return orderno;
	}

	public WebElement getFirst() {
		return first;
	}

	public WebElement getLast() {
		return last;
	}

	public WebElement getAddres() {
		return addres;
	}

	public WebElement getCardno() {
		return cardno;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getMnth() {
		return mnth;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getBooking() {
		return booking;
	}
	@FindBy(id="book_now")
	private WebElement booking;
	
	@FindBy(id="order_no")
	private WebElement order;

	public WebElement getOrder() {
		return order;
	}

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getContn() {
		return contn;
	}

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}
}
