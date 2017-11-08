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

public class FunWrap {

	private FunWrap() {
	}

	public static Runnable runnable(CheckedRunnable runnable) {
		return runnable;
	}

	public static <T> Supplier<T> supplier(CheckedSupplier<T> supplier) {
		return supplier;
	}

	public static <T> Consumer<T> consumer(CheckedConsumer<T> consumer) {
		return consumer;
	}

	public static <T, U> BiConsumer<T, U> consumer(CheckedBiConsumer<T, U> biConsumer) {
		return biConsumer;
	}

	public static <T, R> Function<T, R> function(CheckedFunction<T, R> function) {
		return function;
	}

	public static <T, U, R> BiFunction<T, U, R> function(CheckedBiFunction<T, U, R> biFunction) {
		return biFunction;
	}

	public static <T> Predicate<T> predicate(CheckedPredicate<T> predicate) {
		return (t) -> FunRunner.test(predicate, t);
	}

	public static <T, U> BiPredicate<T, U> predicate(CheckedBiPredicate<T, U> biPredicate) {
		return biPredicate;
	}
}
