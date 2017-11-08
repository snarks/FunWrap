package io.github.snarks.funwrap.functions;

import io.github.snarks.funwrap.FunRunner;

import java.util.function.BiFunction;

@FunctionalInterface
public interface CheckedBiFunction<T, U, R> extends BiFunction<T, U, R> {
	R applyChecked(T t, U u) throws Exception;

	@Override
	default R apply(T t, U u) {
		return FunRunner.apply(this, t, u);
	}
}
