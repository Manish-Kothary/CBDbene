package data

import helper.Utils

public class Topic extends Utils{

	private static final int TOPIC_QUANTITY = 5

	public static int getRandomTopic(){
		return getRandomIntNumber(TOPIC_QUANTITY)
	}
}
