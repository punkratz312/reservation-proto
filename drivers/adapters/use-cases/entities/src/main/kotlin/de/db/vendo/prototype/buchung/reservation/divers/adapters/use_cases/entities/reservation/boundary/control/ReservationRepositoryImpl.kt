//package de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.boundary.control
//
//import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.boundary.control.entity.Reservation
//import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.boundary.control.entity.ReservationId
//import jakarta.enterprise.context.ApplicationScoped
//import java.util.*
//import java.util.Optional.of
//
//@ApplicationScoped
//class ReservationRepositoryImpl : ReservationRepository {
//
//  private val map = HashMap<UUID, Reservation>();
//
//  override fun findBy(input: ReservationId): Optional<Reservation> {
//    return of(map[input.id])
//  }
//
//  override fun save(reservation: Reservation): Reservation {
//    map[reservation.id.id] = reservation
//    return map[reservation.id.id]!!
//  }
//
//  override fun submit(input: ReservationId) {
//    TODO("Not yet implemented")
//  }
//
//  override fun confirm(input: ReservationId) {
//    TODO("Not yet implemented")
//  }
//
//  override fun reset(input: ReservationId) {
//    TODO("Not yet implemented")
//  }
//
//}