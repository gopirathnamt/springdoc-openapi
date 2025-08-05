package test.org.springdoc.api.v31.app205;

/**
 *
 */

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.test.context.TestPropertySource;
import test.org.springdoc.api.v31.AbstractSpringDocTest;

/**
 * Fix regression in #2031
 */
@TestPropertySource(properties = {"springdoc.group-configs[0].group=mygroup", "springdoc.group-configs[0].paths-to-match=/test"})
public class SpringdocApp205Test extends AbstractSpringDocTest {

	@SpringBootApplication
	static class SpringDocTestApp {
	}

}