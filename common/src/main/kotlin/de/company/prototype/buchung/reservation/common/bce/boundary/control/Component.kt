package de.company.prototype.buchung.reservation.common.bce.boundary.control

interface Component<Input> {
  fun execute(input: Input)
}
