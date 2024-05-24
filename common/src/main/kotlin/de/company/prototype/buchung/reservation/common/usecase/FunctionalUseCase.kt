package de.company.prototype.buchung.reservation.common.usecase

interface FunctionalUseCase<Input, Output> {
  fun action(input: Input): Output
}
