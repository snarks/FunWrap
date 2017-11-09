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
@file:JvmName("FunRunner")

package io.github.snarks.funwrap

import io.github.snarks.funwrap.functions.*


/**
 * Calls [CheckedRunnable.runChecked] without a `throws` clause
 *
 * Any exception thrown by [runnable] will be thrown as is, as if it was a [RuntimeException].
 *
 * @param runnable The runnable to be called
 */
fun run(runnable: CheckedRunnable) = runnable.runChecked()

/**
 * Calls [CheckedSupplier.getChecked] without a `throws` clause
 *
 * Any exception thrown by [supplier] will be thrown as is, as if it was a [RuntimeException].
 *
 * @param supplier The supplier to be called
 * @return The value returned by `supplier`
 */
fun <R> get(supplier: CheckedSupplier<R>) = supplier.getChecked()

/**
 * Calls [CheckedConsumer.acceptChecked] without a `throws` clause
 *
 * Any exception thrown by [consumer] will be thrown as is, as if it was a [RuntimeException].
 *
 * @param t The parameter to be passed to `consumer`
 * @param consumer The consumer to be called
 */
fun <T> accept(t: T, consumer: CheckedConsumer<T>) = consumer.acceptChecked(t)

/**
 * Calls [CheckedBiConsumer.acceptChecked] without a `throws` clause
 *
 * Any exception thrown by [biConsumer] will be thrown as is, as if it was a [RuntimeException].
 *
 * @param t The 1st parameter to be passed to `biConsumer`
 * @param u The 2nd parameter to be passed to `biConsumer`
 * @param biConsumer The consumer to be called
 */
fun <T, U> accept(t: T, u: U, biConsumer: CheckedBiConsumer<T, U>) = biConsumer.acceptChecked(t, u)

/**
 * Calls [CheckedFunction.applyChecked] without a `throws` clause
 *
 * Any exception thrown by [function] will be thrown as is, as if it was a [RuntimeException].
 *
 * @param t The parameter to be passed to `function`
 * @param function The function to be called
 * @return The value returned by `function`
 */
fun <T, R> apply(t: T, function: CheckedFunction<T, R>) = function.applyChecked(t)

/**
 * Calls [CheckedBiFunction.applyChecked] without a `throws` clause
 *
 * Any exception thrown by [biFunction] will be thrown as is, as if it was a [RuntimeException].
 *
 * @param t The 1st parameter to be passed to `biFunction`
 * @param u The 2nd parameter to be passed to `biFunction`
 * @param biFunction The function to be called
 * @return The value returned by `biFunction`
 */
fun <T, U, R> apply(t: T, u: U, biFunction: CheckedBiFunction<T, U, R>) = biFunction.applyChecked(t, u)

/**
 * Calls [CheckedPredicate.testChecked] without a `throws` clause
 *
 * Any exception thrown by [predicate] will be thrown as is, as if it was a [RuntimeException].
 *
 * @param t The parameter to be passed to `predicate`
 * @param predicate The predicate to be called
 * @return The boolean returned by `predicate`
 */
fun <T> test(t: T, predicate: CheckedPredicate<T>) = predicate.testChecked(t)

/**
 * Calls [CheckedBiPredicate.testChecked] without a `throws` clause
 *
 * Any exception thrown by [biPredicate] will be thrown as is, as if it was a [RuntimeException].
 *
 * @param t The 1st parameter to be passed to `biPredicate`
 * @param u The 2nd parameter to be passed to `biPredicate`
 * @param biPredicate The predicate to be called
 * @return The boolean returned by `biPredicate`
 */
fun <T, U> test(t: T, u: U, biPredicate: CheckedBiPredicate<T, U>) = biPredicate.testChecked(t, u)
