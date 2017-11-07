package io.github.snarks.funwrap.functions;

@FunctionalInterface
public interface CheckedFunction<T, R> {
	R apply(T t) throws Exception;
}
