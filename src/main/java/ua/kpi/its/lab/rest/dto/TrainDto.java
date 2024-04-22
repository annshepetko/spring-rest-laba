package ua.kpi.its.lab.rest.dto;

import ua.kpi.its.lab.rest.entity.TrainTypes;

import java.time.LocalDateTime;
import java.util.List;

public record TrainDto(
        Integer id,
        String model,
        String producer,
        TrainTypes type,
        LocalDateTime dateOfCommissioning,
        Integer numberOfSeats,
        Double weight,
        Boolean hasConditioner,
        List<RouteDto> routeDtos
) {}