package de.db.vendo.prototype.buchung.reservation.common.usecase

interface UseCase<Input> {
  fun action(input: Input)
}
