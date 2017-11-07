package io.github.snarks.funwrap;

import io.github.snarks.funwrap.functions.*;

import java.util.function.*;

import static io.github.snarks.funwrap.FunRunner.invoke;

public class FunWrap {

	private FunWrap() {
	}

	public static Runnable wrap(CheckedRunnable runnable) {
		return () -> invoke(runnable);
	}

	public static <T> Supplier<T> wrap(CheckedSupplier<T> supplier) {
		return () -> invoke(supplier);
	}

	public static <T> Consumer<T> wrap(CheckedConsumer<T> consumer) {
		return (t) -> invoke(consumer, t);
	}

	public static <T, U> BiConsumer<T, U> wrap(CheckedBiConsumer<T, U> biConsumer) {
		return (t, u) -> invoke(biConsumer, t, u);
	}

	public static <T, R> Function<T, R> wrap(CheckedFunction<T, R> function) {
		return (t) -> invoke(function, t);
	}

	public static <T, U, R> BiFunction<T, U, R> wrap(CheckedBiFunction<T, U, R> biFunction) {
		return (t, u) -> invoke(biFunction, t, u);
	}

	public static <T> Predicate<T> wrap(CheckedPredicate<T> predicate) {
		return (t) -> invoke(predicate, t);
	}

	public static <T, U> BiPredicate<T, U> wrap(CheckedBiPredicate<T, U> biPredicate) {
		return (t, u) -> invoke(biPredicate, t, u);
	}
}
