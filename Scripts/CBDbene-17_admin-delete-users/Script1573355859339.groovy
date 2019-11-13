import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import adminLogin.AdminLoginPage as AdminLoginPage
import data.Emails
import data.Index as Index
import main.Application as Application
import sideBar.SideBarSection as SideBarSection
import userManagement.UserManagementPage as UserManagementPage

Index.setRowValue(index)

Application.adminStart()

AdminLoginPage adminLogin = new AdminLoginPage()

adminLogin.encryptedLogin(adminEmail, password)

SideBarSection sideBar = new SideBarSection()

sideBar.getUsersOption().selectUserManagementOption()

Emails emails = new Emails()

UserManagementPage userManagement = new UserManagementPage()

for (int i= 1 ; i < emails.getQuantity() ; i++){
//for (int i= 1 ; i < 10; i++){
	String Email = emails.getName(i)
	
	userManagement.searchUser(Email)
	
	if(userManagement.checkResults()){
		userManagement.deleteUser()
		WebUI.delay(1)
	}
	else{
		continue
	}	
}


