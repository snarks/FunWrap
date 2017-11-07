package io.github.snarks.funwrap.functions;

@FunctionalInterface
public interface CheckedRunnable {
	void run() throws Exception;
}
