package practice.totaltest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class TestController {

	@GetMapping("/")
	public String home() {
		log.info("this is home");
		return "this is home";
	}

	@GetMapping("/suyeon")
	public String suyeon() {
		log.info("suyeon");
		return "suyeon";
	}

	@GetMapping("/hello")
	public String hello() {
		log.info("hello");
		return "hello";
	}
}
