package com.zhaojj11.plugins.enums;

import com.zhaojj11.plugins.constant.CommitTypeConstant;

/**
 * commit 类型枚举
 *
 * @author zhaojj11
 * @since 1.0.0
 */
public enum CommitTypeEnum {
    FEAT(CommitTypeConstant.FEAT, "Introducing new features"),
    FIX(CommitTypeConstant.FIX, "Fixing a bug"),
    REFACTOR(CommitTypeConstant.REFACTOR, "Refactoring code (Not Introducing features or fix)"),
    DOCS(CommitTypeConstant.DOCS, "Adding documents"),
    TEST(CommitTypeConstant.TEST, "Adding unit tests or e2e test"),
    PERF(CommitTypeConstant.PERF, "Improving performance"),
    REVERT(CommitTypeConstant.REVERT, "Reverting changes or commits"),
    STYLE(CommitTypeConstant.STYLE, "Updating the UI and style files"),
    BUILD(CommitTypeConstant.BUILD, "Building artifacts"),
    CI(CommitTypeConstant.CI, "Working about CI build system"),
    WIP(CommitTypeConstant.WIP, "Working in progress"),
    CHORE(CommitTypeConstant.CHORE, "Work with configuration or other stuff");

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
