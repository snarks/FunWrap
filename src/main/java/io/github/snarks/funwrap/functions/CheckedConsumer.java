package io.github.snarks.funwrap.functions;

@FunctionalInterface
public interface CheckedConsumer<T> {
	void accept(T t) throws Exception;
}
