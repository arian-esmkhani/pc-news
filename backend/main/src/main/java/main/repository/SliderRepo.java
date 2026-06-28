package main.repository;

import main.dto.DataDto;

import java.util.List;

public interface SliderRepo {
    List<DataDto> newestSlider();
    List<DataDto> operatingSystemSlider();
    List<DataDto> languageSlider();
    List<DataDto> jobSlider();
    List<DataDto> aiSlider();
}
