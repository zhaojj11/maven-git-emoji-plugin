package com.zhaojj11.plugins.util;

import org.apache.maven.plugin.descriptor.PluginDescriptor;
import org.apache.maven.plugin.logging.Log;
import org.apache.maven.project.MavenProject;

import java.io.File;

/**
 * 使用说明
 *
 * @author zhaojj11
 * @since 1.0.0
 */
public class UsageUtil {

    public static void logHelpUsage(Log log, MavenProject project, PluginDescriptor pluginDescriptor, File basedir) {
        log.info("=================================");
        log.info("plugin project " + pluginDescriptor.getGroupId() + ":" + pluginDescriptor.getArtifactId() + ":" + pluginDescriptor.getVersion());
        log.info("current project " + project.getGroupId() + ":" + project.getArtifactId() + ":" + project.getVersion());
        log.info("current project is git? " + GitUtil.isGitProject(basedir) + "(if current project is not git, you can't use this plugin)");
        log.info("=================================");
    }
}
