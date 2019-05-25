package kreig.works.twisher

import org.hamcrest.core.Is.`is`
import org.junit.Assert
import org.junit.Test
import org.mockito.Mockito.*

class AugmentedTwitResourceTest {

    @Test
    fun testJoin() {
        val joinerService = mock(JoinerService::class.java)
        val url = "ANYURL"
        val expected = "joined"

        `when`(joinerService.join(url)).thenReturn(expected)

        val augmentedTwitResource = AugmentedTwitResource(joinerService)


        val actual = augmentedTwitResource.join(url)

        verify(joinerService).join(url)

        Assert.assertThat(actual, `is`(expected))
    }

}