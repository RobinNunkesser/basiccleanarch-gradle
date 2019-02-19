package de.hshl.isd.basiccleanarch

/**
 * A `Presenter` is used to get a ViewModel from Entities or other Models.
 */
interface Presenter<Entity, ViewModel> {
    /**
     * Takes data from an Entity or another Model and returns a ViewModel.
     *
     * @param model the model to present.
     * @return the ViewModel.
     */
    fun present(model: Entity): ViewModel
}