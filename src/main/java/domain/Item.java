package domain;

import lombok.Value;

@Value
public class Item {
	String id;
	int quantity;
	int price;

	private int getTotalPrice(){
		return price * quantity;
	}
}
