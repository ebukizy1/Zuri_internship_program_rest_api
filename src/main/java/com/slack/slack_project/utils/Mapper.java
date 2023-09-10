package com.slack.slack_project.utils;

import com.slack.slack_project.data.model.Slack;
import com.slack.slack_project.dto.SlackInformationResponse;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Mapper {
    public static void map(SlackInformationResponse response, Slack slack) {
        response.setSlack_name(slack.getSlack_name());
        response.setCurrent_day(slack.getCurrent_day());
        response.setUtf_time(slack.getUtf_time());
        response.setTrack(slack.getTrack());
        response.setGithub_repo_url(slack.getGithub_repo_url());
        response.setGithub_file_url(slack.getGithub_file_url());
        response.setStatus_code(slack.getStatus_code());
    }

    public static void map(String slackName, String track, Slack slack) {
        Date currentDateTime = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDateTime);
        DateFormat dateFormatter = new SimpleDateFormat("EEEE");
        String day = dateFormatter.format(currentDateTime);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SS'Z'");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String date = simpleDateFormat.format(currentDateTime);
        slack.setSlack_name(slackName);
        slack.setTrack(track);
        slack.setCurrent_day(day);
        slack.setUtf_time(date);
        slack.setGithub_repo_url("https://github.com/ebukizy1/Zuri_internship_program_rest_api.git");
        slack.setGithub_file_url("https://github.com/ebukizy1/Zuri_internship_program_rest_api/blob/main/src/main/java/com/slack/slack_project/controller/Slack_controller.java");
        slack.setStatus_code(200);
    }
}
