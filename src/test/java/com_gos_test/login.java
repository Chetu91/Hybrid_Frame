package com_gos_test;

import org.testng.annotations.Test;

import generalUtils.BaseClass;
import generalUtils.Intializecls;

public class login extends BaseClass{

	@Test
	public void Test1() throws Throwable {
		// TODO Auto-generated method stub
		
		Intializecls in=new Intializecls(driver,ETO,wutl);
		in.loginpage.AdminLogin();
		in.loginpage.AdminSignUp();
		in.loginpage.enteremail();
		in.loginpage.enterpassword();
		in.loginpage.ClkOnVisibleEyeIcon();
		in.loginpage.clkOnsubmits();
		in.goshomepage.ClkOnHome();
		in.goshomepage.ClkOnBsicSetting();
		in.goshomepage.ClkOnDesignation();
//		in.goshomepage.ClkOnAssignmenu();
//		in.goshomepage.ClkOnLocationSetting();
//		in.goshomepage.ClkOnDestination();
		in.gosdesignationpage.ClkOnCreateBtn();
		in.gosdesignationpage.SetDesignation("Admin123");
		in.gosdesignationpage.ClkCreateBttn();
		in.gosdesignationpage.ClkReset();
		in.gosdesignationpage.SetDesignation("Shankar");
		
		in.gosdesignationpage.ClkCreateBttn();
		in.gosdesignationpage.GetAlreadyExisttoaster();
		in.loginpage.ClkOnLogoutDrpdwn();
		in.loginpage.ClkOnLogoutButtn();

		
	}

}
