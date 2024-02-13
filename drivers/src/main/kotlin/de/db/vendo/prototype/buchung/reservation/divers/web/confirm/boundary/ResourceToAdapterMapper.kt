package de.db.vendo.prototype.buchung.reservation.divers.web.confirm.boundary

import de.db.vendo.prototype.buchung.reservation.divers.adapters.confirm.boundary.ConfirmReservationResourceAdapterDto
import org.mapstruct.Mapper

@Mapper
interface ResourceToAdapterMapper {
  fun toDto(address: ConfirmReservationResourceAdapterDto): ConfirmReservationResourceDto
  fun to(addressDto: ConfirmReservationResourceDto): ConfirmReservationResourceAdapterDto
}


