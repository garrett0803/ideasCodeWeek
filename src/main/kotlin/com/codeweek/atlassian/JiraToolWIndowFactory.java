package com.codeweek.atlassian;


import com.intellij.openapi.project.DumbAware;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import org.jetbrains.annotations.NotNull;
import javax.swing.*;
import java.awt.*;

public class JiraToolWindowFactory implements ToolWindowFactory, DumbAware {
    private static JPanel jiraPanel=new JPanel();


    @Override
    public void createToolWindowContent(@NotNull Project project,@NotNull ToolWindow toolWindow){
        JiraToolContent toolWindowContent= new JiraToolContent(toolWindow);
        Content content = ContentFactory.getInstance().createContent(JiraToolContent.getJiraPanel()
        ,"JIRA", false);
        toolWindow.getContentManager().addContent(content);
    }

    private class JiraToolContent{
        private final JPanel contentPanel= new JPanel();

        public JiraToolContent(ToolWindow toolWindow){
         contentPanel.setLayout(new BorderLayout(0,20));
        }

        public JPanel getJiraPanel(){
            return jiraPanel;
        }
    }
}
