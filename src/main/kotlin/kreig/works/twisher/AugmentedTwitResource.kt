package kreig.works.twisher

import javax.inject.Inject
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.QueryParam
import javax.ws.rs.core.MediaType

@Path("/augmentedTwit")
class AugmentedTwitResource @Inject constructor(private val joinerService: JoinerService) {

    @GET @Produces(MediaType.TEXT_PLAIN)
    fun join(@QueryParam("url") url: String) : String {
        return joinerService.join(url)
    }
}
