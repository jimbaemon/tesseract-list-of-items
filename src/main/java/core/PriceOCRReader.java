package core;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PriceOCRReader {

	private final File image;

	public PriceOCRReader(final File image) {
		this.image = image;
	}

	public List<Long> imageToPrices() throws TesseractException{
		Tesseract instance = new Tesseract();  // JNA Interface Mapping
		instance.setLanguage("kor");
		instance.setVariable("tessedit_char_whitelist", "0123456789");

		return getPricesFromString(instance.doOCR(image));
	}

	private List<Long> getPricesFromString(final String readImageString){
		return collectEvenItems(stringToPricesList(readImageString));
	}

	private List<Long> stringToPricesList(final String readImageString) {
		return Arrays.stream(readImageString.split("\n"))
			.map(price -> Long.valueOf(price))
			.collect(Collectors.toList());
	}

	private List<Long> collectEvenItems(final List<Long> pricesWithDummy){
		return IntStream.range(0, pricesWithDummy.size())
			.filter(index -> index%2==0)
			.mapToObj(pricesWithDummy::get)
			.collect(Collectors.toList());
	}
}
