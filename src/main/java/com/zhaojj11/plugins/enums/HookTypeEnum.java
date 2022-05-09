package com.zhaojj11.plugins.enums;

import com.zhaojj11.plugins.constant.CommandConstant;

/**
 * hook 类型枚举
 *
 * @author zhaojj11
 * @since 1.0.0
 */
public enum HookTypeEnum {
    COMMIT_MSG("commit-msg", CommandConstant.COMMIT_MSG),
    PRE_COMMIT("pre-commit", CommandConstant.PRE_COMMIT);

    private final String fileName;
    private final String command;

    HookTypeEnum(String fileName, String command) {
        this.fileName = fileName;
        this.command = command;
    }

    public String getFileName() {
        return fileName;
    }

    public String getCommand() {
        return command;
    }
}
