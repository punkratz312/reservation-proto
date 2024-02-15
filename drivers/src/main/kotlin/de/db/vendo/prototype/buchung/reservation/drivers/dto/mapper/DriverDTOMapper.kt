package de.db.vendo.prototype.buchung.reservation.drivers.dto.mapper

import de.db.vendo.prototype.buchung.reservation.drivers.adapters.dto.AdapterDTO
import de.db.vendo.prototype.buchung.reservation.drivers.dto.DriverDTO
import org.mapstruct.Mapper

@Mapper
interface DriverDTOMapper {
  fun toDTO(address: DriverDTO): AdapterDTO
}