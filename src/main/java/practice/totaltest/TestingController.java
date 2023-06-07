package practice.totaltest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class TestingController {

	@GetMapping("/hellohello")
	public String good() {
		log.info("good");
		return "good";
	}
}
