package com.slack.slack_project.services;

import com.slack.slack_project.data.model.Slack;
import com.slack.slack_project.dto.SlackInformationResponse;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import static com.slack.slack_project.utils.Mapper.map;

@Service
public class SlackServicesImpl implements SlackServices {

    @Override
    public SlackInformationResponse getSlackInformationServices(String slackName, String track) {
        Slack slack = new Slack();
        map(slackName, track, slack);
        SlackInformationResponse response = new SlackInformationResponse();
        map(response, slack);
        return response;
    }




}
