package de.db.vendo.prototype.buchung.reservation.divers.adapters.confirm.boundary

import de.db.vendo.prototype.buchung.reservation.common.bce.boundary.FunctionalService
import jakarta.enterprise.context.ApplicationScoped
import java.util.*

@ApplicationScoped
class ConfirmReservationResourceAdapter : FunctionalService<UUID, String> {

//    @Inject
//    @field: Default
//    lateinit var submit: SubmitUseCase

  override fun serve(reference: UUID): String {
//        submit.action(reference)
    return "SubmitReservationResourceAdapter$reference"
  }

}