package com.mim.routeplanning;

import com.baidu.mapapi.search.route.PlanNode;

/**
 * Created by mim on 2016/3/5.
 */
public class Constants {

    public static final String TAG = "com.mim.routeplanning";
    public static final int MAX_ZOOM = 21;
    public static final int MIN_ZOOM = 3;
    public static final PlanNode stNode1 = PlanNode.withCityNameAndPlaceName("北京", "世纪金源购物中心");
    public static final PlanNode enNode1 = PlanNode.withCityNameAndPlaceName("北京", "蓝靛厂时雨园西门");
    public static final PlanNode stNode2 = PlanNode.withCityNameAndPlaceName("北京", "蓝靛厂清真寺");
    public static final PlanNode enNode2 = PlanNode.withCityNameAndPlaceName("北京", "长春桥-地铁站");
    public static final PlanNode stNode3 = PlanNode.withCityNameAndPlaceName("北京", "云莲轩茶艺馆");
    public static final PlanNode enNode3 = PlanNode.withCityNameAndPlaceName("北京", "蓝靛厂春荫园");

}
