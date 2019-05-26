package kreig.works.twisher.twitter.client

import org.eclipse.microprofile.config.inject.ConfigProperty
import org.slf4j.LoggerFactory
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
open class TwitterClient {

    var logger = LoggerFactory.getLogger(TwitterClient::class.java)

    @ConfigProperty(name = "twitter.access.token")
    lateinit var accessToken: String

    @ConfigProperty(name = "twitter.access.token.secret")
    lateinit var secretToken: String


    fun getTwits(url: String): List<String> {

        logger.info("Accessing $url with $accessToken")


        val twits = ArrayList<String>()
        return twits

    }
}