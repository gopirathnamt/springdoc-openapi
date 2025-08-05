package test.org.springdoc.api.v30.app227.wrapper;


import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import test.org.springdoc.api.v30.app227.model.Item;

public class ResponseEntityWrapper<T> extends ResponseEntity<Item<T>> {
	public ResponseEntityWrapper(Item<T> body, HttpStatusCode status) {
		super(body, status);
	}
}
