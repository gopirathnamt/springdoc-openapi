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

package test.org.springdoc.api.v30.app154;

import org.springdoc.core.annotations.ParameterObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

/**
 * The type Hello controller.
 */
@RestController
class HelloController {


	/**
	 * Hello string.
	 *
	 * @return the string
	 */
	@GetMapping(path = "/")
	public String hello() {
		return "Hello world at " + Instant.now().toString();
	}

	/**
	 * Create.
	 *
	 * @param id the id
	 * @param o  the o
	 */
	@PostMapping(value = "/persons")
	public void create(@ParameterObject Long id, @RequestBody Object o) {

	}

	/**
	 * Createone.
	 *
	 * @param id the id
	 * @param o  the o
	 */
	@PostMapping(value = "/personsone")
	public void createone(Long id, @RequestBody Object o) {

	}

	/**
	 * Createtwo.
	 *
	 * @param id the id
	 */
	@PostMapping(value = "/createtwo")
	public void createtwo(int id) {

	}

	/**
	 * Createthree.
	 *
	 * @param id the id
	 */
	@PostMapping(value = "/createthree")
	public void createthree(Integer id) {

	}

}