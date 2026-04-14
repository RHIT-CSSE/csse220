package supercomputerB;

public class DataSet {
    public String data;
    private Task task;

    public DataSet(String data, Task task) {
        this.data = data;
        this.task = task;
    }

    public Task getTask() {
        return task;
    }
}
