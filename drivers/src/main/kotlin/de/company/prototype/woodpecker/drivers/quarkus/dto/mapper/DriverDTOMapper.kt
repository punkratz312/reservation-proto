package de.company.prototype.woodpecker.drivers.quarkus.dto.mapper

import de.company.prototype.woodpecker.drivers.adapters.dto.AdapterDTO
import de.company.prototype.woodpecker.drivers.quarkus.dto.DriverDTO
import org.mapstruct.Mapper
import org.mapstruct.MappingConstants.ComponentModel.JAKARTA_CDI

@Mapper(componentModel = JAKARTA_CDI)
interface DriverDTOMapper {
  fun toDTO(address: DriverDTO): AdapterDTO
}