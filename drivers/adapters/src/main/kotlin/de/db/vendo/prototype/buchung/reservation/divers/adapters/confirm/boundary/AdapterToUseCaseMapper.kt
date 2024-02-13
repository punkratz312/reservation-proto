package de.db.vendo.prototype.buchung.reservation.divers.adapters.confirm.boundary

import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.confirm.boundary.UseCaseDto
import org.mapstruct.Mapper

@Mapper
interface AdapterToUseCaseMapper {
  fun toDto(address: ConfirmReservationResourceAdapterDto): UseCaseDto
}


