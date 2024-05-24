package de.company.prototype.woodpecker.drivers.adapters.use_cases.dto.mapper

import de.company.prototype.woodpecker.drivers.adapters.use_cases.dto.UseCaseDTO
import de.company.prototype.woodpecker.drivers.adapters.use_cases.entities.woodpecker.boundary.control.entity.Woodpecker

import org.mapstruct.Mapper
import org.mapstruct.MappingConstants.ComponentModel.JAKARTA_CDI

@Mapper(componentModel = JAKARTA_CDI)
interface UseCaseDTOMapper {
  fun toReservation(addressDTO: UseCaseDTO): Woodpecker
}