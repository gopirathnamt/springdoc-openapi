package test.org.springdoc.api.v31.app208;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.test.context.TestPropertySource;
import test.org.springdoc.api.v31.AbstractSpringDocTest;

@TestPropertySource(properties = {"springdoc.default-flat-param-object=true"})
public class SpringdocApp208Test extends AbstractSpringDocTest {

	@SpringBootApplication
	static class SpringDocTestApp {
	}

}
