package de.db.vendo.prototype.buchung.reservation.divers.adapters.confirm.boundary

import org.mapstruct.Mapper

@Mapper
interface AdapterToUseCaseMapper {
  fun toDto(address: ConfirmReservationResourceAdapterDto): ConfirmReservationResourceDto
  fun to(addressDto: ConfirmReservationResourceDto): ConfirmReservationResourceAdapterDto
}


