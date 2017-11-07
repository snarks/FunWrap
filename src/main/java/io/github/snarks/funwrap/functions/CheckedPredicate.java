package io.github.snarks.funwrap.functions;

@FunctionalInterface
public interface CheckedPredicate<T> {
	boolean test(T t) throws Exception;
}
