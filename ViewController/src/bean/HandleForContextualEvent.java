package bean;

import java.util.Map;

import oracle.adf.view.rich.context.AdfFacesContext;

public class HandleForContextualEvent {
    public HandleForContextualEvent() {
        super();
    }

    public void handleNameChangeEvent(String payload) {
        AdfFacesContext adfFacesContext = AdfFacesContext.getCurrentInstance();
        Map pageFlowScope = adfFacesContext.getPageFlowScope();
        pageFlowScope.put("Name2", payload);
    }
}
