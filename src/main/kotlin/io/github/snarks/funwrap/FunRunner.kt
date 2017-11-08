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


fun run(runnable: CheckedRunnable) = runnable.runChecked()

fun <R> get(supplier: CheckedSupplier<R>) = supplier.getChecked()

fun <T> accept(consumer: CheckedConsumer<T>, t: T) = consumer.acceptChecked(t)

fun <T, U> accept(biConsumer: CheckedBiConsumer<T, U>, t: T, u: U) = biConsumer.acceptChecked(t, u)

fun <T, R> apply(function: CheckedFunction<T, R>, t: T) = function.applyChecked(t)

fun <T, U, R> apply(biFunction: CheckedBiFunction<T, U, R>, t: T, u: U) = biFunction.applyChecked(t, u)

fun <T> test(predicate: CheckedPredicate<T>, t: T) = predicate.testChecked(t)

fun <T, U> test(biPredicate: CheckedBiPredicate<T, U>, t: T, u: U) = biPredicate.testChecked(t, u)
