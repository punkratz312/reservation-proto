package de.company.prototype.woodpecker.drivers.adapters.dto.mapper

import de.company.prototype.woodpecker.drivers.adapters.dto.AdapterDTO
import de.company.prototype.woodpecker.drivers.adapters.use_cases.dto.UseCaseDTO
import org.mapstruct.Mapper
import org.mapstruct.MappingConstants.ComponentModel.JAKARTA_CDI

@Mapper(componentModel = JAKARTA_CDI)
interface AdapterDTOMapper {
  fun toDTO(adapterDTO: AdapterDTO): UseCaseDTO
}