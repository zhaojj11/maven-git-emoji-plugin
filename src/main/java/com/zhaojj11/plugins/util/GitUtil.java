package com.zhaojj11.plugins.util;

import java.io.File;
import java.util.Arrays;

/**
 * git 工具
 */
public class GitUtil {

    public static final String GIT_HOOKS_PATH = ".git/hooks";
    public static final String COMMIT_MSG = "commit-msg";


    public static boolean isGitProject(File baseDir){
        File[] files = baseDir.listFiles();
        assert files != null;
        return Arrays.stream(files).anyMatch(e -> e.getName().equals(".git"));
    }
}
