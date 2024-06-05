package com.leultewolde.demolibrary;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StringPadderImplTest {

    private final StringPadderImpl stringPadder = new StringPadderImpl();

    @Test
    void padLeft() {
        assertThat(stringPadder.padLeft("leultewolde.com", 20))
                .isEqualTo("     leultewolde.com");
    }

    @Test
    void padLeftWithZeros() {
        assertThat(stringPadder.padLeft("leultewolde.com", 20, '0'))
                .isEqualTo("00000leultewolde.com");
    }

    @Test
    void padRight() {
        assertThat(stringPadder.padRight("leultewolde.com", 20))
                .isEqualTo("leultewolde.com     ");
    }

    @Test
    void padRightWithZeros() {
        assertThat(stringPadder.padRight("leultewolde.com", 20, '0'))
                .isEqualTo("leultewolde.com00000");
    }

    @Test
    void padLeftWithInvalidTotalLength() {
        assertThat(stringPadder.padLeft("leultewolde.com", 3))
                .isEqualTo("leultewolde.com");
    }

    @Test
    void padLeftWithZerosInvalidTotalLength() {
        assertThat(stringPadder.padLeft("leultewolde.com", 3, '0'))
                .isEqualTo("leultewolde.com");
    }

    @Test
    void padRightInvalidTotalLength() {
        assertThat(stringPadder.padRight("leultewolde.com", 3))
                .isEqualTo("leultewolde.com");
    }

    @Test
    void padRightWithZerosInvalidTotalLength() {
        assertThat(stringPadder.padRight("leultewolde.com", 3, '0'))
                .isEqualTo("leultewolde.com");
    }

}
