package de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.boundary.control

import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.boundary.control.entity.Reservation
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.boundary.control.entity.ReservationId
import jakarta.enterprise.context.ApplicationScoped
import java.util.*
import java.util.Optional.ofNullable

@ApplicationScoped
class ReservationRepositoryImpl : ReservationRepository {

  private val map = HashMap<UUID, Reservation>();

  override fun findBy(id: ReservationId): Optional<Reservation> {
    return ofNullable(map[id.id])
  }

  override fun save(reservation: Reservation): Reservation {
    map[reservation.id.id] = reservation
    return map[reservation.id.id]!!
  }

  override fun submit(id: ReservationId) {
    TODO("Not yet implemented")
  }

  override fun confirm(id: ReservationId) {
    TODO("Not yet implemented")
  }

  override fun reset(id: ReservationId) {
    TODO("Not yet implemented")
  }

}