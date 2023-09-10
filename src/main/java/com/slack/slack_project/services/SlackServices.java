package com.slack.slack_project.services;

import com.slack.slack_project.data.model.Slack;
import com.slack.slack_project.dto.SlackInformationResponse;

public interface SlackServices {

   SlackInformationResponse getSlackInformationServices(String slackName, String track);

}
