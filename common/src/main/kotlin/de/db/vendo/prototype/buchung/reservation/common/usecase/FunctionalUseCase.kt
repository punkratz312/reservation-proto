package de.db.vendo.prototype.buchung.reservation.common.usecase

interface FunctionalUseCase<Id, Result> {
  fun action(id: Id): Result
}
