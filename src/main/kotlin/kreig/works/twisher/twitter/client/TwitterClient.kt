package kreig.works.twisher.twitter.client

import io.ktor.client.HttpClient
import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.features.json.JsonFeature
import org.eclipse.microprofile.config.inject.ConfigProperty
import org.slf4j.LoggerFactory
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
open class TwitterClient (httpClientEngine: HttpClientEngine?) {

    var logger = LoggerFactory.getLogger(TwitterClient::class.java)

    @ConfigProperty(name = "twitter.bearer.token")
    var actualBearerToken: String? = null

    val client= HttpClient(httpClientEngine!!) {
        install(JsonFeature) {
            serializer = KotlinxSerializer()
        }
    }


    fun getTwits(url: String, bearerToken: String): List<String> {

        val actualBearerToken = if (this.actualBearerToken == null) actualBearerToken else this.actualBearerToken

        val twits = ArrayList<String>()
        return twits

    }
}