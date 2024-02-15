package de.db.vendo.prototype.buchung.reservation.drivers.adapters.use_cases.confirm.boundary.dto

import de.db.vendo.prototype.buchung.reservation.drivers.adapters.use_cases.entities.reservation.boundary.control.entity.Reservation
import org.mapstruct.Mapper

@Mapper
interface ReservationMapper {
  fun toReservation(addressDTO: ReservationDTO): Reservation
}