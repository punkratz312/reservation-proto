package de.db.vendo.prototype.buchung.reservation.divers.persistence.boundary

import de.db.vendo.prototype.buchung.reservation.divers.adapters.persistence.boundary.ReservationRepositoryAdapter
import io.quarkus.hibernate.orm.panache.PanacheRepository
import jakarta.inject.Inject
import java.util.*

class ReservationRepositoryDriver @Inject constructor(val submit: ReservationRepositoryAdapter) : PanacheRepository<UUID>