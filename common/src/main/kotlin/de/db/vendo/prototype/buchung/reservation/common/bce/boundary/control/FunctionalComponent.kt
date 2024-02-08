package de.db.vendo.prototype.buchung.reservation.common.bce.boundary.control

interface FunctionalComponent<Input, Output> {
  fun execute(input: Input): Output
}
