package com.slack.slack_project.controller;

import com.slack.slack_project.data.model.Slack;
import com.slack.slack_project.dto.SlackInformationResponse;
import com.slack.slack_project.services.SlackServicesImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Slack_controller {

    private SlackServicesImpl slackServices;

    public Slack_controller(SlackServicesImpl slackServices) {
        this.slackServices = slackServices;
    }
    @RequestMapping(value = "/api", method = RequestMethod.GET)
    public ResponseEntity<SlackInformationResponse> slackEndPoint(@RequestParam String slack_name, @RequestParam String track){
        SlackInformationResponse slack = slackServices.getSlackInformationServices(slack_name, track);
        return new ResponseEntity<>(slack, HttpStatus.OK);
    }

}
