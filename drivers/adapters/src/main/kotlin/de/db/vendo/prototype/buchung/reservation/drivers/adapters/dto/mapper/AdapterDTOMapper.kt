package de.db.vendo.prototype.buchung.reservation.drivers.adapters.dto.mapper

import de.db.vendo.prototype.buchung.reservation.drivers.adapters.dto.AdapterDTO
import de.db.vendo.prototype.buchung.reservation.drivers.adapters.use_cases.dto.UseCaseDTO
import org.mapstruct.Mapper

@Mapper
interface AdapterDTOMapper {
  fun toDTO(adapterDTO: AdapterDTO): UseCaseDTO
}