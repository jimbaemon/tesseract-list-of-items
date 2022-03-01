package core;

import java.io.File;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OCRReader {

	public static void main(String[] args) {
		File imageFile = new File("C:/git/tesseract-list-of-items/src/main/resources/str-extreme-belt-recipt-price.png");
		Tesseract instance = new Tesseract();  // JNA Interface Mapping
		instance.setVariable("tessedit_char_whitelist", "0123456789");

		try {
			String result = instance.doOCR(imageFile);
			System.out.println(result);
		} catch (TesseractException e) {
			System.err.println(e.getMessage());
		}
	}
}
