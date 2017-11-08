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
