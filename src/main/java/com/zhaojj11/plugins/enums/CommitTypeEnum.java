package com.zhaojj11.plugins.enums;

import com.zhaojj11.plugins.constant.Constant;

public enum CommitTypeEnum {
    FEAT(Constant.FEAT, "Introducing new features"),
    FIX(Constant.FIX, "Fixing a bug"),
    REFACTOR(Constant.REFACTOR, "Refactoring code (Not Introducing features or fix)"),
    DOCS(Constant.DOCS, "Adding documents"),
    TEST(Constant.TEST, "Adding unit tests or e2e test"),
    PERF(Constant.PERF, "Improving performance"),
    REVERT(Constant.REVERT, "Reverting changes or commits"),
    STYLE(Constant.STYLE, "Updating the UI and style files"),
    BUILD(Constant.BUILD, "Building artifacts"),
    CI(Constant.CI, "Working about CI build system"),
    WIP(Constant.WIP, "Working in progress"),
    CHORE(Constant.CHORE, "Work with configuration or other stuff")
    ;

    private final String type;
    private final String description;

    CommitTypeEnum(String type, String description) {
        this.type = type;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }
}
