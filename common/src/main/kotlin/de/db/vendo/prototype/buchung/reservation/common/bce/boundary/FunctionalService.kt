package de.db.vendo.prototype.buchung.reservation.common.bce.boundary

interface FunctionalService<Id, Result> {
  fun serve(id: Id): Result
}
