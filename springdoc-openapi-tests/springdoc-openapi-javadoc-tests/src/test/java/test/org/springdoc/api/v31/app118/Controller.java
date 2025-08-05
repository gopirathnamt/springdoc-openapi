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

package test.org.springdoc.api.v31.app118;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * The type Controller.
 */
@RestController
@RequestMapping("class-hierarchy")
class Controller {
	/**
	 * Abstract parent response.
	 *
	 * @param payload the payload
	 * @return the response
	 */
	@PostMapping("abstract-parent")
	public Response abstractParent(@RequestBody AbstractParent payload) {
		return null;
	}

	/**
	 * Concrete parent response.
	 *
	 * @param payload the payload
	 * @return the response
	 */
	@PostMapping("concrete-parent")
	public Response concreteParent(@RequestBody ConcreteParent payload) {
		return null;
	}
}

/**
 * The type Response.
 */
class Response {
	/**
	 * The Abstract parent.
	 */
	AbstractParent abstractParent;

	/**
	 * The Concrete parents.
	 */
	List<ConcreteParent> concreteParents;

	/**
	 * Gets abstract parent.
	 *
	 * @return the abstract parent
	 */
	public AbstractParent getAbstractParent() {
		return abstractParent;
	}

	/**
	 * Sets abstract parent.
	 *
	 * @param abstractParent the abstract parent
	 */
	public void setAbstractParent(AbstractParent abstractParent) {
		this.abstractParent = abstractParent;
	}

	/**
	 * Gets concrete parents.
	 *
	 * @return the concrete parents
	 */
	public List<ConcreteParent> getConcreteParents() {
		return concreteParents;
	}

	/**
	 * Sets concrete parents.
	 *
	 * @param concreteParents the concrete parents
	 */
	public void setConcreteParents(List<ConcreteParent> concreteParents) {
		this.concreteParents = concreteParents;
	}
}
