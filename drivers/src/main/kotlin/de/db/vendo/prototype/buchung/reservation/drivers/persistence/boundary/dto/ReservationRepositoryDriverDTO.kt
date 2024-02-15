package de.db.vendo.prototype.buchung.reservation.drivers.persistence.boundary.dto

import io.quarkus.hibernate.orm.panache.PanacheEntity
import java.util.*

data class ReservationRepositoryDriverDTO(val id: UUID, val status: String) : PanacheEntity()