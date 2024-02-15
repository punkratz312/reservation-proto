package de.db.vendo.prototype.buchung.reservation.drivers.dto

import io.quarkus.hibernate.orm.panache.PanacheEntity
import java.util.*

data class DriverDTO(val id: UUID, val status: String) : PanacheEntity()