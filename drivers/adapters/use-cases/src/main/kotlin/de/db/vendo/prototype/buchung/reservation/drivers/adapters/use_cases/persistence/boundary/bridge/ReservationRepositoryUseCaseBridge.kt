package de.db.vendo.prototype.buchung.reservation.drivers.adapters.use_cases.persistence.boundary.bridge

import de.db.vendo.prototype.buchung.reservation.drivers.adapters.use_cases.confirm.boundary.dto.ReservationDTO
import java.util.*

interface ReservationRepositoryUseCaseBridge {

  fun findBy(input: UUID): Optional<ReservationDTO>

  fun save(reservation: ReservationDTO): ReservationDTO

  fun submit(input: UUID)

  fun confirm(input: UUID)

  fun reset(input: UUID)

}
