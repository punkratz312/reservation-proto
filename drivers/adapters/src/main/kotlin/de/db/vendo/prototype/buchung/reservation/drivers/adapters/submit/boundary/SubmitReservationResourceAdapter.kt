package de.db.vendo.prototype.buchung.woodpecker.drivers.adapters.submit.boundary

import de.db.vendo.prototype.buchung.reservation.common.bce.boundary.FunctionalService
import de.db.vendo.prototype.buchung.woodpecker.drivers.adapters.dto.AdapterDTO
import de.db.vendo.prototype.buchung.woodpecker.drivers.adapters.use_cases.persistence.boundary.WoodpeckerRepositoryUseCase
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject

@ApplicationScoped
class GetWoodpeckerResourceAdapter @Inject constructor(
  private val submit: WoodpeckerRepositoryUseCase,
//  private val adapterDTOMapper: AdapterDTOMapper
) : FunctionalService<AdapterDTO, String> {

  override fun serve(input: AdapterDTO): String {
    TODO("Provide the return value")
//    return submit.action(input)
  }
}
