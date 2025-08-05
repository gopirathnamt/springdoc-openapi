package test.org.springdoc.api.v30.app208;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.test.context.TestPropertySource;
import test.org.springdoc.api.v30.AbstractSpringDocV30Test;

@TestPropertySource(properties = {"springdoc.default-flat-param-object=true"})
public class SpringdocApp208Test extends AbstractSpringDocV30Test {

	@SpringBootApplication
	static class SpringDocTestApp {
	}

}
