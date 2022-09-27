package udemy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class CodingTest1Test {

    static CodingTest1 cote = new CodingTest1();

    @ParameterizedTest
    @MethodSource("provideIpAndQueries")
    void allocateIP(int ip, String[] queries, String[] expected) {
        assertThat(cote.allocateIP(ip, queries)).isEqualTo(expected);
    }

    private static Stream<Arguments> provideIpAndQueries() {
        return Stream.of(
                Arguments.of(2,
                        new String[]{
                        "desktop1 request",
                        "desktop2 request",
                        "desktop3 request",
                        "desktop3 request",
                        "desktop1 release",
                        "desktop3 request"},
                        new String[]{
                        "desktop1 168.1.0.1",
                        "desktop2 168.1.0.2",
                        "desktop1 rejected",
                        "desktop1 rejected",
                        "desktop3 168.1.0.1"}),
                Arguments.of(3,
                        new String[]{
                        "desktop1 request",
                        "desktop2 request",
                        "desktop3 request",
                        "desktop2 release",
                        "desktop1 release",
                        "desktop2 request",
                        "desktop4 request",
                        "desktop1 request",
                        "desktop3 release",
                        "desktop1 request"},
                        new String[]{
                        "desktop1 168.1.0.1",
                        "desktop2 168.1.0.2",
                        "desktop3 168.1.0.3",
                        "desktop2 168.1.0.2",
                        "desktop4 168.1.0.1",
                        "desktop1 rejected",
                        "desktop1 168.1.0.3"}),
                Arguments.of(5,
                        new String[]{
                                "desktop8 request",
                                "desktop9 request",
                                "desktop10 request",
                                "desktop9 release",
                                "desktop1 request",
                                "desktop2 request",
                                "desktop3 request",
                                "desktop4 request",
                                "desktop10 release",
                                "desktop2 release",
                                "desktop9 request",
                                "desktop1 release",
                                "desktop2 request",
                                "desktop5 request",
                                "desktop6 request",
                                "desktop7 request",
                                "desktop3 release",
                                "desktop7 request"},
                        new String[]{
                                "desktop8 168.1.0.1",
                                "desktop9 168.1.0.2",
                                "desktop10 168.1.0.3",
                                "desktop1 168.1.0.2",
                                "desktop2 168.1.0.4",
                                "desktop3 168.1.0.5",
                                "desktop4 rejected",
                                "desktop9 168.1.0.3",
                                "desktop2 168.1.0.4",
                                "desktop5 168.1.0.2",
                                "desktop6 rejected",
                                "desktop7 rejected",
                                "desktop6 168.1.0.5",})
        );
    }

}