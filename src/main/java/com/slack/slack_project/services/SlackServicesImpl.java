package com.slack.slack_project.services;

import com.slack.slack_project.data.model.Slack;
import com.slack.slack_project.dto.SlackInformationDTO;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

@Service
public class SlackServicesImpl implements SlackServices {




    @Override
    public Slack getSlackInformationServices(String slackName, String track) {
        Slack slack = new Slack();

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
//        slack.setGithub_file_url();
        slack.setStatus_code(200);
        return slack;
    }



}
