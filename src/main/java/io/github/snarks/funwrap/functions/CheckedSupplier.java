/*
 * Copyright 2017 James Cruz
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.github.snarks.funwrap.functions;

import io.github.snarks.funwrap.FunRunner;

import java.util.function.Supplier;

/**
 * A {@link Supplier} that allows for checked exceptions
 *
 * @param <T> The return type
 */
@FunctionalInterface
public interface CheckedSupplier<T> extends Supplier<T> {

	/**
	 * Gets a result.
	 *
	 * @return The result
	 * @throws Exception The exception thrown by this operation
	 */
	T getChecked() throws Exception;

	/**
	 * Calls {@code getChecked} while bypassing the {@code throws} clause.
	 */
	@Override
	default T get() {
		return FunRunner.get(this);
	}
}
