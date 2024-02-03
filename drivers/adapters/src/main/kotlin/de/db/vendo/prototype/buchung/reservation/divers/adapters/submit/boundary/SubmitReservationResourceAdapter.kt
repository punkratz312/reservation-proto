package de.db.vendo.prototype.buchung.reservation.divers.adapters.submit.boundary

import de.db.vendo.prototype.buchung.reservation.common.bce.boundary.FunctionalService
import jakarta.enterprise.context.ApplicationScoped
import java.util.*

@ApplicationScoped
class SubmitReservationResourceAdapter : FunctionalService<UUID, String> {

//    @Inject
//    @field: Default
//    lateinit var submit: SubmitUseCase

  override fun serve(reference: UUID): String {
//        submit.action(reference)
    return "SubmitReservationResourceAdapter$reference"
  }

}