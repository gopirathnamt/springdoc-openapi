/*
 *
 *  *
 *  *  *
 *  *  *  *
 *  *  *  *  *
 *  *  *  *  *  * Copyright 2019-2025 the original author or authors.
 *  *  *  *  *  *
 *  *  *  *  *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  *  *  *  *  * you may not use this file except in compliance with the License.
 *  *  *  *  *  * You may obtain a copy of the License at
 *  *  *  *  *  *
 *  *  *  *  *  *      https://www.apache.org/licenses/LICENSE-2.0
 *  *  *  *  *  *
 *  *  *  *  *  * Unless required by applicable law or agreed to in writing, software
 *  *  *  *  *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  *  *  *  *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *  *  *  *  * See the License for the specific language governing permissions and
 *  *  *  *  *  * limitations under the License.
 *  *  *  *  *
 *  *  *  *
 *  *  *
 *  *
 *
 */

package test.org.springdoc.api.v30.app162;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.TestPropertySource;
import test.org.springdoc.api.v30.AbstractSpringDocTest;

/**
 * The type Spring doc app 162 test.
 */
@TestPropertySource(properties = "springdoc.override-with-generic-response=true")
class SpringDocApp162Test extends AbstractSpringDocTest {

	/**
	 * The type Spring doc test app.
	 */
	@SpringBootApplication
	static class SpringDocTestApp {
		/**
		 * Custom open api open api.
		 *
		 * @return the open api
		 */
		@Bean
		public OpenAPI customOpenAPI() {
			return new OpenAPI()
					.info(new Info()
							      .title("SpringShop API")
							      .version("v1")
							      .description("The description of the api"));
		}

	}

}
