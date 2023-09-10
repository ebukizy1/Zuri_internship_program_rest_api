package com.slack.slack_project.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SlackInformationResponse {
    private String slack_name;
    private String current_day;
    private String utf_time;
    private String track;
    private String github_file_url;
    private String github_repo_url;
    private int status_code;
}
