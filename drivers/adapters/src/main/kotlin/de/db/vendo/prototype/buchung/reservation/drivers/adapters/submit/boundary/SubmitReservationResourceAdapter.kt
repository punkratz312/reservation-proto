package de.db.vendo.prototype.buchung.reservation.drivers.adapters.submit.boundary

import de.db.vendo.prototype.buchung.reservation.common.bce.boundary.FunctionalService
import de.db.vendo.prototype.buchung.reservation.drivers.adapters.dto.AdapterDTO
import de.db.vendo.prototype.buchung.reservation.drivers.adapters.use_cases.submit.boundary.SubmitUseCase
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject

@ApplicationScoped
class SubmitReservationResourceAdapter @Inject constructor(
  private val submit: SubmitUseCase,
//  private val adapterDTOMapper: AdapterDTOMapper
) : FunctionalService<AdapterDTO, String> {

  override fun serve(input: AdapterDTO): String {
    TODO("Provide the return value")
//    return submit.action(input)
  }
}
