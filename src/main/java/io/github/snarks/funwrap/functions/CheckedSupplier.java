package io.github.snarks.funwrap.functions;

@FunctionalInterface
public interface CheckedSupplier<T> {
	T get() throws Exception;
}
