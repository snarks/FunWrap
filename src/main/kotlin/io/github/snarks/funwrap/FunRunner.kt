@file:JvmName("FunRunner")

package io.github.snarks.funwrap

import io.github.snarks.funwrap.functions.*


fun run(runnable: CheckedRunnable) = runnable.run()

fun <R> get(supplier: CheckedSupplier<R>) = supplier.get()

fun <T> accept(consumer: CheckedConsumer<T>, t: T) = consumer.accept(t)

fun <T, U> accept(biConsumer: CheckedBiConsumer<T, U>, t: T, u: U) = biConsumer.accept(t, u)

fun <T, R> apply(function: CheckedFunction<T, R>, t: T) = function.apply(t)

fun <T, U, R> apply(biFunction: CheckedBiFunction<T, U, R>, t: T, u: U) = biFunction.apply(t, u)

fun <T> test(predicate: CheckedPredicate<T>, t: T) = predicate.test(t)

fun <T, U> test(biPredicate: CheckedBiPredicate<T, U>, t: T, u: U) = biPredicate.test(t, u)
