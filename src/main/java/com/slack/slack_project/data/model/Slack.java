package com.slack.slack_project.data.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.DayOfWeek;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Slack {
private String slack_name;
private String current_day;
private String utf_time;
private String track;
private String github_file_url;
private String github_repo_url;
private int status_code;

}
