package supercomputerA;

public class SupercomputerMain {
    private final WorkQueue queue = new WorkQueue();

    void handleProcessNextDataset() {
        //Has to check all datasets to find the next one
        DataSet d = queue.findNextDataset();
        if (d != null) {
            d.computeEstimate();
            d.processDataset();
        } else {
            System.out.println("No dataset");
        }
    }

    void handleSubmitTask(String name, int priority, String email, String datasets) {
        queue.submitTask(name, priority, email, datasets);
    }

    void handleUpdatePriority(String name, int priority) {
        queue.updatePriority(name, priority);
    }

    public static void main(String[] args) {
        //Main issues found in data duplication in the DataSet class
        SupercomputerMain app = new SupercomputerMain();

        //No Task class
        app.handleSubmitTask("job1", 1, "a@b", "data1");
        app.handleSubmitTask("job2", 5, "c@d", "data2");
        app.handleUpdatePriority("job1", 9);
        
        app.handleProcessNextDataset();
        app.handleProcessNextDataset();
    }
}