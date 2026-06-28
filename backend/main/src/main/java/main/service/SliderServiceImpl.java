package main.service;

import lombok.RequiredArgsConstructor;
import main.dto.DataDto;
import main.repository.SliderRepo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SliderServiceImpl implements SliderService {

    private final SliderRepo sliderRepo;

    @Override
    @Cacheable(value = "static", key = "'newestSlider'")
    @Transactional(readOnly = true, timeout = 2)
    public List<DataDto> newestSlider() {
        return sliderRepo.newestSlider();
    }

    @Override
    @Cacheable(value = "static", key = "'operatingSystemSlider'")
    @Transactional(readOnly = true, timeout = 2)
    public List<DataDto> operatingSystemSlider() {
        return sliderRepo.operatingSystemSlider();
    }

    @Override
    @Transactional(readOnly = true, timeout = 2)
    @Cacheable(value = "static", key = "'languageSlider'")
    public List<DataDto> languageSlider() {
        return sliderRepo.languageSlider();
    }

    @Override
    @Transactional(readOnly = true, timeout = 2)
    @Cacheable(value = "static", key = "'jobSlider'")
    public List<DataDto> jobSlider() {
        return sliderRepo.jobSlider();
    }

    @Override
    @Transactional(readOnly = true, timeout = 2)
    @Cacheable(value = "static", key = "'aiSlider'")
    public List<DataDto> aiSlider() {
        return sliderRepo.aiSlider();
    }
}
