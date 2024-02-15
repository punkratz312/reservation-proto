package de.db.vendo.prototype.buchung.reservation.drivers.web.confirm.boundary.dto.mapper

import de.db.vendo.prototype.buchung.reservation.drivers.adapters.confirm.boundary.dto.ConfirmReservationResourceAdapterDTO
import de.db.vendo.prototype.buchung.reservation.drivers.web.confirm.boundary.dto.ConfirmReservationResourceDTO
import org.mapstruct.Mapper

@Mapper
interface ConfirmReservationResourceDTOMapper {
  fun toDTO(addressDTO: ConfirmReservationResourceDTO): ConfirmReservationResourceAdapterDTO
}


