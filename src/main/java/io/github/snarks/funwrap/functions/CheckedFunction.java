package io.github.snarks.funwrap.functions;

import io.github.snarks.funwrap.FunRunner;

import java.util.function.Function;

@FunctionalInterface
public interface CheckedFunction<T, R> extends Function<T, R> {
	R applyChecked(T t) throws Exception;

	@Override
	default R apply(T t) {
		return FunRunner.apply(this, t);
	}
}
