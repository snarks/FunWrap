package io.github.snarks.funwrap;

import org.junit.Test;

import java.util.function.*;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FunWrapTest {
	@SuppressWarnings("Convert2MethodRef")
	@Test
	public void stream() {
		Stream.of("hello", "hi", "world", "fobar")
				.map(FunWrap.function(s -> s.length()))
				.filter(FunWrap.predicate(l -> l % 2 != 0))
				.forEach(FunWrap.consumer(l -> assertEquals(5, l.intValue())));
	}

	@Test
	public void runnable() {
		String[] checker = {null};
		FunWrap.runnable(() -> checker[0] = "hello runnable").run();
		assertEquals("hello runnable", checker[0]);
	}

	@Test(expected = TestException.class)
	public void runnableError() {
		Runnable r = FunWrap.runnable(() -> {
			throw new TestException();
		});
		r.run();
	}

	@Test
	public void supplier() {
		Supplier<String> s = FunWrap.supplier(() -> "hello supplier");
		assertEquals("hello supplier", s.get());
	}

	@Test(expected = TestException.class)
	public void supplierError() {
		Supplier<String> s = FunWrap.supplier(() -> {
			throw new TestException();
		});
		s.get();
	}

	@Test
	public void consumer() {
		String[] checker = {null};
		Consumer<String> c = FunWrap.consumer(s -> checker[0] = s);
		c.accept("hello consumer");
		assertEquals("hello consumer", checker[0]);
	}

	@Test(expected = TestException.class)
	public void consumerError() {
		Consumer<String> c = FunWrap.consumer(s -> {
			throw new TestException();
		});
		c.accept("hello");
	}

	@Test
	public void consumerBi() {
		String[] checker = {null};
		BiConsumer<String, Integer> c = FunWrap.consumer((s, i) -> checker[0] = s + " " + i);
		c.accept("hello biConsumer", 1);
		assertEquals("hello biConsumer 1", checker[0]);
	}

	@Test(expected = TestException.class)
	public void consumerBiError() {
		BiConsumer<String, Integer> c = FunWrap.consumer((s, i) -> {
			throw new TestException();
		});
		c.accept("hello", 1);
	}

	@Test
	public void function() {
		Function<String, String> f = FunWrap.function(s -> s + " function");
		assertEquals("hello function", f.apply("hello"));
	}

	@Test(expected = TestException.class)
	public void functionError() {
		Function<String, Integer> f = FunWrap.function(s -> {
			throw new TestException();
		});
		f.apply("hello");
	}

	@Test
	public void functionBi() {
		BiFunction<String, Integer, String> f = FunWrap.function((s, t) -> s + " " + t);
		assertEquals("hello biFunction 1", f.apply("hello biFunction", 1));
	}

	@Test(expected = TestException.class)
	public void functionBiError() {
		BiFunction<String, String, Integer> f = FunWrap.function((s1, s2) -> {
			throw new TestException();
		});
		f.apply("hello", "hi");
	}

	@Test
	public void predicate() {
		Predicate<String> p = FunWrap.predicate("hello predicate"::equals);
		assertTrue(p.test("hello predicate"));
	}

	@Test(expected = TestException.class)
	public void predicateError() {
		Predicate<String> p = FunWrap.predicate(s -> {
			throw new TestException();
		});
		p.test("hello");
	}

	@Test
	public void predicateBi() {
		BiPredicate<String, String> p = FunWrap.predicate(String::equals);
		assertTrue(p.test("hello biPredicate", "hello biPredicate"));
	}

	@Test(expected = TestException.class)
	public void predicateBiError() {
		BiPredicate<String, String> p = FunWrap.predicate((s1, s2) -> {
			throw new TestException();
		});
		p.test("hello", "hi");
	}

	private static class TestException extends Exception {
	}
}
