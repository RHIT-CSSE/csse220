package supercomputerA;

import java.util.ArrayList;
import java.util.List;

public class WorkQueue {
    private final List<DataSet> items = new ArrayList<>();

    void updatePriority(String name, int priority) {
        for (DataSet d : items) {
            if (name != null && name.equals(d.taskName)) {
                d.taskPriority = priority;
                break;
            }
        }
    }

    void submitTask(String name, int priority, String email, String datasets) {
        DataSet d = new DataSet();
        d.taskName = name;
        d.taskPriority = priority;
        d.taskEmail = email;
        d.data = datasets;
        items.add(d);
    }

    DataSet findNextDataset() {
        if (items.isEmpty()) return null;
        return items.remove(0);
    }
}
