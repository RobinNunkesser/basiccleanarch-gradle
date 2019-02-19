package de.hshl.isd.basiccleanarch

/**
 * A `Displayer` is used to display the result of a use case that
 * changes the displayed view.
 */
interface Displayer {

    /**
     * Displays data from a ViewModel or an Error.
     *
     * @param result the result to display.
     */
    fun display(result: Response)
}
