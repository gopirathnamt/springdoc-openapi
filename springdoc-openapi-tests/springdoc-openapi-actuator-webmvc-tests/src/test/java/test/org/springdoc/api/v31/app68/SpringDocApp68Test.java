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

package test.org.springdoc.api.v31.app68;

import io.swagger.v3.core.converter.ModelConverter;
import io.swagger.v3.core.converter.ModelConverters;
import io.swagger.v3.oas.models.media.Schema;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.springdoc.core.converters.OAS31ModelConverter;
import org.springdoc.core.utils.Constants;
import org.springframework.test.context.TestPropertySource;
import test.org.springdoc.api.v31.AbstractSpringDocTest;

import java.util.Optional;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.springdoc.core.utils.Constants.SPRINGDOC_EXPLICIT_OBJECT_SCHEMA;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@TestPropertySource(properties = {SPRINGDOC_EXPLICIT_OBJECT_SCHEMA +
		"=true", "management.endpoints.enabled-by-default=true", "springdoc.show-actuator=true"})
public class SpringDocApp68Test extends AbstractSpringDocTest {

	@AfterAll
	public static void reset() {
		System.setProperty(Schema.EXPLICIT_OBJECT_SCHEMA_PROPERTY, "false");
		ModelConverters instance = ModelConverters.getInstance(true);
		Optional<ModelConverter> oas31ModelConverter =
				instance.getConverters()
				        .stream().filter(modelConverter -> modelConverter instanceof OAS31ModelConverter).findAny();
		oas31ModelConverter.ifPresent(instance::removeConverter);
	}

	@Test
	protected void testApp() throws Exception {
		mockMvc.perform(get(Constants.DEFAULT_API_DOCS_URL + "/stores"))
		       .andExpect(status().isOk())
		       .andExpect(jsonPath("$.openapi", is("3.1.0")))
		       .andExpect(content().json(getContent("results/3.1.0/app68-1.json"), true));
	}

	@Test
	void testApp2() throws Exception {
		mockMvc.perform(get(Constants.DEFAULT_API_DOCS_URL + "/users"))
		       .andExpect(status().isOk())
		       .andExpect(jsonPath("$.openapi", is("3.1.0")))
		       .andExpect(content().json(getContent("results/3.1.0/app68-2.json"), true));
	}

	@Test
	void testApp3() throws Exception {
		mockMvc.perform(get(Constants.DEFAULT_API_DOCS_URL + "/pets"))
		       .andExpect(status().isOk())
		       .andExpect(jsonPath("$.openapi", is("3.1.0")))
		       .andExpect(content().json(getContent("results/3.1.0/app68-3.json"), true));
	}

	@Test
	void testApp4() throws Exception {
		mockMvc.perform(get(Constants.DEFAULT_API_DOCS_URL + "/groups test"))
		       .andExpect(status().isOk())
		       .andExpect(jsonPath("$.openapi", is("3.1.0")))
		       .andExpect(content().json(getContent("results/3.1.0/app68-4.json"), true));
	}

	@Test
	void testActuator() throws Exception {
		mockMvc.perform(get(Constants.DEFAULT_API_DOCS_URL)).andExpect(status().isOk())
		       .andExpect(jsonPath("$.openapi", is("3.1.0")))
		       .andExpect(
				       jsonPath("$.paths./actuator/health.get.summary", Matchers.is("Actuator web endpoint 'health'")))
		       .andExpect(jsonPath("$.paths./actuator/health.get.operationId", containsString("health")));
	}

	@Test
	void testActuatorDescription() throws Exception {
		mockMvc.perform(get(Constants.DEFAULT_API_DOCS_URL)).andExpect(status().isOk())
		       .andExpect(jsonPath("$.openapi", is("3.1.0")))
		       .andExpect(jsonPath("$.tags", hasSize(4)))
		       .andExpect(jsonPath("$.tags[?(@.name == '" + Constants.SPRINGDOC_ACTUATOR_TAG + "')].name",
		                           contains(Constants.SPRINGDOC_ACTUATOR_TAG)))
		       .andExpect(jsonPath("$.tags[?(@.name == '" + Constants.SPRINGDOC_ACTUATOR_TAG + "')].description",
		                           contains(Constants.SPRINGDOC_ACTUATOR_DESCRIPTION)))
		       .andExpect(jsonPath(
				       "$.tags[?(@.name == '" + Constants.SPRINGDOC_ACTUATOR_TAG + "')].externalDocs.description",
				       contains(Constants.SPRINGDOC_ACTUATOR_DOC_DESCRIPTION)))
		       .andExpect(jsonPath("$.tags[?(@.name == '" + Constants.SPRINGDOC_ACTUATOR_TAG + "')].externalDocs.url",
		                           contains(Constants.SPRINGDOC_ACTUATOR_DOC_URL)));
	}

	@Test
	void testApp5() throws Exception {
		mockMvc.perform(get(Constants.DEFAULT_API_DOCS_URL + "/user"))
		       .andExpect(status().isNotFound());
	}
}
