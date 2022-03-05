package domain;

import java.time.LocalDateTime;
import java.util.List;

public class Market {
	private String id;
	private Item item;
	private List<Price> salesPrices;
	private List<Price> soledPrices;
	private LocalDateTime searchDateTime;


}
