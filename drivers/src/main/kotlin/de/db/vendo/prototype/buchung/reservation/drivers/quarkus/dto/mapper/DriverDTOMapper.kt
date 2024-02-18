package de.db.vendo.prototype.buchung.reservation.drivers.quarkus.dto.mapper

import de.db.vendo.prototype.buchung.reservation.drivers.adapters.dto.AdapterDTO
import de.db.vendo.prototype.buchung.reservation.drivers.quarkus.dto.DriverDTO
import org.mapstruct.Mapper
import org.mapstruct.MappingConstants.ComponentModel.JAKARTA_CDI

@Mapper(componentModel = JAKARTA_CDI)
interface DriverDTOMapper {
  fun toDTO(address: DriverDTO): AdapterDTO
}