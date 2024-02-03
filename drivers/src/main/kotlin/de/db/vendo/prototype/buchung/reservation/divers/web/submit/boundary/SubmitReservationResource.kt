package de.db.vendo.prototype.buchung.reservation.divers.web.submit.boundary

import de.db.vendo.prototype.buchung.reservation.common.bce.boundary.FunctionalService
import de.db.vendo.prototype.buchung.reservation.divers.adapters.submit.boundary.SubmitReservationResourceAdapter
import jakarta.enterprise.context.ApplicationScoped
import jakarta.enterprise.inject.Default
import jakarta.inject.Inject
import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import java.util.*

@ApplicationScoped
@Path("submit")
class SubmitReservationResource : FunctionalService<UUID, String> {

  @Inject
  @field: Default
  lateinit var resourceAdapter: SubmitReservationResourceAdapter

  @GET
  override fun serve(reference: UUID): String {
    return resourceAdapter.serve(UUID.randomUUID())
  }
}