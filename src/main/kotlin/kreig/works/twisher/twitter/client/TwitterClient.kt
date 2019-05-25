package kreig.works.twisher.twitter.client

import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
open class TwitterClient {

    fun getTwits(url: String): List<String> {
        val twits = ArrayList<String>()
        return twits
    }
}