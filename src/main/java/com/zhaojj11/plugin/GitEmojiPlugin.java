package com.zhaojj11.plugin;

import org.apache.maven.model.Build;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.plugins.annotations.ResolutionScope;
import org.apache.maven.project.MavenProject;

/**
 * 插件实现类入口
 *
 * @author zhaojj11
 * @since 1.0.0
 */
@Mojo(name = "git-emoji", defaultPhase = LifecyclePhase.PREPARE_PACKAGE, requiresDependencyResolution = ResolutionScope.NONE)
public class GitEmojiPlugin extends AbstractMojo {
    @Parameter(property = "project", required = true, readonly = true)
    private MavenProject project;

    public void execute() {
        Build build = project.getBuild();
        String outputDirectory = build.getOutputDirectory();
        String sourceDirectory = build.getSourceDirectory();
        String testOutputDirectory = build.getTestOutputDirectory();
        String testSourceDirectory = build.getTestSourceDirectory();
        getLog().info("\n==========================\nProject build info:");
        String[] info = {outputDirectory, sourceDirectory, testOutputDirectory, testSourceDirectory};
        for (String item : info) {
            getLog().info("\t" + "   " + item);
        }
        getLog().info("=======================");
    }
}
