package de.company.prototype.woodpecker.drivers.adapters.submit.boundary

import de.company.prototype.buchung.reservation.common.bce.boundary.FunctionalService
import de.company.prototype.woodpecker.drivers.adapters.dto.AdapterDTO
import de.company.prototype.woodpecker.drivers.adapters.use_cases.persistence.boundary.WoodpeckersUseCase
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject

@ApplicationScoped
class GetWoodpeckerResourceAdapter @Inject constructor(
  private val submit: WoodpeckersUseCase,
//  private val adapterDTOMapper: AdapterDTOMapper
) : FunctionalService<AdapterDTO, String> {

  override fun serve(input: AdapterDTO): String {
    TODO("Provide the return value")
//    return submit.action(input)
  }
}
