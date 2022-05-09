package com.zhaojj11.plugins.util;

import com.zhaojj11.plugins.enums.HookTypeEnum;
import org.apache.maven.plugin.MojoFailureException;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * git 工具
 *
 * @author zhaojj11
 * @since 1.0.0
 */
public class GitUtil {

    public static final String GIT_HOOKS_PATH = ".git/hooks";
    public static final String COMMIT_MSG = "commit-msg";


    /**
     * 判断当前目录是否是git项目
     *
     * @param baseDir 当前目录
     * @return 是否是git项目
     */
    public static boolean isGitProject(File baseDir) {
        File[] files = baseDir.listFiles();
        assert files != null;
        return Arrays.stream(files).anyMatch(e -> e.getName().equals(".git"));
    }

    /**
     * 创建hook
     *
     * @param hookTypeEnum hook类型
     * @param basedir      当前目录
     * @throws MojoFailureException mojo异常
     */
    public static void createHook(HookTypeEnum hookTypeEnum, File basedir) throws MojoFailureException {
        if (!GitUtil.isGitProject(basedir)) {
            throw new MojoFailureException("this project is not git");
        }

        // 创建 commit-msg文件 ${project.basedir}/.git/hooks/commit-msg
        String commitMsgHookPath = basedir.getAbsoluteFile() + File.separator + GitUtil.GIT_HOOKS_PATH + File.separator + hookTypeEnum.getFileName();

        File commitMsgHookFile = new File(commitMsgHookPath);

        // 如果文件存在，则删除
        if (commitMsgHookFile.exists()) {
            boolean isDeleted = commitMsgHookFile.delete();
        }

        try {
            boolean isCreated = commitMsgHookFile.createNewFile();
        } catch (IOException e) {
            throw new MojoFailureException("failed when create " + commitMsgHookPath);
        }

        try (FileOutputStream fos = new FileOutputStream(commitMsgHookPath, true)) {
            //true表示在文件末尾追加
            fos.write(hookTypeEnum.getCommand().getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
