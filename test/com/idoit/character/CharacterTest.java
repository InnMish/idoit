package com.idoit.character;

import com.idoit.AbstractTest;
import com.idoit.meta.character.CharacterMeta;
import com.idoit.meta.item.weapon.WeaponMeta;

abstract class CharacterTest extends AbstractTest {

    void testCharacterInPackage(String className) {
        testClassIsInPackage(className);
    }

    @Override
    protected String getPackageName() {
        return CharacterMeta.PACKAGE_NAME;
    }
}
