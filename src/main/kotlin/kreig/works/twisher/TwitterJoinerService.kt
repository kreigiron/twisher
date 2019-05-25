package kreig.works.twisher

import kreig.works.twisher.twitter.client.TwitterClient
import javax.enterprise.context.ApplicationScoped
import javax.inject.Inject

@ApplicationScoped
open class TwitterJoinerService : JoinerService {
    @Inject lateinit var twitterClient: TwitterClient

    constructor() {

    }

    constructor(twitterClient: TwitterClient) {
        this.twitterClient = twitterClient
    }
    override fun join(url: String) : String {
        return twitterClient.getTwits(url).joinToString("\n")
    }
}