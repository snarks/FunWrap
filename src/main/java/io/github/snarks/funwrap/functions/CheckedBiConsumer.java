package io.github.snarks.funwrap.functions;

import io.github.snarks.funwrap.FunRunner;

import java.util.function.BiConsumer;

@FunctionalInterface
public interface CheckedBiConsumer<T, U> extends BiConsumer<T, U> {
	void acceptChecked(T t, U u) throws Exception;

	@Override
	default void accept(T t, U u) {
		FunRunner.accept(this, t, u);
	}
}
