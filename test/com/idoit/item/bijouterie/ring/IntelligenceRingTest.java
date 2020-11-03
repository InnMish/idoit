package com.idoit.item.bijouterie.ring;

import com.idoit.AbstractTest;
import com.idoit.meta.item.bijouterie.ring.AgilityRingMeta;
import com.idoit.meta.item.bijouterie.ring.IntelligenceRingMeta;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Тесты логики в классе IntelligenceRing")
class IntelligenceRingTest extends AbstractTest {

    @BeforeEach
    void setUp() {
        setMeta(new IntelligenceRingMeta());
    }

    @DisplayName("Тест, что класс IntelligenceRing находится в пакете com.idoit.item.bijouterie.ring")
    @Test
    void testIntelligenceRingIsInBeltPackage() {
        testClassIsInPackage();
    }

    @DisplayName("Тест, что класс IntelligenceRing имеет все необходимые поля")
    @Test
    void testIntelligenceRingHasAllFields() {
        testClassHasFields();
    }
}
