package test.org.springdoc.api.v31.app198;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController("/")
public class HelloController {

	@GetMapping
	public Response test() {
		return new Response(BigDecimal.ONE, BigDecimal.ONE, BigDecimal.ONE);
	}
}