package de.db.vendo.prototype.buchung.reservation.common.usecase

interface UseCase<Reference> {
    fun action(reference: Reference)
}
