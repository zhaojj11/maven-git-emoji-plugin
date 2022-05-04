package com.zhaojj11.plugins;

import com.zhaojj11.plugins.util.GitUtil;
import com.zhaojj11.plugins.util.UsageUtil;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugin.descriptor.PluginDescriptor;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.plugins.annotations.ResolutionScope;
import org.apache.maven.project.MavenProject;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

@Mojo(name = "create-commit-msg", defaultPhase = LifecyclePhase.PREPARE_PACKAGE, requiresDependencyResolution = ResolutionScope.NONE)
public class CreateCommitMsgMojo extends AbstractMojo {
    @Parameter(defaultValue = "${project}", readonly = true)
    private MavenProject project;

    @Parameter(defaultValue = "${project.basedir}", readonly = true)
    private File basedir;

    @Parameter(defaultValue = "${plugin}", readonly = true)
    private PluginDescriptor pluginDescriptor;

    @Override
    public void execute() throws MojoFailureException {
        UsageUtil.logHelpUsage(getLog(), project, pluginDescriptor, basedir);

        if (!GitUtil.isGitProject(basedir)) {
            throw new MojoFailureException("this project is not git");
        }

        // 创建 commit-msg文件 ${project.basedir}/.git/hooks/commit-msg
        String commitMsgHookPath = basedir.getAbsoluteFile() + File.separator + GitUtil.GIT_HOOKS_PATH + File.separator + GitUtil.COMMIT_MSG;

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

        try (FileOutputStream fos = new FileOutputStream(commitMsgHookPath,true)){
            //true表示在文件末尾追加
            fos.write("test".getBytes(StandardCharsets.UTF_8));
        } catch (IOException e ) {
            e.printStackTrace();
        }
    }
}