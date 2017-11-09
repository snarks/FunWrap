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
package io.github.snarks.funwrap;

import io.github.snarks.funwrap.functions.*;

import java.util.function.*;

/**
 * Provides methods to get {@link java.util.function} interfaces from FunWrap lambdas.
 * <p>
 * <p>
 * <b>Implementation Notes:</b>
 * <p>
 * All the FunWrap lambdas already extend their {@code j.u.f} counterparts. So the methods in this class just
 * return the lambdas passed on to them.
 */
public class FunWrap {

	private FunWrap() {
	}

	/**
	 * Gets a {@link Runnable} from a {@link CheckedRunnable}
	 *
	 * @param runnable The lambda to be used
	 * @return A {@link Runnable} that does the same thing
	 */
	public static Runnable runnable(CheckedRunnable runnable) {
		return runnable;
	}

	/**
	 * Gets a {@link Supplier} from a {@link CheckedSupplier}
	 *
	 * @param supplier The lambda to be used
	 * @param <T>      The return type of the lambda
	 * @return A {@link Supplier} that does the same thing
	 */
	public static <T> Supplier<T> supplier(CheckedSupplier<T> supplier) {
		return supplier;
	}

	/**
	 * Gets a {@link Consumer} from a {@link CheckedConsumer}
	 *
	 * @param consumer The lambda to be used
	 * @param <T>      The argument type for the lambda
	 * @return A {@link Consumer} that does the same thing
	 */
	public static <T> Consumer<T> consumer(CheckedConsumer<T> consumer) {
		return consumer;
	}

	/**
	 * Gets a {@link BiConsumer} from a {@link CheckedBiConsumer}
	 *
	 * @param biConsumer The lambda to be used
	 * @param <T>        The 1st argument type for the lambda
	 * @param <U>        The 2nd argument type for the lambda
	 * @return A {@link BiConsumer} that does the same thing
	 */
	public static <T, U> BiConsumer<T, U> consumer(CheckedBiConsumer<T, U> biConsumer) {
		return biConsumer;
	}

	/**
	 * Gets a {@link Function} from a {@link CheckedFunction}
	 *
	 * @param function The lambda to be used
	 * @param <T>      The argument type for the lambda
	 * @param <R>      The return type of the lambda
	 * @return A {@link Function} that does the same thing
	 */
	public static <T, R> Function<T, R> function(CheckedFunction<T, R> function) {
		return function;
	}

	/**
	 * Gets a {@link BiFunction} from a {@link CheckedBiFunction}
	 *
	 * @param biFunction The lambda to be used
	 * @param <T>        The 1st argument type for the lambda
	 * @param <U>        The 2nd argument type for the lambda
	 * @param <R>        The return type of the lambda
	 * @return A {@link BiFunction} that does the same thing
	 */
	public static <T, U, R> BiFunction<T, U, R> function(CheckedBiFunction<T, U, R> biFunction) {
		return biFunction;
	}

	/**
	 * Gets a {@link Predicate} from a {@link CheckedPredicate}
	 *
	 * @param predicate The lambda to be used
	 * @param <T>       The argument type for the lambda
	 * @return A {@link Predicate} that does the same thing
	 */
	public static <T> Predicate<T> predicate(CheckedPredicate<T> predicate) {
		return predicate;
	}

	/**
	 * Gets a {@link BiPredicate} from a {@link CheckedBiPredicate}
	 *
	 * @param biPredicate The lambda to be used
	 * @param <T>         The 1st argument type for the lambda
	 * @param <U>         The 2nd argument type for the lambda
	 * @return A {@link BiPredicate} the does the same thing
	 */
	public static <T, U> BiPredicate<T, U> predicate(CheckedBiPredicate<T, U> biPredicate) {
		return biPredicate;
	}
}
