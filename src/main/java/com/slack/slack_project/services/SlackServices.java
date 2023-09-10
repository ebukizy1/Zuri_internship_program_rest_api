package com.slack.slack_project.services;

import com.slack.slack_project.data.model.Slack;
import com.slack.slack_project.dto.SlackInformationDTO;

public interface SlackServices {

   Slack getSlackInformationServices(String slackName, String track);

}
