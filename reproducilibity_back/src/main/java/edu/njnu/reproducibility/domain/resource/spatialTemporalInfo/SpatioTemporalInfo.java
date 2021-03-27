package edu.njnu.reproducibility.domain.resource.spatialTemporalInfo;

import lombok.Data;

/**
 * @Author ：Zhiyi
 * @Date ：2021/3/23 15:15
 * @modified By：
 * @version: 1.0.0
 */
@Data
public class SpatioTemporalInfo {
    SpatialInfo spatialInfo;
    TemporalInfo temporalInfo;
}
