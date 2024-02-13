package de.db.vendo.prototype.buchung.reservation.divers.adapters.persistence.boundary

import de.db.vendo.prototype.buchung.reservation.divers.adapters.persistence.boundary.bridge.ReservationRepositoryAdapterBridge
import jakarta.enterprise.context.ApplicationScoped
import jakarta.enterprise.inject.Default
import jakarta.inject.Inject

@ApplicationScoped
class ReservationRepositoryAdapter {

  @Inject
  @field: Default
  lateinit var bridge: ReservationRepositoryAdapterBridge

}