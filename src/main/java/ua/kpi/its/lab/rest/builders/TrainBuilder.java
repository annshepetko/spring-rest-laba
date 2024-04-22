package ua.kpi.its.lab.rest.builders;

import ua.kpi.its.lab.rest.entity.Train;

public interface TrainBuilder {

    TrainBuilderImpl builder();
    Train build();

}
