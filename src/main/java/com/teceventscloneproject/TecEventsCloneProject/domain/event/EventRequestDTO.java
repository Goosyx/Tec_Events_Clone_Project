package com.teceventscloneproject.TecEventsCloneProject.domain.event;

import lombok.Builder;
import org.springframework.web.multipart.MultipartFile;


@Builder
public record EventRequestDTO(String title, String description, Long date, String city, String state, Boolean remote, String eventUrl, MultipartFile image) {

}
