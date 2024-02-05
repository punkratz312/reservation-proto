package de.db.vendo.prototype.buchung.reservation.common.bce.boundary

interface Service<Id> {
  fun serve(id: Id)
}
