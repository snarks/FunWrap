package io.github.snarks.funwrap.functions;

import io.github.snarks.funwrap.FunRunner;

import java.util.function.BiPredicate;

@FunctionalInterface
public interface CheckedBiPredicate<T, U> extends BiPredicate<T, U> {
	boolean testChecked(T t, U u) throws Exception;

	@Override
	default boolean test(T t, U u) {
		return FunRunner.test(this, t, u);
	}
}
