package de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.boundary.control.entity

import org.mapstruct.Mapper

@Mapper
interface ReservationMapper {
  fun toAddressDto(address: Reservation): ReservationDto
  fun toAddress(addressDto: ReservationDto): Reservation
}