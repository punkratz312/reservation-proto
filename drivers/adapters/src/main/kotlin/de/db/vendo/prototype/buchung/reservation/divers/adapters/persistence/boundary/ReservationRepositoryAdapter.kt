package de.db.vendo.prototype.buchung.reservation.divers.adapters.persistence.boundary

import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.persistence.boundary.ReservationRepositoryUseCase
import jakarta.inject.Inject

class ReservationRepositoryAdapter @Inject constructor(private val submit: ReservationRepositoryUseCase)