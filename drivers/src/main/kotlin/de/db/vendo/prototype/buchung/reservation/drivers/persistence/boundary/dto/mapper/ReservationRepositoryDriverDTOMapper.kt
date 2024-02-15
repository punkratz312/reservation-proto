package de.db.vendo.prototype.buchung.reservation.drivers.adapters.confirm.boundary.dto.mapper

import de.db.vendo.prototype.buchung.reservation.drivers.adapters.confirm.boundary.dto.ConfirmReservationResourceAdapterDTO
import de.db.vendo.prototype.buchung.reservation.drivers.persistence.boundary.dto.ReservationRepositoryDriverDTO
import org.mapstruct.Mapper

@Mapper
interface ReservationRepositoryDriverDTOMapper {
  fun toDTO(address: ConfirmReservationResourceAdapterDTO): ReservationRepositoryDriverDTO
}