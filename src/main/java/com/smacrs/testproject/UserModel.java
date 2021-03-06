package com.smacrs.testproject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserModel {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int UserID;

	private String UserName;
	private String UserEmail;
	private String UserPass;
	private String UserAdress;
	private int UserAge;
	private int UserSalary;
	
	public String getUserPass() {
		return UserPass;
	}

	public void setUserPass(String userPass) {
		UserPass = userPass;
	}

	public String getUserEmail() {
		return UserEmail;
	}

	public void setUserEmail(String userEmail) {
		UserEmail = userEmail;
	}

	public String getUserAdress() {
		return UserAdress;
	}

	public void setUserAdress(String userAdress) {
		UserAdress = userAdress;
	}

	public int getUserAge() {
		return UserAge;
	}

	public void setUserAge(int userAge) {
		UserAge = userAge;
	}

	public int getUserID() {
		return UserID;
	}

	public void setUserID(int userID) {
		UserID = userID;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public int getUserSalary() {
		return UserSalary;
	}

	public void setUserSalary(int userSalary) {
		UserSalary = userSalary;
	}

	@Override
	public String toString() {
		return "UserModel [UserID=" + UserID + ", UserName=" + UserName + ", UserEmail=" + UserEmail + ", UserPass="
				+ UserPass + ", UserAdress=" + UserAdress + ", UserAge=" + UserAge + ", UserSalary=" + UserSalary + "]";
	}

}
