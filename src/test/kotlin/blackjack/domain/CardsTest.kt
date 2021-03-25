package blackjack.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class CardsTest {

    private val cards1 = Cards(
        arrayListOf(
            Card(Number.FIVE to Pattern.SPADE),
            Card(Number.ACE to Pattern.CLOVER),
            Card(Number.FIVE to Pattern.CLOVER)
        )
    )

    private val cards2 = Cards(
        arrayListOf(
            Card(Number.KING to Pattern.SPADE),
            Card(Number.ACE to Pattern.CLOVER),
            Card(Number.KING to Pattern.CLOVER)
        )
    )

    private val duplicatedCards = arrayListOf(
        Card(Number.THREE to Pattern.SPADE),
        Card(Number.EIGHT to Pattern.CLOVER),
        Card(Number.EIGHT to Pattern.CLOVER)
    )

    @Test
    fun `Cards 생성시 중복된 카드가 존재할 경우 Exception 발생`() {
        assertThrows<IllegalStateException> { Cards(duplicatedCards) }
    }

    @Test
    fun `Ace는 최선을 계산하는 지 확인 (11이 되야 하는경우)`() {
        assertThat(cards1.calculateMyCards()).isEqualTo(21)
    }

    @Test
    fun `Ace는 최선을 계산하는 지 확인 (1이 되야 하는경우)`() {
        assertThat(cards2.calculateMyCards()).isEqualTo(21)
    }
}