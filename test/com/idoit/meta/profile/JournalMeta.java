package com.idoit.meta.profile;

import com.idoit.meta.Meta;
import com.idoit.meta.knowledge.KnowledgeMeta;
import com.idoit.meta.quest.QuestMeta;

public class JournalMeta extends Meta {
    public JournalMeta() {
        packageName = BASE_PACKAGE + ".profile";
        className = "Journal";
    }

    @Override
    protected void initFields() throws ClassNotFoundException {
        addMetaField("knowledge", KnowledgeMeta.class);
        addMetaField("quest", QuestMeta.class);
    }

    @Override
    protected void initSetters() throws ClassNotFoundException {
        addMethod(void.class, "setKnowledge", KnowledgeMeta.class);
        addMethod(void.class, "setQuest", QuestMeta.class);
    }

    @Override
    protected void initGetters() throws ClassNotFoundException {
        addMethod(KnowledgeMeta.class, "getKnowledge");
        addMethod(QuestMeta.class, "getQuest");
    }
}
