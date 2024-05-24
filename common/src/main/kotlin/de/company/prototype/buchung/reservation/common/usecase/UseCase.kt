package de.company.prototype.buchung.reservation.common.usecase

interface UseCase<Input> {
  fun action(input: Input)
}
