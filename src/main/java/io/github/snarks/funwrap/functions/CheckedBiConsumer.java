package io.github.snarks.funwrap.functions;

@FunctionalInterface
public interface CheckedBiConsumer<T, U> {
	void accept(T t, U u) throws Exception;
}
