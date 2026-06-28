package main.controller;

import lombok.RequiredArgsConstructor;
import main.dto.DataDto;
import main.service.SliderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/slider")
@RequiredArgsConstructor
public class SliderController {

    private final SliderService sliderService;

    @GetMapping("/newest")
    public List<DataDto> newestSlider() {
        return sliderService.newestSlider();
    }

    @GetMapping("/system")
    public List<DataDto> operatingSystemSlider() {
        return sliderService.operatingSystemSlider();
    }

    @GetMapping("/language")
    public List<DataDto> languageSlider() {
        return sliderService.languageSlider();
    }

    @GetMapping("/job")
    public List<DataDto> jobSlider() {
        return sliderService.jobSlider();
    }

    @GetMapping("/ai")
    public List<DataDto> aiSlider() {
        return sliderService.aiSlider();
    }
}
