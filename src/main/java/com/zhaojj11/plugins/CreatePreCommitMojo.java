package com.zhaojj11.plugins;

import com.zhaojj11.plugins.enums.HookTypeEnum;
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

/**
 * 创建pre-commit hook
 *
 * @author zhaojj11
 * @since 1.0.0
 */
@Mojo(name = "create-pre-commit", defaultPhase = LifecyclePhase.PREPARE_PACKAGE, requiresDependencyResolution = ResolutionScope.NONE)
public class CreatePreCommitMojo extends AbstractMojo {
    @Parameter(defaultValue = "${project}", readonly = true)
    private MavenProject project;

    @Parameter(defaultValue = "${project.basedir}", readonly = true)
    private File basedir;

    @Parameter(defaultValue = "${plugin}", readonly = true)
    private PluginDescriptor pluginDescriptor;

    @Override
    public void execute() throws MojoFailureException {
        UsageUtil.logHelpUsage(getLog(), project, pluginDescriptor, basedir);

        GitUtil.createHook(HookTypeEnum.PRE_COMMIT, basedir);
    }
}
