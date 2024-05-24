package de.company.prototype.buchung.reservation.common.bce.boundary

interface Service<Input> {
  fun serve(input: Input)
}
