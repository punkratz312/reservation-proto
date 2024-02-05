package de.db.vendo.prototype.buchung.reservation.common.bce.boundary.control

interface Component<Id> {
  fun execute(id: Id)
}
