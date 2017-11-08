package io.github.snarks.funwrap;

import io.github.snarks.funwrap.functions.*;

import java.util.function.*;

public class FunWrap {

	private FunWrap() {
	}

	public static Runnable runnable(CheckedRunnable runnable) {
		return runnable;
	}

	public static <T> Supplier<T> supplier(CheckedSupplier<T> supplier) {
		return supplier;
	}

	public static <T> Consumer<T> consumer(CheckedConsumer<T> consumer) {
		return consumer;
	}

	public static <T, U> BiConsumer<T, U> consumer(CheckedBiConsumer<T, U> biConsumer) {
		return biConsumer;
	}

	public static <T, R> Function<T, R> function(CheckedFunction<T, R> function) {
		return function;
	}

	public static <T, U, R> BiFunction<T, U, R> function(CheckedBiFunction<T, U, R> biFunction) {
		return biFunction;
	}

	public static <T> Predicate<T> predicate(CheckedPredicate<T> predicate) {
		return (t) -> FunRunner.test(predicate, t);
	}

	public static <T, U> BiPredicate<T, U> predicate(CheckedBiPredicate<T, U> biPredicate) {
		return biPredicate;
	}
}
