package io.github.tuguzt.pcbuilder.domain

import io.github.tuguzt.pcbuilder.domain.Result.Error
import io.github.tuguzt.pcbuilder.domain.Result.Success
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

/**
 * Represents result of some operation: either [success][Success] or [error][Error].
 */
public sealed interface Result<S, E> {
    /**
     * Successful result with [data].
     */
    public data class Success<S, E> internal constructor(public val data: S) : Result<S, E>

    /**
     * Error result with [error] and [throwable], if present.
     */
    public data class Error<S, E> internal constructor(
        public val error: E,
        public val throwable: Throwable?,
    ) : Result<S, E>
}

/**
 * Retrieves data from the result, if it was successful, otherwise returns `null`.
 */
public fun <S, E> Result<S, E>.getOrNull(): S? = when (this) {
    is Error -> null
    is Success -> data
}

/**
 * Retrieves error from the result, if it was not successful, otherwise returns `null`.
 */
public fun <S, E> Result<S, E>.errorOrNull(): E? = when (this) {
    is Error -> error
    is Success -> null
}

/**
 * Make successful result from the [data].
 */
public fun <S, E> success(data: S): Success<S, E> = Success(data)

/**
 * Make error result from the [error] and [throwable], if any.
 */
public fun <S, E> error(error: E, throwable: Throwable? = null): Error<S, E> = Error(error, throwable)

/**
 * Maps result to the new result with another success type.
 */
@OptIn(ExperimentalContracts::class)
public fun <S, E, N> Result<S, E>.mapSuccess(transform: (S) -> N): Result<N, E> {
    contract {
        callsInPlace(transform, InvocationKind.AT_MOST_ONCE)
    }
    return when (this) {
        is Error -> cast()
        is Success -> map(transform)
    }
}

/**
 * Maps result to the new result with another error type.
 */
@OptIn(ExperimentalContracts::class)
public fun <S, E, N> Result<S, E>.mapError(transform: (E) -> N): Result<S, N> {
    contract {
        callsInPlace(transform, InvocationKind.AT_MOST_ONCE)
    }
    return when (this) {
        is Error -> map(transform)
        is Success -> cast()
    }
}

/**
 * Maps successful result to the new successful result with another success type.
 */
@OptIn(ExperimentalContracts::class)
public fun <S, E, N> Success<S, E>.map(transform: (S) -> N): Success<N, E> {
    contract {
        callsInPlace(transform, InvocationKind.EXACTLY_ONCE)
    }
    return Success(transform(data))
}

/**
 * Maps error result to the new error result with another error type.
 */
@OptIn(ExperimentalContracts::class)
public fun <S, E, N> Error<S, E>.map(transform: (E) -> N): Error<S, N> {
    contract {
        callsInPlace(transform, InvocationKind.EXACTLY_ONCE)
    }
    return Error(error = transform(error), throwable)
}

/**
 * Casts successful result to the new result of another error type.
 */
public fun <S, E, N> Success<S, E>.cast(): Success<S, N> {
    @Suppress("UNCHECKED_CAST")
    return this as Success<S, N>
}

/**
 * Casts error result to the new result of another success type.
 */
public fun <S, E, N> Error<S, E>.cast(): Error<N, E> {
    @Suppress("UNCHECKED_CAST")
    return this as Error<N, E>
}

/**
 * Converts [kotlin.Result] to the [Result] object.
 */
public fun <S, E> kotlin.Result<S>.toResult(): Result<S, E?> = when (val data = getOrNull()) {
    null -> Error(error = null, throwable = exceptionOrNull())
    else -> Success(data)
}
