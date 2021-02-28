package com.tri909.testcal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
class TestCalController {
	@Autowired
	private TestCalApplication calculator;
	@RequestMapping("/sum")
	String sum(@RequestParam("a") Integer a,
		   @RequestParam("b") Integer b) {
		return String.valueOf(calculator.sum(a, b));
	}	
}
