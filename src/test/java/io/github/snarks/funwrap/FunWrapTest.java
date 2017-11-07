package io.github.snarks.funwrap;

import org.junit.Test;

import java.util.function.*;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class FunWrapTest {
	@SuppressWarnings("Convert2MethodRef")
	@Test
	public void stream() {
		Stream.of("hello", "hi", "world", "fobar")
				.map(FunWrap.function(s -> s.length()))
				.filter(FunWrap.predicate(l -> l % 2 != 0))
				.forEach(FunWrap.consumer(l -> assertEquals(5, l.intValue())));
	}

	@Test(expected = TestException.class)
	public void runnable() {
		Runnable r = FunWrap.runnable(() -> {
			throw new TestException();
		});
		r.run();
	}

	@Test(expected = TestException.class)
	public void supplier() {
		Supplier<String> s = FunWrap.supplier(() -> {
			throw new TestException();
		});
		s.get();
	}

	@Test(expected = TestException.class)
	public void consumer() {
		Consumer<String> c = FunWrap.consumer(s -> {
			throw new TestException();
		});
		c.accept("hello");
	}

	@Test(expected = TestException.class)
	public void consumerBi() {
		BiConsumer<String, Integer> c = FunWrap.consumer((s, i) -> {
			throw new TestException();
		});
		c.accept("hello", 1);
	}

	@Test(expected = TestException.class)
	public void function() {
		Function<String, Integer> f = FunWrap.function(s -> {
			throw new TestException();
		});
		f.apply("hello");
	}

	@Test(expected = TestException.class)
	public void functionBi() {
		BiFunction<String, String, Integer> f = FunWrap.function((s1, s2) -> {
			throw new TestException();
		});
		f.apply("hello", "hi");
	}

	@Test(expected = TestException.class)
	public void predicate() {
		Predicate<String> p = FunWrap.predicate(s -> {
			throw new TestException();
		});
		p.test("hello");
	}

	@Test(expected = TestException.class)
	public void predicateBi() {
		BiPredicate<String, String> p = FunWrap.predicate((s1, s2) -> {
			throw new TestException();
		});
		p.test("hello", "hi");
	}

	private static class TestException extends Exception {
	}
}
