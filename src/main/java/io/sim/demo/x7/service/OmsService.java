package io.sim.demo.x7.service;

import io.xream.sqli.builder.Criteria;

import java.util.List;
import java.util.Map;

/**
 * @Author Sim
 */
public interface OmsService {

    List<Map<String,Object>> list(Criteria.ResultMapCriteria resultMapCriteria);
}
