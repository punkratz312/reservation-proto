package de.db.vendo.prototype.buchung.reservation.drivers.adapters.dto.mapper

import de.db.vendo.prototype.buchung.reservation.drivers.adapters.dto.AdapterDTO
import de.db.vendo.prototype.buchung.reservation.drivers.adapters.use_cases.dto.UseCaseDTO
import org.mapstruct.Mapper
import org.mapstruct.MappingConstants.ComponentModel.JAKARTA_CDI

@Mapper(componentModel = JAKARTA_CDI)
interface AdapterDTOMapper {
  fun toDTO(adapterDTO: AdapterDTO): UseCaseDTO
}