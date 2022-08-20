package xyz.yihuier.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yihuier
 */
@RestController
public class DemoController {

	@GetMapping("/hello")
	public String hello() {
		return "hello spring boot";
	}
}
