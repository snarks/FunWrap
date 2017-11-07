package io.github.snarks.funwrap;

import io.github.snarks.funwrap.functions.*;

import java.util.function.*;

import static io.github.snarks.funwrap.FunRunner.*;

public class FunWrap {

	private FunWrap() {
	}

	public static Runnable runnable(CheckedRunnable runnable) {
		return () -> run(runnable);
	}

	public static <T> Supplier<T> supplier(CheckedSupplier<T> supplier) {
		return () -> get(supplier);
	}

	public static <T> Consumer<T> consumer(CheckedConsumer<T> consumer) {
		return (t) -> FunRunner.accept(consumer, t);
	}

	public static <T, U> BiConsumer<T, U> consumer(CheckedBiConsumer<T, U> biConsumer) {
		return (t, u) -> FunRunner.accept(biConsumer, t, u);
	}

	public static <T, R> Function<T, R> function(CheckedFunction<T, R> function) {
		return (t) -> FunRunner.apply(function, t);
	}

	public static <T, U, R> BiFunction<T, U, R> function(CheckedBiFunction<T, U, R> biFunction) {
		return (t, u) -> FunRunner.apply(biFunction, t, u);
	}

	public static <T> Predicate<T> predicate(CheckedPredicate<T> predicate) {
		return (t) -> FunRunner.test(predicate, t);
	}

	public static <T, U> BiPredicate<T, U> predicate(CheckedBiPredicate<T, U> biPredicate) {
		return (t, u) -> test(biPredicate, t, u);
	}
}
