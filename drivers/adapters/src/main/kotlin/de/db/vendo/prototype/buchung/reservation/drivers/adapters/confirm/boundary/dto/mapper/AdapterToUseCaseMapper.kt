package de.db.vendo.prototype.buchung.reservation.drivers.adapters.confirm.boundary.dto.mapper

import de.db.vendo.prototype.buchung.reservation.drivers.adapters.confirm.boundary.dto.ConfirmReservationResourceAdapterDTO
import de.db.vendo.prototype.buchung.reservation.drivers.adapters.use_cases.confirm.boundary.dto.ReservationDTO
import org.mapstruct.Mapper

@Mapper
interface AdapterToUseCaseMapper {
  fun toDTO(address: ConfirmReservationResourceAdapterDTO): ReservationDTO
}