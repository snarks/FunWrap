package io.github.snarks.funwrap.functions;

import io.github.snarks.funwrap.FunRunner;

import java.util.function.Consumer;

@FunctionalInterface
public interface CheckedConsumer<T> extends Consumer<T> {
	void acceptChecked(T t) throws Exception;

	@Override
	default void accept(T t) {
		FunRunner.accept(this, t);
	}
}
