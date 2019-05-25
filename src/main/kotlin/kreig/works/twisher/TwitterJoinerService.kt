package kreig.works.twisher

import kreig.works.twisher.twitter.client.TwitterClient
import javax.enterprise.context.ApplicationScoped
import javax.inject.Inject

@ApplicationScoped
open class TwitterJoinerService @Inject constructor(private val twitterClient: TwitterClient) : JoinerService {

    override fun join(url: String) : String {
        return twitterClient.getTwits(url).joinToString("\n")
    }
}