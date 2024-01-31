package de.db.vendo.prototype.buchung.reservation.divers.web.submit.boundary

import de.db.vendo.prototype.buchung.reservation.common.bce.boundary.Service2
import jakarta.enterprise.context.ApplicationScoped
import java.util.*

@ApplicationScoped
class SubmitReservationResourceAdapter2 : Service2<UUID, UUID> {

//    @Inject
//    @field: Default
//    lateinit var submit: SubmitUseCase

    override fun serve(reference: UUID): UUID {
//        submit.action(reference)
        return UUID.randomUUID()
    }

}