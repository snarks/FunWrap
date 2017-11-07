@file:JvmName("FunRunner")

package io.github.snarks.funwrap

import io.github.snarks.funwrap.functions.*


fun CheckedRunnable.invoke() = run()

fun <R> CheckedSupplier<R>.invoke() = get()

fun <T> CheckedConsumer<T>.invoke(t: T) = accept(t)

fun <T, U> CheckedBiConsumer<T, U>.invoke(t: T, u: U) = accept(t, u)

fun <T, R> CheckedFunction<T, R>.invoke(t: T) = apply(t)

fun <T, U, R> CheckedBiFunction<T, U, R>.invoke(t: T, u: U) = apply(t, u)

fun <T> CheckedPredicate<T>.invoke(t: T) = test(t)

fun <T, U> CheckedBiPredicate<T, U>.invoke(t: T, u: U) = test(t, u)
