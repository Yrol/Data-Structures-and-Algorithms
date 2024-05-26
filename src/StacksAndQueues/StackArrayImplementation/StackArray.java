package StacksAndQueues.StackArrayImplementation;

public class StackArray {

    String[] values;
    int length = 0;

    public void add(String value) {

        if (length == 0) {
            values = new String[1];
            values[0] = value;
            length++;
            return;
        }

        String[] temp = new String[length + 1];

        // Can also be achieved by doing: System.arraycopy(values, 0, temp, 0, values.length);
        for (int i = 0; i < values.length; i++) {
            temp[i] = values[i];
        }

        temp[length] = value;
        values = temp;
        length++;
    }

    public void pop() {
        if (length <= 0) {
            values = new String[0];
            length = 0;
            return;
        }

        String[] temp = new String[length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = values[i];
        }
        values = temp;
        length--;
    }

    public void peek() {
        if (length > 0) {
            System.out.println(values[length - 1]);
            return;
        }
        System.out.println("null");
    }
}
