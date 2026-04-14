package supercomputerB;

import java.util.*;

public class WorkQueue {
    private Queue<DataSet> datasets = new LinkedList<>();

    public void updatePriority(String name, int priority) {
        if (name == null) {
            return;
        }
        for (DataSet ds : datasets) {
            if (ds == null) {
                continue;
            }
            Task t = ds.getTask();
            if (t != null && t.name != null && t.name.equals(name)) {
                t.priority = priority;
                break;
            }
        }
    }

    public void submitTask(String name, int priority, String email, DataSet datasetsObject) {
        if (name == null || email == null || datasetsObject == null) {
            return;
        }
    
        Task task = new Task();
        task.name = name;
        task.priority = priority;
        task.email = email;
    
        String data = datasetsObject.data;
        DataSet dataSet = new DataSet(data, task);
        datasets.add(dataSet);
    }

    public DataSet findNextDataset() {
        return datasets.peek();
    }

    public void computeEstimateForDataset(DataSet ds) {
        if (ds == null) {
            return;
        }
        Task t = ds.getTask();
        if (t == null || ds.data == null) {
            return;
        }
        int estimate = Math.max(1, ds.data.length()) * Math.max(1, t.priority);
        System.out.println("[Estimate] Task '" + t.name + "' (priority " + t.priority + ") estimated cost: " + estimate);
    }

    public void processDataset(DataSet ds) {
        if (ds == null) {
            return;
        }
        if (ds == datasets.peek()) {
            DataSet removed = datasets.poll();
            Task t = (removed != null) ? removed.getTask() : null;
            String taskName = (t != null ? t.name : "<unknown>");
            System.out.println("[Process] Completed processing dataset for task '" + taskName + "'.");
        }
    }
}
