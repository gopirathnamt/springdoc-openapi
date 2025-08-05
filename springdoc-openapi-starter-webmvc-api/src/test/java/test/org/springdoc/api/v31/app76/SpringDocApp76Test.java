/*
 *
 *  *
 *  *  *
 *  *  *  *
 *  *  *  *  * Copyright 2019-2024 the original author or authors.
 *  *  *  *  *
 *  *  *  *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  *  *  *  * you may not use this file except in compliance with the License.
 *  *  *  *  * You may obtain a copy of the License at
 *  *  *  *  *
 *  *  *  *  *      https://www.apache.org/licenses/LICENSE-2.0
 *  *  *  *  *
 *  *  *  *  * Unless required by applicable law or agreed to in writing, software
 *  *  *  *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  *  *  *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *  *  *  * See the License for the specific language governing permissions and
 *  *  *  *  * limitations under the License.
 *  *  *  *
 *  *  *
 *  *
 *
 */

package test.org.springdoc.api.v31.app76;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import test.org.springdoc.api.v31.AbstractSpringDocTest;

import java.util.Arrays;

public class SpringDocApp76Test extends AbstractSpringDocTest {

	@SpringBootApplication
	static class SpringDocTestApp {
		@Bean
		public OpenAPI openAPI() {
			return new OpenAPI()
					.components(new Components().addSecuritySchemes("bearer-jwt",
					                                                new SecurityScheme()
							                                                .type(SecurityScheme.Type.HTTP)
							                                                .scheme("bearer")
							                                                .bearerFormat("JWT"))
					           )
					.addSecurityItem(
							new SecurityRequirement().addList("bearer-jwt", Arrays.asList("read", "write")));
		}
	}
}
