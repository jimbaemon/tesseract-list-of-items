package core;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.net.URISyntaxException;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import net.sourceforge.tess4j.TesseractException;

class PriceOCRReaderTest {

	@Test
	@DisplayName("이미지 조회 후 가격 출력 테스트")
	void imageToPrices() throws URISyntaxException, TesseractException {
		//given
		File bloodyQueenTotPrice = new File(getClass().getClassLoader().getResource("bloody-queen-soul-price.png").toURI());

		//when
		List<Long> prices = new PriceOCRReader(bloodyQueenTotPrice).imageToPrices();

		//then
		assertThat(prices.get(0)).isEqualTo(50000000);
		//assertThat(prices.get(1)).isEqualTo(50888888);
		assertThat(prices.get(2)).isEqualTo(51111111);
		assertThat(prices.get(3)).isEqualTo(51111111);
		assertThat(prices.get(4)).isEqualTo(51111111);
		assertThat(prices.get(5)).isEqualTo(51111111);
		//assertThat(prices.get(6)).isEqualTo(51888888);
		//assertThat(prices.get(7)).isEqualTo(51899999);
		assertThat(prices.get(8)).isEqualTo(51899999);
	}
}