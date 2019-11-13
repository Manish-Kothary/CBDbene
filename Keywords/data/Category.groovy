package data

import helper.Utils

public class Category extends Utils{

	private static final int MAX_CATEGORY_NUMBER = 6

	public static String getRandomCategoryNumber(){
		return getRandomNumber(MAX_CATEGORY_NUMBER)
	}
}
