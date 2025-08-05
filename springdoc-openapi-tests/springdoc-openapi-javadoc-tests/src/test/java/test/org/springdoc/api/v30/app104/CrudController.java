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

package test.org.springdoc.api.v30.app104;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * The type Crud controller.
 *
 * @param <T> the type parameter
 */
@Controller
@SuppressWarnings("rawtypes")
public abstract class CrudController<T extends HavingPK> {

	/**
	 * Get t.
	 *
	 * @param id the id
	 * @return the t
	 */
	@GetMapping(path = "{id}")
	@ResponseBody
	@Operation(description = "Get single object")
	public T get( //
	              @Parameter(description = "The id to get.", required = true) @PathVariable("id") int id) {
		return null;
	}

	/**
	 * List list.
	 *
	 * @return the list
	 */
	@GetMapping(path = "")
	@ResponseBody
	@Operation(description = "Receive a list of objects")
	public List<T> list() {
		return null;
	}
}