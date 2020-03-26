package com.acme.todolist.domain;

import static org.junit.jupiter.api.Assertions.assertTrue;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import org.junit.jupiter.api.Test;
import com.acme.todolist.domain.TodoItem;

public class Tests {

	static final String LATE = "[LATE!] ";
	
	@Test
	public void EnRetard() {
		LocalDate date = LocalDate.parse("1997-05-31");
		Instant enRetard = date.atStartOfDay(ZoneId.of("Europe/Paris")).toInstant();
		TodoItem item = new TodoItem("1", enRetard, "En retard");
		assertTrue(item.finalContent().contains(LATE));
	}
	@Test
	public void EnAvance() {
		Instant enAvance = Instant.now();
		TodoItem item = new TodoItem("2", enAvance, "En avance");
		assertTrue(!item.finalContent().contains(LATE));
	}
}