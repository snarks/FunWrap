package io.github.snarks.funwrap.functions;

import io.github.snarks.funwrap.FunRunner;

@FunctionalInterface
public interface CheckedRunnable extends Runnable {
	void runChecked() throws Exception;

	@Override
	default void run() {
		FunRunner.run(this);
	}
}
