package io.github.snarks.funwrap.functions;

import io.github.snarks.funwrap.FunRunner;

import java.util.function.Predicate;

@FunctionalInterface
public interface CheckedPredicate<T> extends Predicate<T> {
	boolean testChecked(T t) throws Exception;

	@Override
	default boolean test(T t) {
		return FunRunner.test(this, t);
	}
}
