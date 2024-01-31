package de.db.vendo.prototype.buchung.reservation.common.bce.boundary

interface Service<Reference> {
    fun serve(reference: Reference)
}
