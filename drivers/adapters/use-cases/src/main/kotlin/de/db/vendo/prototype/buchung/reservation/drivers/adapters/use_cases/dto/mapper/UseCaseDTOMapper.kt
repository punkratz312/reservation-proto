package de.db.vendo.prototype.buchung.woodpecker.drivers.adapters.use_cases.dto.mapper

import de.db.vendo.prototype.buchung.woodpecker.drivers.adapters.use_cases.dto.UseCaseDTO
import de.db.vendo.prototype.buchung.woodpecker.drivers.adapters.use_cases.entities.reservation.boundary.control.entity.Reservation
import org.mapstruct.Mapper
import org.mapstruct.MappingConstants.ComponentModel.JAKARTA_CDI

@Mapper(componentModel = JAKARTA_CDI)
interface UseCaseDTOMapper {
  fun toReservation(addressDTO: UseCaseDTO): Reservation
}