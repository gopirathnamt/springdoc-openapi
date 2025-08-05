package test.org.springdoc.api.v31.app230;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;

/**
 * @author edudar
 */
@Target({PARAMETER, METHOD, ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@RequestBody(required = true)
@interface App230RequestBody {

}
