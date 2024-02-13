package de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.reset.boundary

import de.db.vendo.prototype.buchung.reservation.common.usecase.UseCase
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.boundary.control.entity.ReservationId
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reset.boundary.ResetReservationService
import jakarta.enterprise.context.ApplicationScoped
import jakarta.enterprise.inject.Default
import jakarta.inject.Inject
import java.util.*

@ApplicationScoped
class ResetUseCase : UseCase<UUID> {

  @Inject
  @field: Default
  lateinit var resetReservation: ResetReservationService

  override fun action(input: UUID) {
    resetReservation.serve(ReservationId(input))
  }
}
