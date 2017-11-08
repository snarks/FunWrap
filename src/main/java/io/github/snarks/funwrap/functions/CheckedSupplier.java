package io.github.snarks.funwrap.functions;

import io.github.snarks.funwrap.FunRunner;

import java.util.function.Supplier;

@FunctionalInterface
public interface CheckedSupplier<T> extends Supplier<T> {
	T getChecked() throws Exception;

	@Override
	default T get() {
		return FunRunner.get(this);
	}
}
