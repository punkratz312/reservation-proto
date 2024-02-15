package de.db.vendo.prototype.buchung.reservation.drivers.adapters.use_cases.dto.mapper

import de.db.vendo.prototype.buchung.reservation.drivers.adapters.use_cases.dto.UseCaseDTO
import de.db.vendo.prototype.buchung.reservation.drivers.adapters.use_cases.entities.reservation.boundary.control.entity.Reservation
import org.mapstruct.Mapper

@Mapper
interface UseCaseDTOMapper {
  fun toReservation(addressDTO: UseCaseDTO): Reservation
}