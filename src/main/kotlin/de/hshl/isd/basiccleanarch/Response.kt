package de.hshl.isd.basiccleanarch

/**
 * Sealed class associated with a result or an error.
 */
sealed class Response {
    class Success<T>(val value: T) : Response()
    class Failure(val error: Throwable) : Response()
}