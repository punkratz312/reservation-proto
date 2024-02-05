package de.db.vendo.prototype.buchung.reservation.common.usecase

interface UseCase<Id> {
  fun action(id: Id)
}
