package com.zhaojj11.plugins.util;

import java.io.File;
import java.util.Arrays;

/**
 * git 工具
 */
public class GitUtil {
    public static boolean isGitProject(File baseDir){
        File[] files = baseDir.listFiles();
        assert files != null;
        return Arrays.stream(files).anyMatch(e -> e.getName().equals(".git"));
    }
}
