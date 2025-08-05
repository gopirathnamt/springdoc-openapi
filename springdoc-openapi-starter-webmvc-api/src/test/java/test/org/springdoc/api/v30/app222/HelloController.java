package test.org.springdoc.api.v30.app222;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import test.org.springdoc.api.v30.app222.SpringDocApp222Test.FirstHierarchyUser;
import test.org.springdoc.api.v30.app222.SpringDocApp222Test.SecondHierarchyUser;

/**
 * @author bnasslahsen
 */

@RestController
class HelloController {

	@GetMapping("/hello1")
	public FirstHierarchyUser getItems1() {
		return null;
	}

	@GetMapping("/hello2")
	public SecondHierarchyUser getItems2() {
		return null;
	}

}