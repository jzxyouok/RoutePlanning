package com.mim.routeplanning;

import com.baidu.mapapi.search.route.PlanNode;

/**
 * Created by mim on 2016-5-5.
 */
public class ShortestPath {

    private PlanNode[] curPlanNode;

    public ShortestPath(PlanNode locNode) {
        curPlanNode = new PlanNode[7];
        curPlanNode[0] = locNode;
        curPlanNode[1] = Constants.stNode1;
        curPlanNode[2] = Constants.enNode1;
        curPlanNode[3] = Constants.stNode2;
        curPlanNode[4] = Constants.enNode2;
        curPlanNode[5] = Constants.stNode3;
        curPlanNode[6] = Constants.enNode3;
        curPlanNode = sort();
    }

    private PlanNode[] sort() {
        return curPlanNode;
    }

    public int getCurNodeNum() {
        return curPlanNode.length;
    }

    public PlanNode[] getCurPlanNode() {
        return curPlanNode;
    }
}
