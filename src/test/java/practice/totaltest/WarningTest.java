package practice.totaltest;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class WarningTest {

	@Test
	void name() {
		Assertions.assertThat(1).isEqualTo(2);
	}
}
