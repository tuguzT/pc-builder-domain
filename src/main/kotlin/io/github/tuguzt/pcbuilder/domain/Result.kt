package io.github.tuguzt.pcbuilder.domain

import io.github.tuguzt.pcbuilder.domain.Result.Error
import io.github.tuguzt.pcbuilder.domain.Result.Success
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

/**
 * Represents result of some operation: either [success][Success] or [error][Error].
 */
public sealed class Result<Success, Error> {
    /**
     * Successful result with [data] inside.
     */
    public data class Success<Success, Error>(val data: Success) : Result<Success, Error>()

    /**
     * Error result with [error] and [cause], if present.
     */
    public data class Error<Success, Error>(val error: Error, val cause: Throwable?) : Result<Success, Error>()
}

/**
 * Retrieves data from the result if it was successful, otherwise returns `null`.
 */
public fun <Success, Error> Result<Success, Error>.getOrNull(): Success? = when (this) {
    is Result.Error -> null
    is Result.Success -> data
}

/**
 * Retrieves error from the result if it was not successful, otherwise returns `null`.
 */
public fun <Success, Error> Result<Success, Error>.errorOrNull(): Error? = when (this) {
    is Result.Error -> error
    is Result.Success -> null
}

/**
 * Retrieves throwable from the result if it was not successful, otherwise returns `null`.
 */
public fun <Success, Error> Result<Success, Error>.causeOrNull(): Throwable? = when (this) {
    is Result.Error -> cause
    is Result.Success -> null
}

/**
 * Make successful result from the [data].
 */
public fun <Success, Error> success(data: Success): Result.Success<Success, Error> = Success(data)

/**
 * Make error result from the [error] and [cause], if any.
 */
public fun <Success, Error> error(error: Error, cause: Throwable? = null): Result.Error<Success, Error> =
    Error(error, cause)

/**
 * Maps result to the new result with another success type.
 */
@OptIn(ExperimentalContracts::class)
public fun <Success, Error, NewSuccess> Result<Success, Error>.mapSuccess(transform: (Success) -> NewSuccess): Result<NewSuccess, Error> {
    contract {
        callsInPlace(transform, InvocationKind.AT_MOST_ONCE)
    }
    return when (this) {
        is Result.Error -> cast()
        is Result.Success -> map(transform)
    }
}

/**
 * Maps result to the new result with another error type.
 */
@OptIn(ExperimentalContracts::class)
public fun <Success, Error, NewError> Result<Success, Error>.mapError(transform: (Error) -> NewError): Result<Success, NewError> {
    contract {
        callsInPlace(transform, InvocationKind.AT_MOST_ONCE)
    }
    return when (this) {
        is Result.Error -> map(transform)
        is Result.Success -> cast()
    }
}

/**
 * Maps successful result to the new successful result with another success type.
 */
@OptIn(ExperimentalContracts::class)
public fun <Success, Error, NewSuccess> Result.Success<Success, Error>.map(transform: (Success) -> NewSuccess): Result.Success<NewSuccess, Error> {
    contract {
        callsInPlace(transform, InvocationKind.EXACTLY_ONCE)
    }
    return Success(transform(data))
}

/**
 * Maps error result to the new error result with another error type.
 */
@OptIn(ExperimentalContracts::class)
public fun <Success, Error, NewError> Result.Error<Success, Error>.map(transform: (Error) -> NewError): Result.Error<Success, NewError> {
    contract {
        callsInPlace(transform, InvocationKind.EXACTLY_ONCE)
    }
    return Error(error = transform(error), cause)
}

/**
 * Casts successful result to the new result of another error type which is safe.
 */
public fun <Success, Error, NewError> Result.Success<Success, Error>.cast(): Result.Success<Success, NewError> {
    @Suppress("UNCHECKED_CAST")
    return this as Result.Success<Success, NewError>
}

/**
 * Casts error result to the new result of another success type which is safe.
 */
public fun <Success, Error, NewSuccess> Result.Error<Success, Error>.cast(): Result.Error<NewSuccess, Error> {
    @Suppress("UNCHECKED_CAST")
    return this as Result.Error<NewSuccess, Error>
}

/**
 * Converts [kotlin.Result] to the [Result] object.
 */
public fun <Success, Error> kotlin.Result<Success>.toResult(): Result<Success?, Error?> =
    when (val cause = exceptionOrNull()) {
        null -> Success(data = getOrNull())
        else -> Error(error = null, cause = cause)
    }
