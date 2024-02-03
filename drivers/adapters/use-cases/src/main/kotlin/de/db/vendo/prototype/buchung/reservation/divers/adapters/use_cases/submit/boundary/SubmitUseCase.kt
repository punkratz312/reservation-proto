package de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.submit.boundary

import de.db.vendo.prototype.buchung.reservation.common.usecase.UseCase
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.boundary.control.entity.ReservationId
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.submit.boundary.SubmitReservationService
import jakarta.enterprise.context.ApplicationScoped
import jakarta.enterprise.inject.Default
import jakarta.inject.Inject
import java.util.*

@ApplicationScoped
class SubmitUseCase : UseCase<UUID> {

  @Inject
  @field: Default
  lateinit var submitReservation: SubmitReservationService

  override fun action(reference: UUID) {
    submitReservation.serve(ReservationId(reference))
  }
}