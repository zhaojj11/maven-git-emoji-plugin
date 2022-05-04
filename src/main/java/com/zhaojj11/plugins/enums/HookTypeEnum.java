package com.zhaojj11.plugins.enums;

/**
 * hook 类型枚举
 *
 * @author zhaojj11
 * @since 1.0.0
 */
public enum HookTypeEnum {
    COMMIT_MSG("commit-msg"),
    PRE_COMMIT("pre-commit");

    private final String fileName;

    HookTypeEnum(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }
}
