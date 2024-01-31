package de.db.vendo.prototype.buchung.reservation.divers.web.submit.boundary

import de.db.vendo.prototype.buchung.reservation.divers.adapters.submit.boundary.SubmitReservationResourceAdapter
import jakarta.enterprise.context.ApplicationScoped
import jakarta.enterprise.inject.Default
import jakarta.inject.Inject
import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import java.util.*

@ApplicationScoped
@Path("submit")
class SubmitReservationResource {

    @Inject
    @field: Default
    lateinit var resourceAdapter: SubmitReservationResourceAdapter

//    @Funq
//    override fun serve(reference: UUID): UUID {
//        return resourceAdapter.serve(reference)
//    }

    @GET
    fun serve(): String {
//        return UUID.randomUUID().toString()
        return resourceAdapter.serve(UUID.randomUUID()).toString()
    }
}