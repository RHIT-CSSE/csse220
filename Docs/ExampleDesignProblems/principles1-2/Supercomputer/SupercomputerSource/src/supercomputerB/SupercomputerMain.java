package supercomputerB;

public class SupercomputerMain {
    private static final WorkQueue workQueue = new WorkQueue();

    public void handleProcessNextDataset() {
        //Just calls workQueue methods
        DataSet ds = workQueue.findNextDataset();            
        workQueue.computeEstimateForDataset(ds);            
        workQueue.processDataset(ds);                       
    }

    public void handleSubmitTask(String name, int priority, String email, DataSet datasets) {
        //Just Calls workqueue methods
        workQueue.submitTask(name, priority, email, datasets); 
    }

    public void handleUpdatePriority(String name, int priority) {
        //Just calls workqueue methods
        workQueue.updatePriority(name, priority);           
    }

    public static void main(String[] args) {
        //Calls handleSubmitTask
        SupercomputerMain controller = new SupercomputerMain();
        controller.handleSubmitTask(
            "dataset-42", 5, "owner@example.com",
            new DataSet("raw data for dataset-42", null)
        );
        
        while (workQueue.findNextDataset() != null) {
            controller.handleProcessNextDataset();
        }
    }
}
