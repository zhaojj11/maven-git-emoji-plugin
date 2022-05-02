package com.zhaojj11.plugins;

import com.zhaojj11.plugins.util.GitUtil;
import com.zhaojj11.plugins.util.UsageUtil;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.descriptor.PluginDescriptor;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.plugins.annotations.ResolutionScope;
import org.apache.maven.project.MavenProject;

import java.io.File;

/**
 * 插件实现类入口
 *
 * @author zhaojj11
 * @since 1.0.0
 */
@Mojo(name = "help", defaultPhase = LifecyclePhase.PREPARE_PACKAGE, requiresDependencyResolution = ResolutionScope.NONE)
public class GitEmojiHelpPlugin extends AbstractMojo {
    @Parameter(defaultValue = "${project}", readonly = true)
    private MavenProject project;

    @Parameter(defaultValue = "${project.basedir}", readonly = true)
    private File basedir;

    @Parameter( defaultValue = "${plugin}", readonly = true )
    private PluginDescriptor pluginDescriptor;

    @Override
    public void execute() {
        UsageUtil.logHelpUsage(getLog(), project, pluginDescriptor, basedir);
    }
}
