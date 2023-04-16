package bean;

import java.io.Serializable;

import oracle.adf.controller.TaskFlowId;

public class BeanDynamicRegion implements Serializable {
    @SuppressWarnings("compatibility:6126357303156240130")
    private static final long serialVersionUID = 1L;
    private String taskFlowId = "/WEB-INF/task-flow-1.xml#task-flow-1";

    public BeanDynamicRegion() {
    }

    public TaskFlowId getDynamicTaskFlowId() {
        return TaskFlowId.parse(taskFlowId);
    }

    public void setDynamicTaskFlowId(String taskFlowId) {
        this.taskFlowId = taskFlowId;
    }

    public String taskflow1() {
        setDynamicTaskFlowId("/WEB-INF/task-flow-1.xml#task-flow-1");
        return null;
    }

    public String taskflow2() {
        setDynamicTaskFlowId("/WEB-INF/task-flow-2.xml#task-flow-2");
        return null;
    }
}
