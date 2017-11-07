package io.github.snarks.funwrap.functions;

@FunctionalInterface
public interface CheckedBiPredicate<T, U> {
	boolean test(T t, U u) throws Exception;
}
