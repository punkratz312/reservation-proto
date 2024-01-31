package de.db.vendo.prototype.buchung.reservation.common.bce.boundary

interface Service2<Reference, Result> {
    fun serve(reference: Reference): Result
}
