package domain;

import lombok.Builder;

public class Price {
	int totalPrice;
	int price;

	@Builder
	public Price(final int totalPrice, final int price) {
		this.totalPrice = totalPrice;
		this.price = price;
	}

	private int getQuantity(){
		return totalPrice / price;
	}
}
