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

import java.util.function.Function;

/**
 * A {@link Function} that allows for checked exceptions.
 *
 * @param <T> The argument type
 * @param <R> The return type
 */
@FunctionalInterface
public interface CheckedFunction<T, R> extends Function<T, R> {

	/**
	 * Applies this function to the given argument.
	 *
	 * @param t The input argument
	 * @return The function result
	 * @throws Exception The exception thrown by this function
	 */
	R applyChecked(T t) throws Exception;

	/**
	 * Calls {@code applyChecked} while bypassing the {@code throws} clause.
	 */
	@Override
	default R apply(T t) {
		return FunRunner.apply(t, this);
	}
}
