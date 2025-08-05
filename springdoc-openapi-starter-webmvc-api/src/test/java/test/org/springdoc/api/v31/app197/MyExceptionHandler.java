package test.org.springdoc.api.v31.app197;

import org.springframework.http.HttpStatus;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class MyExceptionHandler {
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler({HttpRequestMethodNotSupportedException.class})
	@ResponseBody
	public Map<String, Object> handleError() {
		Map<String, Object> errorMap = new HashMap<String, Object>();
		errorMap.put("message", "error");
		return errorMap;
	}
}
