package de.hshl.isd.basiccleanarch

/**
 * Sealed class associated with a result or an error.
 */
sealed class Result {
    class Success<T>(val value: T) : Result()
    class Failure(val error: Throwable) : Result()
}