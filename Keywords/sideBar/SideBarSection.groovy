package sideBar

import sideBar.Users.UsersOption
import sideBar.products.*

public class SideBarSection {
	
	private ProductsOption productOption = new ProductsOption()
	private UsersOption userOption = new UsersOption()
	
	public ProductsOption getProductOption(){
		return productOption
	}
	
	public UsersOption getUsersOption(){
		return userOption
	}
}
