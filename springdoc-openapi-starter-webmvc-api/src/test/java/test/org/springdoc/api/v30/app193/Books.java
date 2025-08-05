package test.org.springdoc.api.v30.app193;


import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.Arrays;

@Schema(description = "Represents a list of Books.")
public class Books extends ArrayList<Book> implements Knowledge {

	public Books() {
		super();
	}

	public Books(Book... books) {
		this();

		if (books != null) {
			Arrays.stream(books).forEach(this::add);
		}
	}
}
