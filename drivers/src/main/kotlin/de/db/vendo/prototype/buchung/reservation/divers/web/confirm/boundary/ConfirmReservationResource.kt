package de.db.vendo.prototype.buchung.reservation.divers.web.confirm.boundary


import de.db.vendo.prototype.buchung.reservation.common.bce.boundary.FunctionalService
import de.db.vendo.prototype.buchung.reservation.divers.adapters.confirm.boundary.ConfirmReservationResourceAdapter
import jakarta.enterprise.context.ApplicationScoped
import jakarta.enterprise.inject.Default
import jakarta.inject.Inject
import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import java.util.*

@ApplicationScoped
@Path("confirm")
class ConfirmReservationResource : FunctionalService<UUID, String> {

  @Inject
  @field: Default
  lateinit var resourceAdapter: ConfirmReservationResourceAdapter

  @GET
  override fun serve(reference: UUID): String {
    return resourceAdapter.serve(UUID.randomUUID())
  }

}