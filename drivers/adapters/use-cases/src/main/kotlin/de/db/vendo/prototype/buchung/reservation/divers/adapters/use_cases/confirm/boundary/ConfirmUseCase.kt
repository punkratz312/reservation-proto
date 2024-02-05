package de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.confirm.boundary

import de.db.vendo.prototype.buchung.reservation.common.usecase.UseCase
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.confirm.boundary.ConfirmReservationService
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.boundary.control.entity.ReservationId
import jakarta.enterprise.context.ApplicationScoped
import jakarta.enterprise.inject.Default
import jakarta.inject.Inject
import java.util.*

@ApplicationScoped
class ConfirmUseCase : UseCase<UUID> {

  @Inject
  @field: Default
  lateinit var confirmReservation: ConfirmReservationService

  override fun action(id: UUID) {
    confirmReservation.serve(ReservationId(id))
  }
}