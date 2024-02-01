package de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.persistence.boundary

import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.boundary.control.ReservationRepository
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.persistence.boundary.bridge.ReservationRepositoryUseCaseBridge

abstract class ReservationRepositoryUseCase : ReservationRepository, ReservationRepositoryUseCaseBridge