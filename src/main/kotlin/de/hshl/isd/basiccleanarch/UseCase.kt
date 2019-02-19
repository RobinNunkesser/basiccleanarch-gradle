package de.hshl.isd.basiccleanarch

/**
 * A `UseCase` is typically implemented by an interactor.
 * It executes the business logic of the use case.
 */
interface UseCase<Request, Entity, ViewModel> {
    val presenter: Presenter<Entity, ViewModel>

    /**
     * Executes the UseCase.
     *
     * @param request encapsulated request parameters.
     * @param displayer the Displayer to use for the result.
     */
    fun execute(request: Request, displayer: Displayer)
}