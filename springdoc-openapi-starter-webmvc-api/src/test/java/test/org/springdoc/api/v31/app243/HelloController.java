package test.org.springdoc.api.v31.app243;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.Year;
import java.time.YearMonth;

@RestController
public class HelloController {

	@PostMapping("/time1")
	public TimeDtoNoAnnotations postTime1(
			@RequestBody TimeDtoNoAnnotations timeDto) {
		return timeDto;
	}

	public record TimeDtoNoAnnotations(LocalDateTime localDateTime,
	                                   LocalDate localDate, LocalTime localTime,
	                                   YearMonth yearMonth, MonthDay monthDay,
	                                   Year year) {
	}
}