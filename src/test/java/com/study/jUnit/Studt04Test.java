package com.study.jUnit;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class Studt04Test {

    @Test
    @DisplayName("우와와와왕 우왕굳!")
    void create_new_start() {
        Studt04 study = new Studt04();
        assertNotNull(study);
        System.out.println("create");
    }

    @Test
    @Disabled
    void create1() {
        System.out.println("create1");
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("before all");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("after all");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("before Each");
    }

    @AfterEach
    void afterEach() {
        System.out.println("after Each");
    }
}