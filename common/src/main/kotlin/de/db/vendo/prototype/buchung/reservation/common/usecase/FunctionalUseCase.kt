package de.db.vendo.prototype.buchung.reservation.common.usecase

interface FunctionalUseCase<Reference, Result> {
  fun action(reference: Reference): Result
}
