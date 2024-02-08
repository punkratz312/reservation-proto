package de.db.vendo.prototype.buchung.reservation.common.bce.boundary

interface FunctionalService<Input, Output> {
  fun serve(input: Input): Output
}
