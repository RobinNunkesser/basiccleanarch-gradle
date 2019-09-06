package de.hshl.isd.basiccleanarch

/**
 * A `Displayer` is used to display the result of a use case that
 * changes the displayed view.
 */
interface Displayer<ViewModel> {

    /**
     * Displays data from a ViewModel.
     *
     * @param success the result to display.
     */
    fun display(success: ViewModel)

    /**
     * Displays an Error.
     *
     * @param error the error to display.
     */
    fun display(error: Throwable)

}
