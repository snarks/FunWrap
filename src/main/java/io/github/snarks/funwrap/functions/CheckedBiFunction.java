package io.github.snarks.funwrap.functions;

@FunctionalInterface
public interface CheckedBiFunction<T, U, R> {
	R apply(T t, U u) throws Exception;
}
