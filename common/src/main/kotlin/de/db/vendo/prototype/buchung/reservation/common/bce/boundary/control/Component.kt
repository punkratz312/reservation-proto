package de.db.vendo.prototype.buchung.reservation.common.bce.boundary.control

interface Component<Reference> {
    fun execute(reference: Reference)
}
