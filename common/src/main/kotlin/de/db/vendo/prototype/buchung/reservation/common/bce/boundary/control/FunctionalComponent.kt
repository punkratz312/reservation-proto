package de.db.vendo.prototype.buchung.reservation.common.bce.boundary.control

interface FunctionalComponent<Reference, Result> {
  fun execute(reference: Reference): Result
}
