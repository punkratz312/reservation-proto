package de.db.vendo.prototype.buchung.reservation.common.bce.boundary.control

interface FunctionalComponent<Id, Result> {
  fun execute(id: Id): Result
}
