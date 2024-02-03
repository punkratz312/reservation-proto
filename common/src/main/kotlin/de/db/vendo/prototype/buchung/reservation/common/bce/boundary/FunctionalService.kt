package de.db.vendo.prototype.buchung.reservation.common.bce.boundary

interface FunctionalService<Reference, Result> {
  fun serve(reference: Reference): Result
}
