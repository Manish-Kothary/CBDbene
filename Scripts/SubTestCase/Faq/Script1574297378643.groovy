import allProducts.AllProductsPage
import editProduct.EditProductPage
import sideBar.SideBarSection

List <String> titles = questions

List <String> descriptions = answers

SideBarSection sideBar = new SideBarSection()

sideBar.getProductOption().selectAllProductsOption()
		
AllProductsPage allProducts = new AllProductsPage()

allProducts.searchName(productName)

allProducts.editFirstResult()

EditProductPage editProduct = new EditProductPage()

for (int i = 0 ; i < titles.size() ; i++){
	
	if (!editProduct.isTitleInputAvailable(i)){
		editProduct.addMore(i)
	}
	
	editProduct.setFaqTitle(titles.get(i).toString(), i)
	
	editProduct.setFaqDescription(descriptions.get(i).toString(), i)
	
}

editProduct.clickAddMoreButton()

editProduct.clickCloneButton()

editProduct.clickSubmitButton()

editProduct.validateSuccessfulUpdate()