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
     * @param requestCode optional requestCode to distinguish similar requests
     */
    fun display(success: ViewModel, requestCode: Int = 0)

    /**
     * Displays an Error.
     *
     * @param error the error to display.
     */
    fun display(error: Throwable)

}
