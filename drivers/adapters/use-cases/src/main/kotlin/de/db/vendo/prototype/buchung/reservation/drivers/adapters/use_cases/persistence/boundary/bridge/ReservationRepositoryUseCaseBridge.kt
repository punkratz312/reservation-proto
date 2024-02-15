package de.db.vendo.prototype.buchung.reservation.drivers.adapters.use_cases.persistence.boundary.bridge

import de.db.vendo.prototype.buchung.reservation.drivers.adapters.use_cases.dto.UseCaseDTO
import java.util.*

interface ReservationRepositoryUseCaseBridge {

  fun findBy(input: UUID): Optional<UseCaseDTO>

  fun save(reservation: UseCaseDTO): UseCaseDTO

  fun submit(input: UUID)

  fun confirm(input: UUID)

  fun reset(input: UUID)

}
