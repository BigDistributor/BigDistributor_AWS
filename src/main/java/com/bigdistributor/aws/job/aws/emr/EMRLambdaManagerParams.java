package com.bigdistributor.aws.job.aws.emr;

import com.bigdistributor.aws.job.utils.JarParams;
import com.google.gson.Gson;

public class EMRLambdaManagerParams {
    String task;
    String name;
    String params;
    int instances;

    public EMRLambdaManagerParams(String task, String name, JarParams params, int instances) {
        this.task = task;
        this.name = name;
        this.params = params.toString();
        this.instances = instances;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}
