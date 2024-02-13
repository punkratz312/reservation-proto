package de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.confirm.boundary

import de.db.vendo.prototype.buchung.reservation.common.usecase.UseCase
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.confirm.boundary.ConfirmReservationService
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.boundary.control.entity.ReservationId
import jakarta.enterprise.context.ApplicationScoped
import jakarta.enterprise.inject.Default
import jakarta.inject.Inject
import java.util.*

@ApplicationScoped
class ConfirmUseCase @Inject constructor(
  @field:Default private val confirmReservation: ConfirmReservationService
) : UseCase<UUID> {

  override fun action(input: UUID) {
    confirmReservation.serve(ReservationId(input))
  }
}