package com.codeweek.atlassian;


import com.intellij.openapi.project.DumbAware;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import org.jdesktop.swingx.action.ActionManager;
import org.jetbrains.annotations.NotNull;
import org.mozilla.javascript.ast.FunctionNode;

import javax.swing.*;
import javax.tools.Tool;
import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;


public class JiraToolWindowFactory implements ToolWindowFactory, DumbAware {

    @Override
    public void createToolWindowContent(@NotNull Project project,@NotNull ToolWindow toolWindow){
        JiraToolContent toolWindowContent= new JiraToolContent(toolWindow);
        Content content = ContentFactory.getInstance().createContent(toolWindowContent.getJiraPanel()
        ,"JIRA", false);
        toolWindow.getContentManager().addContent(content);
    }

    private static class JiraToolContent{
        private final JPanel jiraPanel= new JPanel();

        public JiraToolContent(ToolWindow toolWindow){
            jiraPanel.setLayout(new BorderLayout(0, 20));
            jiraPanel.setBorder(BorderFactory.createEmptyBorder(40, 0, 0, 0));
            jiraPanel.add(createJiraPanel(toolWindow), BorderLayout.PAGE_START);

        }
        public JPanel createJiraPanel(ToolWindow toolWindow){
            JPanel jiraPanel= new JPanel();

            return jiraPanel;
        }
        public void populateJira(ToolWindow toolWindow) throws IOException {
            URL url = new URL("http://www.irapath.com");
            String query=; //Query parameters
            URLConnection c =url.openConnection();
            c.setDoOutput(true);
        }

        public  JPanel getJiraPanel(){
            return jiraPanel;
        }
    }
}
