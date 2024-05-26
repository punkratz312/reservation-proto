package de.company.prototype.woodpecker.drivers.quarkus.web.boundary

import com.fasterxml.jackson.databind.ObjectMapper
import de.company.prototype.woodpecker.common.bce.boundary.OutputService
import de.company.prototype.woodpecker.drivers.adapters.submit.boundary.FindAllHawksResourceAdapter
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject
import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType.APPLICATION_JSON

@ApplicationScoped
@Path("woodpeckers/findAllHawks")
@Produces(APPLICATION_JSON)
class FindAllHawksResource @Inject constructor(
  private val resourceAdapter: FindAllHawksResourceAdapter,
  private val objectMapper: ObjectMapper
) : OutputService<String> {

  @GET
  override fun serve(): String {
    return objectMapper.writeValueAsString(map(resourceAdapter.serve()))
  }

  private fun map(serve: Set<Any>) =
    mapOf(
      Pair("size", serve.size),
      Pair("hawks", serve))
}
